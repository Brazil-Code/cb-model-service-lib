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

/**
 * Classe responsável por ...
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 5 de mar de 2020 18:35:17
 * @version 1.1
 */
@Entity(name = "price_quotation")
public class PriceQuotation {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "price_quotation_seq")
	@GenericGenerator(name = "price_quotation_seq", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "price_quotation_seq"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })
	private Long id;

	@NotEmpty(message = "Link is mandatory")
	@Column(length = 255)
	private String link;

	@NotNull(message = "Unit value is mandatory")
	private double unitValue;

	@Column(length = 255)
	private String observation;

	@NotNull(message = "Amount is mandatory")
	private int amount;

	@NotNull(message = "Total value is mandatory")
	private double totalValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public double getUnitValue() {
		return unitValue;
	}

	public void setUnitValue(double unitValue) {
		this.unitValue = unitValue;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((link == null) ? 0 : link.hashCode());
		result = prime * result + ((observation == null) ? 0 : observation.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(unitValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		PriceQuotation other = (PriceQuotation) obj;
		if (amount != other.amount)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (link == null) {
			if (other.link != null)
				return false;
		} else if (!link.equals(other.link))
			return false;
		if (observation == null) {
			if (other.observation != null)
				return false;
		} else if (!observation.equals(other.observation))
			return false;
		if (Double.doubleToLongBits(totalValue) != Double.doubleToLongBits(other.totalValue))
			return false;
		if (Double.doubleToLongBits(unitValue) != Double.doubleToLongBits(other.unitValue))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PriceQuotation [id=" + id + ", link=" + link + ", unitValue=" + unitValue + ", observation=" + observation
				+ ", amount=" + amount + ", totalValue=" + totalValue + "]";
	}


}
