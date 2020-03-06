package br.com.brazilcode.cb.libs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.brazilcode.cb.libs.model.PurchaseRequest;

/**
 * Classe responsável por realizar as operações de persistência de entidade.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 6 de mar de 2020 09:39:46
 * @version 1.0
 */
public interface PurchaseRequestRepository extends PagingAndSortingRepository<PurchaseRequest, Long> {

	/**
	 * Método responsável por buscar todos os PurchaseRequest pelo ID do usuário de criação informado.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param idCreateUser
	 * @return
	 */
	@Query("SELECT pr FROM purchase_request pr WHERE pr.create_user = :idCreateUser")
	List<PurchaseRequest> findByCreateUserId(@Param("idCreateUser") final Long idCreateUser);

	/**
	 * Método responsável por buscar todos os PurchaseRequest pelo status informado.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param status
	 * @return
	 */
	@Query("SELECT pr FROM purchase_request pr WHERE pr.status = :status")
	List<PurchaseRequest> findByStatus(@Param("status") final int status);

}
