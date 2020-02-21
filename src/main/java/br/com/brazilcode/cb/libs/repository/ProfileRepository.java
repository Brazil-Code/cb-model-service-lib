package br.com.brazilcode.cb.libs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.brazilcode.cb.libs.model.Profile;

/**
 * Classe responsável por realizar as operações de persistência de entidade.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 21 de fev de 2020 08:28:13
 * @version 1.0
 */
public interface ProfileRepository extends PagingAndSortingRepository<Profile, Long> {

	/**
	 * Método responsável por buscar um Profile pela sua descrição.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param description
	 * @return
	 */
	@Query("SELECT p FROM Profile p WHERE p.description LIKE %:description%")
	Profile findByDescription(@Param("description") final String description);

}
