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

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Classe responsável por mapear a tabela "Budget" do banco de dados.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 20 de fev de 2020 20:43:12
 * @version 1.0
 */
@Entity
public class Budget {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "budget_seq")
	@GenericGenerator(name = "budget_seq", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "budget_seq"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })
	private int id;

	@NotEmpty(message = "Service type is mandatory!")
	@Column(length = 255)
	private String serviceType;

	@NotEmpty(message = "Budgeted value is mandatory!")
	private float budgeted;

	@NotEmpty(message = "Effective value is mandatory!")
	private float effective;

	@NotEmpty(message = "Management account is mandatory!")
	@Column(length = 255)
	private String managementAccount;

	@NotEmpty(message = "Department is mandatory!")
	@Column(length = 255)
	private String department;

	@NotEmpty(message = "Year is mandatory!")
	private String year;

	@NotEmpty(message = "Flag disabled is mandatory!")
	private boolean disabled = false;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;

	@NotEmpty(message = "Creation date is mandatory!")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public float getBudgeted() {
		return budgeted;
	}

	public void setBudgeted(float budgeted) {
		this.budgeted = budgeted;
	}

	public float getEffective() {
		return effective;
	}

	public void setEffective(float effective) {
		this.effective = effective;
	}

	public String getManagementAccount() {
		return managementAccount;
	}

	public void setManagementAccount(String managementAccount) {
		this.managementAccount = managementAccount;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
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
		result = prime * result + Float.floatToIntBits(budgeted);
		result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + (disabled ? 1231 : 1237);
		result = prime * result + Float.floatToIntBits(effective);
		result = prime * result + id;
		result = prime * result + ((managementAccount == null) ? 0 : managementAccount.hashCode());
		result = prime * result + ((serviceType == null) ? 0 : serviceType.hashCode());
		result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
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
		Budget other = (Budget) obj;
		if (Float.floatToIntBits(budgeted) != Float.floatToIntBits(other.budgeted))
			return false;
		if (createdAt == null) {
			if (other.createdAt != null)
				return false;
		} else if (!createdAt.equals(other.createdAt))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (disabled != other.disabled)
			return false;
		if (Float.floatToIntBits(effective) != Float.floatToIntBits(other.effective))
			return false;
		if (id != other.id)
			return false;
		if (managementAccount == null) {
			if (other.managementAccount != null)
				return false;
		} else if (!managementAccount.equals(other.managementAccount))
			return false;
		if (serviceType == null) {
			if (other.serviceType != null)
				return false;
		} else if (!serviceType.equals(other.serviceType))
			return false;
		if (updatedAt == null) {
			if (other.updatedAt != null)
				return false;
		} else if (!updatedAt.equals(other.updatedAt))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}

}
