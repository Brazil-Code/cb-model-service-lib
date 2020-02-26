package br.com.brazilcode.cb.libs.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Classe utilitária para validação de objetos e strings.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 21 de fev de 2020 08:47:57
 * @version 1.0
 */
public class ValidationUtil {

	/**
	 * Método responsável por verificar se a string informada possui valor numérico.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param texto
	 * @return
	 */
	public static boolean isNumber(String texto) {
		return StringUtils.isNumeric(texto);
	}

	/**
	 * Método responsável por verificar se uma string está vazia.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param texto
	 * @return
	 */
	public static boolean isBlank(String texto) {
		return StringUtils.isBlank(texto);
	}

	/**
	 * Método responsável por verificar se uma string está diferente de vazia.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param texto
	 * @return
	 */
	public static boolean isNotBlank(String texto) {
		return !isBlank(texto);
	}

	/**
	 * Método responsável por verificar se o objeto informado está nulo.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param object
	 * @return
	 */
	public static boolean isNull(Object object) {
		return object == null;
	}

	/**
	 * Método responsável por verificar se o objeto informado está diferente de nulo.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param object
	 * @return
	 */
	public static boolean isNotNull(Object object) {
		return !isNull(object);
	}

}
