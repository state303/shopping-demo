package io.dsub.shoppingdemo.exception;

public class UserAlreadyExistsException extends RuntimeException {
    // todo: take email
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
