package br.com.brazilcode.cb.libs.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

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
	 * Método responsável por buscar um User pelo username informado.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param user
	 * @return
	 */
	@Query("SELECT u FROM sys_user u WHERE LOWER(u.username) LIKE LOWER(:username) AND u.disabled = false")
	User findByUsername(@Param("username") final String username);

	/**
	 * Método responsável por buscar um User por username e password informados.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param username
	 * @param password
	 * @return
	 */
	@Query("SELECT u FROM sys_user u WHERE u.username = :username AND u.password = :password AND u.disabled = false")
	User findByUsernameAndPassword(@Param("username") final String username, @Param("password") final String password);

	/**
	 * Método responsável por buscar um User pelo e-mail informado.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param email
	 * @return
	 */
	@Query("SELECT u FROM sys_user u WHERE LOWER(u.email) LIKE LOWER(:email) AND u.disabled = false")
	User findByEmail(@Param("email") final String email);

	/**
	 * Método responsável por atualizar o token do User pelo ID informado.
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
