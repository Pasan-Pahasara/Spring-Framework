package lk.ijse.spring.advisor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : ShEnUx
 * @time : 10:09 PM
 * @date : 2/5/2023
 * @since : 0.1.0
 **/
//මේකට AppWideExceptionHandler කියන්න හේතුව තමයි Application එකේම Exception handle කරන්නේ.
@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {
    @ExceptionHandler({RuntimeException.class})
    public void handleMyExceptions(RuntimeException e) {
        System.out.println(e.getMessage());
    }
}
