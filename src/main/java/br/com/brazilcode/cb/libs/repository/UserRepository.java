package br.com.brazilcode.cb.libs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.brazilcode.cb.libs.model.User;

/**
 * Classe responsável por realizar as operações de persistência de entidade.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 20 de fev de 2020 21:21:27
 * @version 1.0
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

	/**
	 * Método responsável por buscar um User pelo seu username.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param user
	 * @return
	 */
	@Query("SELECT u FROM User u WHERE LOWER(u.username) LIKE LOWER(:username)")
	User findByUsername(@Param("username") final String username);

	/**
	 * Método responsável por buscar um User pelo seu e-mail.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param email
	 * @return
	 */
	@Query("SELECT u FROM User u WHERE LOWER(u.email) LIKE LOWER(:email)")
	User findByEmail(@Param("email") final String email);

}
