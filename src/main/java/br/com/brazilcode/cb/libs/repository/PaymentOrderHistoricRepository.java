package br.com.brazilcode.cb.libs.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.brazilcode.cb.libs.model.PaymentOrderHistoric;

/**
 * Classe responsável por realizar as operações de persistência de entidade.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 6 de mar de 2020 09:20:33
 * @version 1.0
 */
public interface PaymentOrderHistoricRepository extends PagingAndSortingRepository<PaymentOrderHistoric, Long> {

}
