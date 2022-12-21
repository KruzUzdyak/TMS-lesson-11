package lesson;

public class ThirdCheckedException extends SecondCheckedException {

    public ThirdCheckedException() {
    }

    public ThirdCheckedException(String message) {
        super(message);
    }

    public ThirdCheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public ThirdCheckedException(Throwable cause) {
        super(cause);
    }

    public ThirdCheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
