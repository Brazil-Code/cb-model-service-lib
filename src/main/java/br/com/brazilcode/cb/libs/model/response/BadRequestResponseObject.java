package br.com.brazilcode.cb.libs.model.response;

import java.util.Calendar;

/**
 * Classe responsável por mapear um objeto de retorno para APIs (caso ocorra um BadRequest).
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 17 de mar de 2020 09:55:24
 * @version 1.0
 */
public class BadRequestResponseObject {

	private String httpStatus = "400";
	private String description;
	private Calendar date = Calendar.getInstance();

	public BadRequestResponseObject(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHttpStatus() {
		return httpStatus;
	}

	public Calendar getDate() {
		return date;
	}

}
