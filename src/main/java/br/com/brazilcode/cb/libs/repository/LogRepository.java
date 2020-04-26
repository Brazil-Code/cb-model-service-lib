package br.com.brazilcode.cb.libs.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.brazilcode.cb.libs.model.Log;

/**
 * Classe responsável por realizar as operações de persistência de entidade.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 21 de fev de 2020 08:37:32
 * @version 1.0
 */
public interface LogRepository extends PagingAndSortingRepository<Log, Long> {

}
