package br.com.brazilcode.cb.libs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Class responsible to map the table "budget" on database.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 25, 2020 11:21:01 PM
 * @version 2.0
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString(exclude = { "budgeted", "effective" })
@Entity(name = "budget")
public class Budget {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "budget_seq")
	@GenericGenerator(name = "budget_seq", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "budget_seq"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })
	private Long id;

	@NotEmpty(message = "Service type is mandatory!")
	@Column(length = 100, name = "service", nullable = false)
	private String serviceType;

	@NotNull(message = "Budgeted value is mandatory!")
	@Column(nullable = false)
	private double budgeted;

	@NotNull(message = "Effective value is mandatory!")
	@Column(nullable = false)
	private double effective;

	@NotEmpty(message = "Management account is mandatory!")
	@Column(length = 100, nullable = false)
	private String managementAccount;

	@NotEmpty(message = "Year is mandatory!")
	@Column(length = 4, nullable = false)
	private String year;

	@NotNull(message = "Flag disabled is mandatory!")
	@Column(nullable = false)
	private boolean disabled = false;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;

	@NotNull(message = "Creation date is mandatory!")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdAt;

}
