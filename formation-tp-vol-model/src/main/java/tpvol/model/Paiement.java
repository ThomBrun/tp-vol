package tpvol.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Paiement {
	@Id
	@GeneratedValue
	private Long id;
	private String type;
	private Float montant;
	@OneToOne(mappedBy = "paiement")
	private Reservation reservation;

	// generator

	public Paiement() {
		super();
	}

	public Paiement(String type, Float montant) {
		super();
		this.type = type;
		this.montant = montant;
	}

	// Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getMontant() {
		return montant;
	}

	public void setMontant(Float montant) {
		this.montant = montant;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	// toString

	@Override
	public String toString() {
		return "Paiement [type=" + type + ", montant=" + montant + "]";
	}

}
