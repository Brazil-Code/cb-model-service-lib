package br.com.brazilcode.cb.libs.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * Class responsible to configure an personalized Base Exception.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 26, 2020 12:00:27 AM
 * @version 1.1
 */
@Getter
@Setter
public class BaseException extends Exception {

	private static final long serialVersionUID = 1875180635321082742L;

	private String errorCode = "-";
	private String message;
	private String instruction = "Please contact support staff!";

	public BaseException(String errorCode, String message, String instruction) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.instruction = instruction;
	}

	public BaseException(String message) {
		super();
		this.message = message;
	}

	public BaseException() {
		super();
	}

}
