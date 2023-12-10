package com.saidurraahmaan.peoplePilot.domain.exceptions;

public enum ErrorCode {

    InternalServerError(999);
    public final int value;

    private ErrorCode(int value) {
        this.value = value;
    }
}
