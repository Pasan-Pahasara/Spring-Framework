package lk.ijse.spring.advisor;

import lk.ijse.spring.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : ShEnUx
 * @time : 10:09 PM
 * @date : 2/5/2023
 * @since : 0.1.0
 **/
//Exception එකක් ආවොත් විතරයි මේක වැඩ කරන්නේ.
//මේකට AppWideExceptionHandler කියන්න හේතුව තමයි Application එකේම Exception handle කරන්නේ.
@RestControllerAdvice
@CrossOrigin
//advisor ල කරන්නේ එයාට task එකක් දුන්නම එයා ඒ task එක දිහා බලන් ඉදල මොකක් හරි දෙයක් උනොත් ඒ අදාල method එක Exception Handler එක run කරනවා.
public class AppWideExceptionHandler {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({RuntimeException.class})
    public ResponseUtil handleMyExceptions(RuntimeException e) {
        System.out.println(e.getMessage());
        return new ResponseUtil("Error", e.getMessage(), null);
    }
}
