package br.com.brazilcode.cb.libs.model.api.response;

import static br.com.brazilcode.cb.libs.constants.ApiResponseConstants.*;

import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;

/**
 * Classe responsável por mapear um objeto de retorno para APIs que realizam operações de cadastro (caso ocorra com sucesso).
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 17 de mar de 2020 09:51:06
 * @version 1.0
 */
/**
 * Class responsible to map an return object to APIs that perform registration operations (if successful).
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 25, 2020 11:32:16 PM
 * @version 2.0
 */
@Getter
@Setter
public class CreatedResponseObject {

	private String httpStatus = "201";
	private Long idCreated;
	private String description = CREATED_RESPONSE;
	private Calendar date = Calendar.getInstance();

	public CreatedResponseObject(Long idCreated) {
		super();
		this.idCreated = idCreated;
	}

}
