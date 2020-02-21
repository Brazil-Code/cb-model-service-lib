package br.com.brazilcode.cb.libs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.brazilcode.cb.libs.model.Area;

/**
 * Classe responsável por realizar as operações de persistência de entidade.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 20 de fev de 2020 21:34:34
 * @version 1.0
 */
public interface AreaRepository extends PagingAndSortingRepository<Area, Long> {

	@Query("SELECT a FROM Area a WHERE LOWER(a.name) LIKE LOWER(:name)")
	Area findByName(@Param("name") final String name);

}
