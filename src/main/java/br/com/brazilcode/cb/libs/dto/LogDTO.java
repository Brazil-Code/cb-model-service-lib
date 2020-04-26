package br.com.brazilcode.cb.libs.dto;

import java.io.Serializable;

import br.com.brazilcode.cb.libs.model.Log;
import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

/**
 * Data Transfer Object class for {@link Log}.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 26, 2020 12:43:27 AM
 * @version 1.0
 */
@ToString
public class LogDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2034350004364829160L;

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
