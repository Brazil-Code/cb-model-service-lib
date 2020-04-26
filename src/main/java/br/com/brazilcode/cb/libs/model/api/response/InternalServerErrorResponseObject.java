package br.com.brazilcode.cb.libs.model.api.response;

import static br.com.brazilcode.cb.libs.constants.ApiResponseConstants.INTERNAL_SERVER_ERROR_RESPONSE;

import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;;

/**
 * Class responsible to map map an API's return object (in case of internal error).
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 25, 2020 11:34:33 PM
 * @version 2.0
 */
@Getter
@Setter
public class InternalServerErrorResponseObject {

	private String httpStatus = "500";
	private String description = INTERNAL_SERVER_ERROR_RESPONSE;
	private Calendar date = Calendar.getInstance();

}
