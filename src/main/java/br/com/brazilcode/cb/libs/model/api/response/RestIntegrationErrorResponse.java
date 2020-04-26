package br.com.brazilcode.cb.libs.model.api.response;

import static br.com.brazilcode.cb.libs.constants.ApiResponseConstants.REST_INTEGRATION_ERROR;

import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;

/**
 * Class responsible to map an object to APIs if an error occurs during a communication with an external REST API.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 25, 2020 11:35:31 PM
 * @version 1.0
 */
@Getter
@Setter
public class RestIntegrationErrorResponse {

	private String httpStatus = "500";
	private String description = REST_INTEGRATION_ERROR;
	private Calendar date = Calendar.getInstance();

}
