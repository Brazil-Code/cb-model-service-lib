package br.com.brazilcode.cb.libs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.brazilcode.cb.libs.model.Profile;

/**
 * Class responsible for performing entity persistence operations.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 26, 2020 12:02:55 AM
 * @version 1.1
 */
public interface ProfileRepository extends PagingAndSortingRepository<Profile, Long> {

	/**
	 * Method responsible for searching for a {@link Profile} by the given 'description'.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param description
	 * @return
	 */
	@Query("SELECT p FROM profile p WHERE LOWER(p.description) LIKE LOWER(:description)")
	Profile findByDescription(@Param("description") final String description);

}
