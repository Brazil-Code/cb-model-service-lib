package br.com.brazilcode.cb.libs.model.api.response;

import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;

/**
 * Class responsible to map an API's return object (in case of BadRequest).
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 25, 2020 11:30:42 PM
 * @version 2.0
 */
@Getter
@Setter
public class BadRequestResponseObject {

	private String httpStatus = "400";
	private String description;
	private Calendar date = Calendar.getInstance();

	public BadRequestResponseObject(String description) {
		super();
		this.description = description;
	}

}
