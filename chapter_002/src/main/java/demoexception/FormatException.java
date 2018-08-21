package demoexception;

import java.io.IOException;

public class FormatException extends IOException {
    public FormatException() {
    }

    public FormatException(String message) {
        super(message);
    }
}
