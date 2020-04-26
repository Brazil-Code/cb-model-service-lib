package br.com.brazilcode.cb.libs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
 * Class responsible to map the table "area" on database.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 25, 2020 11:21:19 PM
 * @version 2.0
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity(name = "area")
public class Area {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "area_seq")
	@GenericGenerator(name = "area_seq", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "area_seq"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })
	private Long id;

	@NotNull(message = "Budget reference is mandatory!")
	@OneToOne
	@JoinColumn(name = "id_budget", referencedColumnName = "id", nullable = false)
	private Budget budget;

	@NotEmpty(message = "Name is mandatory!")
	@Column(length = 50, nullable = false)
	private String name;

	@NotNull(message = "Flag disabled is mandatory!")
	@Column(nullable = false)
	private boolean disabled = false;

}
