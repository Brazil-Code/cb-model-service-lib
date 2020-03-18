package br.com.brazilcode.cb.libs.model.api.response;

import static br.com.brazilcode.cb.libs.constants.ApiResponseConstants.REST_INTEGRATION_ERROR;

import java.util.Calendar;

/**
 * Classe responsável por mapear um objeto de retorno para APIs caso ocorra um erro durante a comunicação com alguma API REST
 * externa.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 17 de mar de 2020 23:22:42
 * @version 1.0
 */
public class RestIntegrationErrorResponse {

	private String httpStatus = "500";
	private String description = REST_INTEGRATION_ERROR;
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
