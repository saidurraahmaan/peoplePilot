package com.saidurraahmaan.peoplePilot.domain.exceptions;

public class RepositoryException {
    public final Object[] args;
    public final ErrorCode errorCode;

    public RepositoryException(ErrorCode errorCode, Object... args) {
        this.errorCode = errorCode;
        this.args = args;
    }

    @Override
    public String toString() {
        return "%s(%d)".formatted(errorCode, errorCode.value);
    }
}
