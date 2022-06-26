package com.belajar.auth.BelajarAuthJWT.exceptions;

public class ValidationExeption extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private String msg;

    public void ValidationException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
