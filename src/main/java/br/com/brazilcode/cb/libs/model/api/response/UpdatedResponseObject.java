package br.com.brazilcode.cb.libs.model.api.response;

import static br.com.brazilcode.cb.libs.constants.ApiResponseConstants.UPDATED_RESPONSE;

import java.util.Calendar;

/**
 * Classe responsável por mapear um objeto de retorno para APIs que realizam operações de atualização (caso ocorra com sucesso).
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 29 de mar de 2020 14:36:10
 * @version 1.0
 */
public class UpdatedResponseObject {

	private String httpStatus = "200";
	private Long idUpdated;
	private String description = UPDATED_RESPONSE;
	private Calendar date = Calendar.getInstance();

	public UpdatedResponseObject(Long idUpdated) {
		super();
		this.idUpdated = idUpdated;
	}

	public String getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(String httpStatus) {
		this.httpStatus = httpStatus;
	}

	public Long getIdUpdated() {
		return idUpdated;
	}

	public void setIdUpdated(Long idUpdated) {
		this.idUpdated = idUpdated;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

}
