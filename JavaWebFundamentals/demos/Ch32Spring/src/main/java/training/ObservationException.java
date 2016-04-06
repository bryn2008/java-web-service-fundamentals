package training;

@SuppressWarnings("serial")
public class ObservationException extends RuntimeException {
    public ObservationException(String message, Object... args) {
        super(String.format(message, args));
    }

    public ObservationException(Exception cause, String message, Object... args) {
        super(String.format(message, args), cause);
    }
}

