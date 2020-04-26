package br.com.brazilcode.cb.libs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.brazilcode.cb.libs.model.Supplier;

/**
 * Class responsible for performing entity persistence operations.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 26, 2020 12:03:17 AM
 * @version 1.1
 */
public interface SupplierRepository extends PagingAndSortingRepository<Supplier, Long> {

	/**
	 * Method responsible for searching for a {@link Supplier} by the given 'email'.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param email
	 * @return
	 */
	@Query("SELECT s FROM supplier s WHERE LOWER(s.email) LIKE LOWER(:email)")
	Supplier findByEmail(@Param("email") final String email);

	/**
	 * Method responsible for searching for a {@link Supplier} by the given 'cnpj'.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param cnpj
	 * @return
	 */
	@Query("SELECT s FROM supplier s WHERE LOWER(s.cnpj) LIKE LOWER(:cnpj)")
	Supplier findByCnpj(@Param("cnpj") final String cnpj);

}
