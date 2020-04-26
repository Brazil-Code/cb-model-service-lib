package br.com.brazilcode.cb.libs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Class responsible to configure an Exception for Resources Not Found that will be thrown in Runtime.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 25, 2020 11:59:07 PM
 * @version 1.1
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String message) {
		super(message);
	}

}
