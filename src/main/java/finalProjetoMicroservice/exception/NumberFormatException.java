package finalProjetoMicroservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NumberFormatException extends RuntimeException {

    public NumberFormatException(String message) {
        super(message);
    }
}

