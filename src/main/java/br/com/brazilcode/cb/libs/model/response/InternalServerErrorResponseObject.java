package br.com.brazilcode.cb.libs.model.response;

import static br.com.brazilcode.cb.libs.constants.ApiResponseConstants.INTERNAL_SERVER_ERROR_RESPONSE;

import java.util.Calendar;;

/**
 * Classe responsável por mapear um objeto de retorno para APIs caso ocorra um erro interno.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 17 de mar de 2020 09:59:31
 * @version 1.0
 */
public class InternalServerErrorResponseObject {

	private String httpStatus = "500";
	private String description = INTERNAL_SERVER_ERROR_RESPONSE;
	private Calendar date = Calendar.getInstance();

	public String getHttpStatus() {
		return httpStatus;
	}

	public String getDescription() {
		return description;
	}

	public Calendar getDate() {
		return date;
	}

}
