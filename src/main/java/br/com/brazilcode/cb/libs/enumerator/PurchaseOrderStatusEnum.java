package br.com.brazilcode.cb.libs.enumerator;

/**
 * Classe responsável por enumerar os status de PurchaseOrder.
 *
 * @author Brazil Code - Gabriel Guarido
 * @since 20 de fev de 2020 21:14:37
 * @version 1.0
 */
public enum PurchaseOrderStatusEnum {

	PENDING(1, "PENDING"),
	APPROVED(2, "APPROVED"),
	REPROVED(3, "REPROVED"),
	REVIEW(4, "REVIEW");

	private long id;

	private String description;

	private PurchaseOrderStatusEnum(long id, String description) {
		this.id = id;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

}
