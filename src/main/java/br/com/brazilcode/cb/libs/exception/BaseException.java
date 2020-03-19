package br.com.brazilcode.cb.libs.exception;

/**
 * Classe responsável por configurar uma exceção personalizada para Base.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 25 de fev de 2020 16:11:41
 * @version 1.0
 */
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

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

}
