package ru.skypro;

public class NothingToAddException extends RuntimeException {
    public NothingToAddException() {
    }

    public NothingToAddException(String message) {
        super(message);
    }

    public NothingToAddException(String message, Throwable cause) {
        super(message, cause);
    }

    public NothingToAddException(Throwable cause) {
        super(cause);
    }

    public NothingToAddException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
