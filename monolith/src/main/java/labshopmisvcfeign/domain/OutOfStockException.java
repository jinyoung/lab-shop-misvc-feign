package labshopmisvcfeign.domain;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@ResponseStatus(code = HttpStatus.INSUFFICIENT_STORAGE, reason="OutOfStockException")
public class OutOfStockException extends RuntimeException{

    public OutOfStockException() {
        super("OutOfStockException");
        
    }
}