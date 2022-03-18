package trilha.back.financys.exceptions.handle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import trilha.back.financys.exceptions.CalculaMediaExceptions;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(CalculaMediaExceptions.class)
    public ResponseEntity<DefaultException> handle(CalculaMediaExceptions e ) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem("Impossível realizar a divisão por zero");
        defaultException.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        defaultException.setDataHoraAtual(LocalDateTime.now());
        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<DefaultException> handle(NoSuchElementException e ) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem(e.getLocalizedMessage());
        defaultException.setStatus(HttpStatus.NOT_FOUND.value());
        defaultException.setDataHoraAtual(LocalDateTime.now());
        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<DefaultException> handle(MethodArgumentNotValidException e ) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem(e.getBindingResult().getAllErrors().stream().findFirst().get().getDefaultMessage());
        defaultException.setStatus(HttpStatus.BAD_REQUEST.value());
        defaultException.setDataHoraAtual(LocalDateTime.now());
        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<DefaultException> handlde( HttpMessageNotReadableException  e ) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem("Erro de análise no JSON");
        defaultException.setStatus(HttpStatus.BAD_REQUEST.value());
        defaultException.setDataHoraAtual( LocalDateTime.now() );
        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<DefaultException> handlde( MethodArgumentTypeMismatchException  e ) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem("Falha na conversão do tipo do valor");
        defaultException.setStatus(HttpStatus.BAD_REQUEST.value());
        defaultException.setDataHoraAtual( LocalDateTime.now() );
        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

}
