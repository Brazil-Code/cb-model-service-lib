package br.com.brazilcode.cb.libs.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.brazilcode.cb.libs.model.Functionality;

/**
 * Classe responsável por realizar as operações de persistência de entidade.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 6 de mar de 2020 08:58:41
 * @version 1.0
 */
public interface FunctionalityRepository extends PagingAndSortingRepository<Functionality, Long> {

}
