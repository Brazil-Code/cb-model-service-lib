package br.com.brazilcode.cb.libs.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Classe utilitária para formatação de datas.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 21 de fev de 2020 08:39:54
 * @version 1.0
 */
public class DateUtil {

	private static final String PATTERN_YYYYMMDD = "yyyyMMdd";
	private static final String PATTERN_DDMMYYYY = "ddMMyyyy";
	private static final DateTimeFormatter FORMATTER_YYYYMMDD = DateTimeFormatter.ofPattern(PATTERN_YYYYMMDD);
	private static final DateTimeFormatter FORMATTER_DDMMYYYY = DateTimeFormatter.ofPattern(PATTERN_DDMMYYYY);

	/**
	 * Método responsável por converter um objeto do tipo LocalDate para Date.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param localDate
	 * @return
	 */
	public static Date toDate(LocalDate localDate) {
		Date returnDate = null;
		if (localDate != null) {
			returnDate = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		}

		return returnDate;
	}

	/**
	 * Método responsável por converter um objeto do tipo Date para LocalDate.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param date
	 * @return
	 */
	public static LocalDate toLocalDate(Date date) {
		LocalDate returnDate = null;
		if (date != null) {
			returnDate = Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
		}

		return returnDate;
	}

	/**
	 * Método responsável por converter um objeto do tipo Date em String com o seguite pattern: 'yyyyMMdd'.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param date
	 * @return
	 */
	public static String convertDateToStringPatternYyyyMmDd(Date date) {
		String returnDate = null;
		if (date != null) {
			returnDate = toLocalDate(date).format(FORMATTER_YYYYMMDD);
		}

		return returnDate;
	}

	/**
	 * Método responsável por converter um objeto do tipo Date em String com o seguite pattern: 'ddMMyyyy'.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param date
	 * @return
	 */
	public static String convertDateToStringPatternDdMmYyyy(Date date) {
		String returnDate = null;
		if (date != null) {
			returnDate = toLocalDate(date).format(FORMATTER_DDMMYYYY);
		}

		return returnDate;
	}

	/**
	 * Método responsável por retornar um objeto do tipo Date com a data atual.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @return
	 */
	public static Date getDateNow() {
		return Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
	}

}
