package com.example.identity_service.exception;

public enum ErrorCode {
    USER_EXISTED(1002, "User already exists"),
    KEY_INVALID(1001, "Invalid message key"),
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    USERNAME_INVALID(1003, "Username must be at least 3 characters"),
    PASSWORD_INVALID(1004, "Password must be at least 8 characters"),
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
