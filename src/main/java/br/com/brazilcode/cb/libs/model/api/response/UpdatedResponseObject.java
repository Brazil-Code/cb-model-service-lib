package br.com.brazilcode.cb.libs.model.api.response;

import static br.com.brazilcode.cb.libs.constants.ApiResponseConstants.UPDATED_RESPONSE;

import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;

/**
 * Class responsible to map a return object to APIs that perform update operations (if successful).
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 25, 2020 11:37:35 PM
 * @version 2.0
 */
@Getter
@Setter
public class UpdatedResponseObject {

	private String httpStatus = "200";
	private Long idUpdated;
	private String description = UPDATED_RESPONSE;
	private Calendar date = Calendar.getInstance();

	public UpdatedResponseObject(Long idUpdated) {
		super();
		this.idUpdated = idUpdated;
	}

}
