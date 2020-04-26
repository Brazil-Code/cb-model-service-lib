package br.com.brazilcode.cb.libs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.brazilcode.cb.libs.model.Area;
import br.com.brazilcode.cb.libs.model.PaymentOrder;
import br.com.brazilcode.cb.libs.model.PurchaseRequest;
import br.com.brazilcode.cb.libs.model.Supplier;

/**
 * Class responsible for performing entity persistence operations.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 26, 2020 12:02:37 AM
 * @version 1.1
 */
public interface PaymentOrderRepository extends PagingAndSortingRepository<PaymentOrder, Long> {

	/**
	 * Method responsible for searching for a {@link PaymentOrder} by the given '{@link PurchaseRequest} ID'.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param idPurchaseRequest
	 * @return
	 */
	@Query("SELECT po FROM payment_order po WHERE po.purchaseRequest = :idPurchaseRequest")
	PaymentOrder findByPurchaseRequestId(@Param("idPurchaseRequest") final Long idPurchaseRequest);

	/**
	 * Method responsible for searching for {@link PaymentOrder}s by the given '{@link Area} ID'.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param idArea
	 * @return list with all {@link PaymentOrder}s found
	 */
	@Query("SELECT po FROM payment_order po WHERE po.area = :idArea")
	List<PaymentOrder> findByAreaId(@Param("idArea") final Long idArea);

	/**
	 * Method responsible for searching for {@link PaymentOrder}s by the given '{@link Supplier} ID'.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param idSupplier
	 * @return list with all {@link PaymentOrder}s found
	 */
	@Query("SELECT po FROM payment_order po WHERE po.supplier = :idSupplier")
	List<PaymentOrder> findBySupplierId(@Param("idSupplier") final Long idSupplier);

}
