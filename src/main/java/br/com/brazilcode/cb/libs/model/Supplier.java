package br.com.brazilcode.cb.libs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
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
 * Class responsible to map the table "supplier" on database.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 25, 2020 11:19:09 PM
 * @version 2.0
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity(name = "supplier")
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "supplier_seq")
	@GenericGenerator(name = "supplier_seq", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "supplier_seq"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })
	private Long id;

	@NotEmpty(message = "Cnpj is mandatory!")
	@Column(length = 15, unique = true, nullable = false)
	private String cnpj;

	@NotEmpty(message = "Corporate name is mandatory!")
	@Column(length = 150, nullable = false)
	private String corporateName;

	@Column(length = 50)
	private String fantasyName;

	@NotEmpty(message = "State registration is mandatory!")
	@Column(length = 30, nullable = false)
	private String stateRegistration;

	@NotEmpty(message = "Responsible is mandatory!")
	@Column(length = 50, nullable = false)
	private String responsible;

	@NotEmpty(message = "E-mail is mandatory!")
	@Column(length = 150, nullable = false)
	@Email
	private String email;

	@NotEmpty(message = "Phone is mandatory!")
	@Column(length = 15, nullable = false)
	private String phone;

	@NotNull(message = "Disabled flag is mandatory!")
	@Column(nullable = false)
	private boolean disabled = false;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "Creation date is mandatory!")
	@Column(nullable = false)
	private Date createdAt;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;

}
