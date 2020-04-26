package br.com.brazilcode.cb.libs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
 * Class responsible to map the table "payment_order" on database.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 25, 2020 11:20:22 PM
 * @version 2.0
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity(name = "payment_order")
public class PaymentOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payment_order_seq")
	@GenericGenerator(name = "payment_order_seq", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "payment_order_seq"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })
	private Long id;

	@NotNull(message = "Purchase request is mandatory!")
	@OneToOne
	@JoinColumn(name = "id_purchcase_request", referencedColumnName = "id", nullable = false)
	private PurchaseRequest purchaseRequest;

	@NotNull(message = "Area is mandatory!")
	@ManyToOne
	@JoinColumn(name = "id_area", referencedColumnName = "id", nullable = false)
	private Area area;

	@NotNull(message = "Supplier is mandatory!")
	@ManyToOne
	@JoinColumn(name = "id_supplier", referencedColumnName = "id", nullable = false)
	private Supplier supplier;

	@NotNull(message = "Date is mandatory!")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date date;

	@NotNull(message = "Invoice number is mandatory!")
	@Column(nullable = false)
	private int invoiceNumber;

	@NotEmpty(message = "Invoice path is mandatory!")
	@Column(length = 150, nullable = false)
	private String invoicePath;

	@NotNull(message = "Disabled flag is mandatory!")
	@Column(nullable = false)
	private boolean disabled = false;

	@NotNull(message = "Creation date is mandatory!")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdAt;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;

}
