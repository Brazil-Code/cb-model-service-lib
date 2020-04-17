package br.com.brazilcode.cb.libs.dto;

import br.com.brazilcode.cb.libs.model.Log;
import io.swagger.annotations.ApiModelProperty;

/**
 * Classe de Data Transfer Object para {@link Log}.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 11 de mar de 2020 23:53:45
 * @version 1.0
 */
public class LogDTO {

	@ApiModelProperty(value = "Creation User ID")
	private Long user;

	@ApiModelProperty(value = "Log's description")
	private String description;

	public LogDTO(Long user, String description) {
		super();
		this.user = user;
		this.description = description;
	}

	public LogDTO() {
		super();
	}

	public Long getUser() {
		return user;
	}

	public void setUser(Long user) {
		this.user = user;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
