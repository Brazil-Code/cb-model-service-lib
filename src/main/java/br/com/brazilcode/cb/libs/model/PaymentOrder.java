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

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Classe responsável por mapear a tabela "payment_order" do banco de dados.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 29 de fev de 2020 18:31:44
 * @version 1.0
 */
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
	@JoinColumn(name = "id_purchcase_request", referencedColumnName = "id")
	private PurchaseRequest purchaseRequest;

	@NotNull(message = "Area is mandatory!")
	@ManyToOne
	@JoinColumn(name = "id_area", referencedColumnName = "id")
	private Area area;

	@NotNull(message = "Company is mandatory!")
	@ManyToOne
	@JoinColumn(name = "id_company", referencedColumnName = "id")
	private Company company;

	@NotNull(message = "Date is mandatory!")
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	@NotNull(message = "Invoice number is mandatory!")
	private int invoiceNumber;

	@NotEmpty(message = "Invoice path is mandatory!")
	@Column(length = 150)
	private String invoicePath;

	@NotNull(message = "Disabled flag is mandatory!")
	private boolean disabled = false;

	@NotNull(message = "Creation date is mandatory!")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PurchaseRequest getPurchaseRequest() {
		return purchaseRequest;
	}

	public void setPurchaseRequest(PurchaseRequest purchaseRequest) {
		this.purchaseRequest = purchaseRequest;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getInvoicePath() {
		return invoicePath;
	}

	public void setInvoicePath(String invoicePath) {
		this.invoicePath = invoicePath;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + (disabled ? 1231 : 1237);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + invoiceNumber;
		result = prime * result + ((invoicePath == null) ? 0 : invoicePath.hashCode());
		result = prime * result + ((purchaseRequest == null) ? 0 : purchaseRequest.hashCode());
		result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
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
		PaymentOrder other = (PaymentOrder) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (createdAt == null) {
			if (other.createdAt != null)
				return false;
		} else if (!createdAt.equals(other.createdAt))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (disabled != other.disabled)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (invoiceNumber != other.invoiceNumber)
			return false;
		if (invoicePath == null) {
			if (other.invoicePath != null)
				return false;
		} else if (!invoicePath.equals(other.invoicePath))
			return false;
		if (purchaseRequest == null) {
			if (other.purchaseRequest != null)
				return false;
		} else if (!purchaseRequest.equals(other.purchaseRequest))
			return false;
		if (updatedAt == null) {
			if (other.updatedAt != null)
				return false;
		} else if (!updatedAt.equals(other.updatedAt))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE, true);
	}

}
