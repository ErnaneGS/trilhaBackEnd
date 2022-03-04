package trilha.back.financys.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

@ControllerAdvice
public class EzceptionHandle {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<DefaultException> handlde(NoSuchElementException e ) {
        DefaultException defaultException = new DefaultException();

        defaultException.setMensagem( "Objeto não encontrado com o id informado" );
        defaultException.setStatus(HttpStatus.NOT_FOUND.value());
        defaultException.setDataHoraAtual( LocalDateTime.now() );

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

}
