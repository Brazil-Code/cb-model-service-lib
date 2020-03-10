package br.com.brazilcode.cb.libs.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Classe responsável por mapear a tabela "purchase_order" do banco de dados.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 3 de mar de 2020 21:12:32
 * @version 1.0
 */
@Entity(name = "purchase_request")
public class PurchaseRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "purchase_request_seq")
	@GenericGenerator(name = "purchase_request_seq", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "purchase_request_seq"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })
	private Long id;

	@NotNull(message = "Creation user is mandatory!")
	@ManyToOne
	@JoinColumn(name = "id_create_user", referencedColumnName = "id")
	private User createUser;

	@ManyToOne
	@JoinColumn(name = "id_approval_user", referencedColumnName = "id")
	private User approvalUser;

	@Column(length = 255)
	private String observation;

	@NotNull(message = "Status is mandatory!")
	private int status;

	@NotNull(message = "Purchase requests must have at least 3 price quotations")
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "purchase_request_price_quotation", joinColumns = {
			@JoinColumn(name = "id_purchase_request") }, inverseJoinColumns = { @JoinColumn(name = "id_price_quotation") })
	private Set<PriceQuotation> priceQuotations = new HashSet<>();

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

	public User getCreateUser() {
		return createUser;
	}

	public void setCreateUser(User createUser) {
		this.createUser = createUser;
	}

	public User getApprovalUser() {
		return approvalUser;
	}

	public void setApprovalUser(User approvalUser) {
		this.approvalUser = approvalUser;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Set<PriceQuotation> getPriceQuotations() {
		return priceQuotations;
	}

	public void setPriceQuotations(Set<PriceQuotation> priceQuotations) {
		this.priceQuotations = priceQuotations;
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
		result = prime * result + ((approvalUser == null) ? 0 : approvalUser.hashCode());
		result = prime * result + ((createUser == null) ? 0 : createUser.hashCode());
		result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((observation == null) ? 0 : observation.hashCode());
		result = prime * result + ((priceQuotations == null) ? 0 : priceQuotations.hashCode());
		result = prime * result + status;
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
		PurchaseRequest other = (PurchaseRequest) obj;
		if (approvalUser == null) {
			if (other.approvalUser != null)
				return false;
		} else if (!approvalUser.equals(other.approvalUser))
			return false;
		if (createUser == null) {
			if (other.createUser != null)
				return false;
		} else if (!createUser.equals(other.createUser))
			return false;
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
		if (priceQuotations == null) {
			if (other.priceQuotations != null)
				return false;
		} else if (!priceQuotations.equals(other.priceQuotations))
			return false;
		if (status != other.status)
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
