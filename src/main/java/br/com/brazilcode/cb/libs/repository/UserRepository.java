package br.com.brazilcode.cb.libs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import br.com.brazilcode.cb.libs.model.User;

/**
 * Class responsible for performing entity persistence operations.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 26, 2020 12:03:24 AM
 * @version 1.1
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

	/**
	 * Method responsible for searching for a {@link User} by the given 'username'.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param username
	 * @return
	 */
	@Query("SELECT u FROM sys_user u WHERE LOWER(u.username) LIKE LOWER(:username) AND u.disabled = false")
	Optional<User> findByUsername(@Param("username") final String username);

	/**
	 * Method responsible for searching for a {@link User} by the given 'username' and 'password'.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param username
	 * @param password
	 * @return
	 */
	@Query("SELECT u FROM sys_user u WHERE u.username = :username AND u.password = :password AND u.disabled = false")
	User findByUsernameAndPassword(@Param("username") final String username, @Param("password") final String password);

	/**
	 * Method responsible for searching for a {@link User} by the given 'email'.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param email
	 * @return
	 */
	@Query("SELECT u FROM sys_user u WHERE LOWER(u.email) LIKE LOWER(:email) AND u.disabled = false")
	Optional<User> findByEmail(@Param("email") final String email);

	/**
	 * Method responsible for updating {@link User}'s token by the given 'ID'.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param token
	 * @param id
	 */
	@Modifying
	@Query("UPDATE sys_user u SET u.token = :token WHERE u.id = :id")
	@Transactional
	void updateTokenById(@Param("token") final String token, @Param("id") final Long id);

}
