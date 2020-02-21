package br.com.brazilcode.cb.libs.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

/**
 * Classe responsável por mapear e agrupar informações de um User.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 21 de fev de 2020 08:55:56
 * @version 1.0
 */
@Entity
@Table(name = "user")
@Immutable
public class UserDTO implements Serializable {

	/**
	 * Atributo serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String firstName;

	private String lastName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
