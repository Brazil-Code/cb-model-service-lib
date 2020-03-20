package br.com.brazilcode.cb.libs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Classe responsável por mapear a tabela "payment_order_historic" do banco de dados.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 3 de mar de 2020 23:30:24
 * @version 1.0
 */
@Entity(name = "payment_order_historic")
public class PaymentOrderHistoric {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payment_order_historic_seq")
	@GenericGenerator(name = "payment_order_historic_seq", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "payment_order_historic_seq"),
			@Parameter(name = "initial_value", value = "1"), @Parameter(name = "increment_size", value = "1") })
	private Long id;

	@NotNull(message = "Payment order is mandatory!")
	@ManyToOne
	@JoinColumn(name = "id_payment_order", referencedColumnName = "id")
	private PaymentOrder paymentOrder;

	@Column(length = 255)
	private String observation;

	@NotNull(message = "Creation date is mandatory!")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PaymentOrder getPaymentOrder() {
		return paymentOrder;
	}

	public void setPaymentOrder(PaymentOrder paymentOrder) {
		this.paymentOrder = paymentOrder;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((observation == null) ? 0 : observation.hashCode());
		result = prime * result + ((paymentOrder == null) ? 0 : paymentOrder.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaymentOrderHistoric other = (PaymentOrderHistoric) obj;
		if (createdAt == null) {
			if (other.createdAt != null)
				return false;
		} else if (!createdAt.equals(other.createdAt))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (observation == null) {
			if (other.observation != null)
				return false;
		} else if (!observation.equals(other.observation))
			return false;
		if (paymentOrder == null) {
			if (other.paymentOrder != null)
				return false;
		} else if (!paymentOrder.equals(other.paymentOrder))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PaymentOrderHistoric [id=" + id + ", paymentOrder=" + paymentOrder + ", observation=" + observation
				+ ", createdAt=" + createdAt + "]";
	}

}
