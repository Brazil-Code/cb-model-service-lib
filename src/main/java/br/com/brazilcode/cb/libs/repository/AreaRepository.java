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

	/**
	 * Método responsável por buscar uma Area pelo nome informado.
	 *
	 * @author Brazil Code - Gabriel Guarido
	 * @param name
	 * @return
	 */
	@Query("SELECT a FROM area a WHERE LOWER(a.name) LIKE LOWER(:name)")
	Area findByName(@Param("name") final String name);

}
