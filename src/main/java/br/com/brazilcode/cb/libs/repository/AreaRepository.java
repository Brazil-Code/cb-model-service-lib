package br.com.brazilcode.cb.libs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.brazilcode.cb.libs.model.Area;

/**
 * Class responsible for performing entity persistence operations.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 26, 2020 12:01:10 AM
 * @version 1.1
 */
public interface AreaRepository extends PagingAndSortingRepository<Area, Long> {

	/**
	 * Method responsible for searching for an {@link Area} by the given 'name'.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param name
	 * @return
	 */
	@Query("SELECT a FROM area a WHERE LOWER(a.name) LIKE LOWER(:name)")
	Area findByName(@Param("name") final String name);

}
