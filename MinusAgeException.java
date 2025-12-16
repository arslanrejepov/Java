public class MinusAgeException extends Exception {
    public MinusAgeException() {
        super("Age cannot be negative.");
    }

    public MinusAgeException(String message) {
        super(message);
    }
}
