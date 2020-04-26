package br.com.brazilcode.cb.libs.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.brazilcode.cb.libs.model.PurchaseRequest;
import br.com.brazilcode.cb.libs.model.User;

/**
 * Class responsible for performing entity persistence operations.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 26, 2020 12:03:06 AM
 * @version 1.1
 */
public interface PurchaseRequestRepository extends PagingAndSortingRepository<PurchaseRequest, Long> {

	/**
	 * Method responsible for searching for paged {@link PurchaseRequest}s by the given 'Creation {@link User}'s ID'.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param idCreateUser
	 * @param pageable
	 * @return
	 */
	@Query("SELECT pr FROM purchase_request pr WHERE pr.createUser.id = :idCreateUser")
	Page<PurchaseRequest> findByCreateUserId(@Param("idCreateUser") final Long idCreateUser, Pageable pageable);

	/**
	 * Method responsible for searching for {@link PurchaseRequest} by the given 'status'.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param status
	 * @return
	 */
	@Query("SELECT pr FROM purchase_request pr WHERE pr.status = :status")
	List<PurchaseRequest> findByStatus(@Param("status") final int status);

}
