package ru.bugmakers.controller.common.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.bugmakers.controller.MbController;
import ru.bugmakers.dto.common.UserDTO;
import ru.bugmakers.dto.request.RegistrationRequest;
import ru.bugmakers.dto.response.MbResponse;
import ru.bugmakers.dto.response.RegistrationResponse;
import ru.bugmakers.enums.RsStatus;
import ru.bugmakers.enums.SocialProvider;
import ru.bugmakers.enums.UserType;
import ru.bugmakers.exceptions.MbError;
import ru.bugmakers.exceptions.MbException;
import ru.bugmakers.service.EmailConfirmationService;
import ru.bugmakers.validator.common.RegistrationRequestValidator;

/**
 * Created by Ivan
 */
@RestController
@RequestMapping("/registration")
public class    RegistrationController extends MbController {

    private RegistrationRequestValidator registrationRequestValidator;
    private RegistratorCreator registratorCreator;

    @Autowired
    public void setRegistrationRequestValidator(RegistrationRequestValidator registrationRequestValidator) {
        this.registrationRequestValidator = registrationRequestValidator;
    }

    @Autowired
    public void setRegistratorCreator(RegistratorCreator registratorCreator) {
        this.registratorCreator = registratorCreator;
    }

    @PostMapping(params = "user_type")
    public ResponseEntity<MbResponse> register(@RequestBody RegistrationRequest registrationRequest,
                                               @RequestParam("user_type") String userType) {
        RegistrationResponse registrationResponse;
        try {
            registrationRequestValidator.validate(registrationRequest);
            Registrator registrator = registratorCreator.getRegistrator();
            UserDTO user = registrator.register(UserType.valueOf(userType.toUpperCase()), registrationRequest.getUser());
            registrationResponse = new RegistrationResponse(RsStatus.SUCCESS);
            registrationResponse.setUser(user);
        } catch (MbException e) {
            registrationResponse = new RegistrationResponse(e);
        } catch (Exception e) {
            registrationResponse = new RegistrationResponse(MbException.create(MbError.RGE08), RsStatus.ERROR);
        }
        return ResponseEntity.ok(registrationResponse);
    }

    @PostMapping(params = {"provider", "user_type"})
    public ResponseEntity<MbResponse> socialRegister(@RequestBody RegistrationRequest registrationRequest,
                                                     @RequestParam("user_type") String userType,
                                                     @RequestParam("provider") String provider) {
        RegistrationResponse registrationResponse;
        try {
            registrationRequestValidator.validate(registrationRequest);
            Registrator registrator = registratorCreator.getRegistrator(SocialProvider.valueOf(provider.toUpperCase()));
            UserDTO user = registrator.register(UserType.valueOf(userType.toUpperCase()), registrationRequest.getUser());
            registrationResponse = new RegistrationResponse(RsStatus.SUCCESS);
            registrationResponse.setUser(user);
            if (user.getEmail() != null) {
                //TODO отправить емайл
            }
        } catch (MbException e) {
            registrationResponse = new RegistrationResponse(e);
        } catch (Exception e) {
            registrationResponse = new RegistrationResponse(MbException.create(MbError.RGE08), RsStatus.ERROR);
        }
        return ResponseEntity.ok(registrationResponse);
    }

    @GetMapping(value = "/{uuid}")
    public ResponseEntity<MbResponse> emailCheck(@PathVariable String uuid,
                                                 @RequestParam("user_id") String userId) {
        return ResponseEntity.ok(new MbResponse(RsStatus.SUCCESS));
    }

}