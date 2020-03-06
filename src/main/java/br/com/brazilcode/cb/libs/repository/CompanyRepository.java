package br.com.brazilcode.cb.libs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.brazilcode.cb.libs.model.Company;

/**
 * Classe responsável por realizar as operações de persistência de entidade.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 6 de mar de 2020 08:58:56
 * @version 1.0
 */
public interface CompanyRepository extends PagingAndSortingRepository<Company, Long> {

	/**
	 * Método responsável por buscar uma Company pelo e-mail informado.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param email
	 * @return
	 */
	@Query("SELECT c FROM company c WHERE LOWER(c.email) LIKE LOWER(:email)")
	Company findByEmail(@Param("email") final String email);

	/**
	 * Método responsável por buscar uma Company pelo cnpj informado.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param cnpj
	 * @return
	 */
	@Query("SELECT c FROM company c WHERE LOWER(c.cnpj) LIKE LOWER(:cnpj)")
	Company findByCnpj(@Param("cnpj") final String cnpj);

}
