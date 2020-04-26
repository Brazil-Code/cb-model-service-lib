package br.com.brazilcode.cb.libs.dto;

import java.io.Serializable;

import br.com.brazilcode.cb.libs.model.Log;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Data Transfer Object class for {@link Log}.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 26, 2020 12:43:27 AM
 * @version 1.0
 */
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LogDTO implements Serializable {

	private static final long serialVersionUID = -2034350004364829160L;

	@ApiModelProperty(value = "Creation User ID")
	private Long user;

	@ApiModelProperty(value = "Log's description")
	private String description;

}
