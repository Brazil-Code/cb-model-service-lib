package br.com.brazilcode.cb.libs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.brazilcode.cb.libs.model.Budget;

/**
 * Class responsible for performing entity persistence operations.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 26, 2020 12:01:50 AM
 * @version 1.1
 */
public interface BudgetRepository extends PagingAndSortingRepository<Budget, Long> {

	/**
	 * Method responsible for searching for {@link Budget}s by the given 'service type'.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param serviceType
	 * @return 
	 */
	@Query("SELECT b FROM budget b WHERE LOWER(b.serviceType) LIKE LOWER(:serviceType)")
	List<Budget> findByServiceType(@Param("serviceType") final String serviceType);

}
