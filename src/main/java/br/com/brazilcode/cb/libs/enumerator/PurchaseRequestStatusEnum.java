package br.com.brazilcode.cb.libs.enumerator;

import br.com.brazilcode.cb.libs.model.PurchaseRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Class responsible for enumerating all the {@link PurchaseRequest} status.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since Apr 26, 2020 12:40:34 AM
 * @version 1.1
 */
@Getter
@AllArgsConstructor
public enum PurchaseRequestStatusEnum {

	PENDING(1, "PENDENTE"),
	APPROVED(2, "APROVADO"),
	REPROVED(3, "REPROVADO"),
	REVIEW(4, "REVISÃO");

	private int id;
	private String description;

}
