package br.com.brazilcode.cb.libs.enumerator;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Class responsible for enumerating the descriptions of the types of activities for recording the Audit LOG.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 26, 2020 12:39:50 AM
 * @version 1.0
 */
@Getter
@AllArgsConstructor
public enum LogActivityTypeEnum {

	CREATE("CADASTROU"),
	SEARCH("BUSCOU"),
	DELETE("DELETOU"),
	UPDATE("ATUALIZOU"),
	LOG_IN("EFETUOU LOG IN"),
	LOG_OUT("EFETUOU LOG OUT");

	private String description;

}
