package com.saidurraahmaan.peoplePilot.web.viewmodel;

public class ErrorDetail {
    public final int code;
    public final String messageBangla;
    public final String messageEnglish;

    public ErrorDetail(int code, String messageBangla, String messageEnglish)
    {
        this.code = code;
        this.messageBangla = messageBangla;
        this.messageEnglish = messageEnglish;
    }
}
