package br.com.brazilcode.cb.libs.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Utility class for custom data formatting.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 26, 2020 12:22:36 AM
 * @version 1.0
 */
public class DateUtil {

	private static final String PATTERN_YYYYMMDD = "yyyyMMdd";
	private static final String PATTERN_DDMMYYYY = "ddMMyyyy";
	private static final DateTimeFormatter FORMATTER_YYYYMMDD = DateTimeFormatter.ofPattern(PATTERN_YYYYMMDD);
	private static final DateTimeFormatter FORMATTER_DDMMYYYY = DateTimeFormatter.ofPattern(PATTERN_DDMMYYYY);

	/**
	 * Method responsible for converting a {@link LocalDate} object into {@link Date}.
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
	 * Method responsible for converting a {@link Date} object into {@link LocalDate}.
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
	 * Method responsible for converting a {@link Date} object into a {@link String} with the pattern: 'yyyyMMdd'.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param date
	 * @return 'yyyyMMdd'
	 */
	public static String convertDateToStringPatternYyyyMmDd(Date date) {
		String returnDate = null;
		if (date != null) {
			returnDate = toLocalDate(date).format(FORMATTER_YYYYMMDD);
		}

		return returnDate;
	}

	/**
	 * Method responsible for converting a {@link Date} object into a {@link String} with the patter: 'ddMMyyyy'.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param date
	 * @return 'ddMMyyyy'
	 */
	public static String convertDateToStringPatternDdMmYyyy(Date date) {
		String returnDate = null;
		if (date != null) {
			returnDate = toLocalDate(date).format(FORMATTER_DDMMYYYY);
		}

		return returnDate;
	}

	/**
	 * Method responsible for returning a {@link Date} object with the current date.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @return
	 */
	public static Date getDateNow() {
		return Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
	}

}
