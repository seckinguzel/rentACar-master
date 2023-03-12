package kodlama.io.rentACar.core.utilities.exceptions;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message); //"super" is "RuntimeException" in this class. "super" sends the message to the "RuntimeException". "super" is a base class.
    }
}
