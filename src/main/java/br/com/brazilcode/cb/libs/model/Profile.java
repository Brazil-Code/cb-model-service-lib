package br.com.brazilcode.cb.libs.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Classe responsável por mapear a tabela "profile" do banco de dados.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 20 de fev de 2020 20:54:04
 * @version 1.0
 */
@Entity(name = "profile")
public class Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profile_seq")
	@GenericGenerator(name = "profile_seq", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "profile_seq"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })
	private Long id;

	@NotEmpty(message = "Description is mandatory!")
	@Column(length = 50)
	private String description;

	@NotNull(message = "Flag disabled is mandatory!")
	private boolean disabled = false;

	@ManyToMany
	@JoinTable(name = "profile_functionality", joinColumns = { @JoinColumn(name = "id_profile") }, inverseJoinColumns = {
			@JoinColumn(name = "id_functionality") })
	private Set<Functionality> functionalities = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public Set<Functionality> getFunctionalities() {
		return functionalities;
	}

	public void setFunctionalities(Set<Functionality> functionalities) {
		this.functionalities = functionalities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + (disabled ? 1231 : 1237);
		result = prime * result + ((functionalities == null) ? 0 : functionalities.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Profile other = (Profile) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (disabled != other.disabled)
			return false;
		if (functionalities == null) {
			if (other.functionalities != null)
				return false;
		} else if (!functionalities.equals(other.functionalities))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
