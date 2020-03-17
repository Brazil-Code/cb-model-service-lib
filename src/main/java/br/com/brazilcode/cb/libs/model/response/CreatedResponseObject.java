package br.com.brazilcode.cb.libs.model.response;

import static br.com.brazilcode.cb.libs.constants.ApiResponseConstants.*;

import java.util.Calendar;

/**
 * Classe responsável por mapear um objeto de retorno para APIs que realizam operações de cadastro (caso ocorra com sucesso).
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 17 de mar de 2020 09:51:06
 * @version 1.0
 */
public class CreatedResponseObject {

	private String httpStatus = "201";
	private Long idCreated;
	private String description = CREATED_RESPONSE;
	private Calendar date = Calendar.getInstance();

	public CreatedResponseObject(Long idCreated) {
		super();
		this.idCreated = idCreated;
	}

	public Long getIdCreated() {
		return idCreated;
	}

	public void setIdCreated(Long idCreated) {
		this.idCreated = idCreated;
	}

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
