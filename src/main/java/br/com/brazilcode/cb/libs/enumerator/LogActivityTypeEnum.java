package br.com.brazilcode.cb.libs.enumerator;

/**
 * Classe responsável por enumerar as descrições dos tipos de atividade para gravação de LOG de Auditoria.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 19 de mar de 2020 01:16:58
 * @version 1.0
 */
public enum LogActivityTypeEnum {

	CREATE("CREATED"),
	SEARCH("SEARCHED"),
	DELETE("DELETED"),
	UPDATE("UPDATED"),
	LOG_IN("LOGED IN"),
	LOG_OUT("LOGED OUT");

	private String description;

	private LogActivityTypeEnum(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
