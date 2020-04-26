package br.com.brazilcode.cb.libs.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.brazilcode.cb.libs.model.PaymentOrderHistoric;

/**
 * Class responsible for performing entity persistence operations.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 26, 2020 12:02:26 AM
 * @version 1.1
 */
public interface PaymentOrderHistoricRepository extends PagingAndSortingRepository<PaymentOrderHistoric, Long> {

}
