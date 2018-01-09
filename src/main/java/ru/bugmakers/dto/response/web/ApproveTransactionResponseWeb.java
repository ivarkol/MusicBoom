package ru.bugmakers.dto.response.web;

import ru.bugmakers.enums.RsStatus;
import ru.bugmakers.exceptions.MbException;

/**
 * Created by Ayrat on 26.12.2017.
 */
public class ApproveTransactionResponseWeb extends MbResponseToWeb {
    public ApproveTransactionResponseWeb(MbException e, RsStatus status) {
        super(e, status);
    }

    public ApproveTransactionResponseWeb(RsStatus status) {
        super(status);
    }
}
