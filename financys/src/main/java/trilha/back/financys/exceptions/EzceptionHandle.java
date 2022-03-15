package trilha.back.financys.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.HttpClientErrorException;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

@ControllerAdvice
public class EzceptionHandle {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<DefaultException> handle(NoSuchElementException e ) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem(e.getLocalizedMessage());
        defaultException.setStatus(HttpStatus.NOT_FOUND.value());
        defaultException.setDataHoraAtual( LocalDateTime.now() );
        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<DefaultException> handle(RuntimeException e ) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem(e.getLocalizedMessage());
        defaultException.setStatus(HttpStatus.BAD_REQUEST.value());
        defaultException.setDataHoraAtual(LocalDateTime.now());
        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

}
