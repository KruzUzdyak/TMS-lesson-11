package lesson;

public class SecondCheckedException extends CheckedException {

    public SecondCheckedException() {
    }

    public SecondCheckedException(String message) {
        super(message);
    }

    public SecondCheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public SecondCheckedException(Throwable cause) {
        super(cause);
    }

    public SecondCheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
