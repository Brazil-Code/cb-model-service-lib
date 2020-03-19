package br.com.brazilcode.cb.libs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.brazilcode.cb.libs.model.Budget;

/**
 * Classe responsável por realizar as operações de persistência de entidade.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 20 de fev de 2020 21:41:15
 * @version 1.0
 */
public interface BudgetRepository extends PagingAndSortingRepository<Budget, Long> {

	/**
	 * Método responsável por buscar todos os Budget pelo tipo de serviço informado.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param serviceType
	 * @return
	 */
	@Query("SELECT b FROM budget b WHERE LOWER(b.serviceType) LIKE LOWER(:serviceType)")
	List<Budget> findByServiceType(@Param("serviceType") final String serviceType);

}
