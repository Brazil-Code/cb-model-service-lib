package br.com.brazilcode.cb.libs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Classe responsável por configurar uma Exception para RecursoNaoEncontrado que será lançada em Runtime.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 20 de fev de 2020 21:12:53
 * @version 1.0
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String message) {
		super(message);
	}

}
