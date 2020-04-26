package br.com.brazilcode.cb.libs.enumerator;

/**
 * Class responsible for enumerating the descriptions of the types of activities for recording the Audit LOG.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 26, 2020 12:39:50 AM
 * @version 1.0
 */
public enum LogActivityTypeEnum {

	CREATE("CADASTROU"),
	SEARCH("BUSCOU"),
	DELETE("DELETOU"),
	UPDATE("ATUALIZOU"),
	LOG_IN("EFETUOU LOG IN"),
	LOG_OUT("EFETUOU LOG OUT");

	private String description;

	private LogActivityTypeEnum(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
