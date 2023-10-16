package pro.sky.mikhaillukichevcalculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivideByZeroException extends IllegalArgumentException{
    public DivideByZeroException() {
    }

    public DivideByZeroException(String message) {
        super(message);
        System.out.println(message);
    }
}
