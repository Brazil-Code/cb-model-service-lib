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
 * Class responsible to map the table "price_quotation" on database.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 25, 2020 11:19:57 PM
 * @version 2.0
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity(name = "price_quotation")
public class PriceQuotation {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "price_quotation_seq")
	@GenericGenerator(name = "price_quotation_seq", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "price_quotation_seq"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })
	private Long id;

	@NotEmpty(message = "Link is mandatory")
	@Column(length = 255, nullable = false)
	private String link;

	@NotNull(message = "Unit value is mandatory")
	@Column(nullable = false)
	private double unitValue;

	@Column(length = 255)
	private String observation;

	@NotNull(message = "Amount is mandatory")
	@Column(nullable = false)
	private int amount;

	@NotNull(message = "Total value is mandatory")
	@Column(nullable = false)
	private double totalValue;

}
