package br.com.brazilcode.cb.libs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.brazilcode.cb.libs.model.Supplier;

/**
 * Classe responsável por realizar as operações de persistência de entidade.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 6 de mar de 2020 08:58:56
 * @version 1.0
 */
public interface SupplierRepository extends PagingAndSortingRepository<Supplier, Long> {

	/**
	 * Método responsável por buscar um Supplier pelo e-mail informado.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param email
	 * @return
	 */
	@Query("SELECT s FROM supplier s WHERE LOWER(s.email) LIKE LOWER(:email)")
	Supplier findByEmail(@Param("email") final String email);

	/**
	 * Método responsável por buscar uma Supplier pelo cnpj informado.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param cnpj
	 * @return
	 */
	@Query("SELECT s FROM supplier s WHERE LOWER(s.cnpj) LIKE LOWER(:cnpj)")
	Supplier findByCnpj(@Param("cnpj") final String cnpj);

}
