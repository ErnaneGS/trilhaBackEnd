package trilha.back.financys.adapters.exceptions.handle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import trilha.back.financys.adapters.exceptions.CalculaMediaExceptions;
import trilha.back.financys.adapters.exceptions.ListaVaziaExceptions;
import trilha.back.financys.core.exceptions.CategoryNotFoundExceptions;
import trilha.back.financys.core.exceptions.EntryNotFoundException;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(CalculaMediaExceptions.class)
    public ResponseEntity<DefaultException> handle(CalculaMediaExceptions e ) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem("Impossível realizar a divisão por zero");
        defaultException.setStatus(HttpStatus.BAD_REQUEST.value());
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
    public ResponseEntity<DefaultException> handle( HttpMessageNotReadableException  e ) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem("Erro de análise no JSON");
        defaultException.setStatus(HttpStatus.BAD_REQUEST.value());
        defaultException.setDataHoraAtual( LocalDateTime.now() );
        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<DefaultException> handle( MethodArgumentTypeMismatchException  e ) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem("Falha na conversão do tipo do valor. Verifique seus parâmetros de entrada.");
        defaultException.setStatus(HttpStatus.BAD_REQUEST.value());
        defaultException.setDataHoraAtual( LocalDateTime.now() );
        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(CategoryNotFoundExceptions.class)
    public ResponseEntity<DefaultException> handle(CategoryNotFoundExceptions e ) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem(e.getLocalizedMessage());
        defaultException.setStatus(HttpStatus.NOT_FOUND.value());
        defaultException.setDataHoraAtual( LocalDateTime.now() );
        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(EntryNotFoundException.class)
    public ResponseEntity<DefaultException> handle(EntryNotFoundException e ) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem(e.getLocalizedMessage());
        defaultException.setStatus(HttpStatus.NOT_FOUND.value());
        defaultException.setDataHoraAtual( LocalDateTime.now() );
        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(ListaVaziaExceptions.class)
    public ResponseEntity<DefaultException> handle(ListaVaziaExceptions e ) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem(e.getLocalizedMessage());
        defaultException.setStatus(HttpStatus.NO_CONTENT.value());
        defaultException.setDataHoraAtual( LocalDateTime.now() );
        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

}
