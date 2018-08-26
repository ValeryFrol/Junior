package tracker;

public class MenuOutException extends RuntimeException {
String messageException;

    public MenuOutException(String messageException) {
        super(messageException);
        this.messageException = messageException;
    }
}
