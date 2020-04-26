package br.com.brazilcode.cb.libs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * Class responsible to map the table "functionality" on database.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 25, 2020 11:20:49 PM
 * @version 2.0
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity(name = "functionality")
public class Functionality {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "functionality_seq")
	@GenericGenerator(name = "functionality_seq", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "functionality_seq"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })
	private Long id;

	@NotEmpty(message = "Description is mandatory!")
	@Column(length = 50, nullable = false)
	private String description;

	@NotEmpty(message = "URI is mandatory!")
	@Column(length = 150, nullable = false)
	private String uri;

	@SuppressWarnings("unused")
	private Integer action;

	@NotNull(message = "Flag disabled is mandatory!")
	@Column(nullable = false)
	private boolean disabled = false;

}
