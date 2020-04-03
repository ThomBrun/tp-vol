package tpvol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Vol {
	@Id
	@GeneratedValue
	private Long id;
	private String numeroDeVol;
	private Boolean ouvert;
	@ManyToMany(mappedBy = "lien_trajet_vol")
	private List<Trajet> trajets = new ArrayList<Trajet>();
	@ManyToOne
	@JoinColumn(name="compagnie_id")
	private Compagnie compagnie;
	@ManyToOne
	@JoinColumn(name="avion_id")
	private Avion avion;
	@OneToOne
	@JoinColumn(name = "dt_depart_id")
	private Arrivee arrivee;
	@OneToOne
	@JoinColumn(name = "dt_depart_id")
	private Depart depart;

	
	public Vol() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNumeroDeVol() {
		return numeroDeVol;
	}

	public void setNumeroDeVol(String numeroDeVol) {
		this.numeroDeVol = numeroDeVol;
	}

	public Boolean getOuvert() {
		return ouvert;
	}

	public void setOuvert(Boolean ouvert) {
		this.ouvert = ouvert;
	}

	public List<Trajet> getTrajets() {
		return trajets;
	}

	public void setTrajets(List<Trajet> trajets) {
		this.trajets = trajets;
	}

	public Compagnie getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Arrivee getArrivee() {
		return arrivee;
	}

	public void setArrivee(Arrivee arrivee) {
		this.arrivee = arrivee;
	}

	public Depart getDepart() {
		return depart;
	}

	public void setDepart(Depart depart) {
		this.depart = depart;
	}
	
	public void addTrajet(Trajet trajet) {
		this.trajets.add(trajet);
	}

	@Override
	public String toString() {
		return "Vol [numeroDeVol=" + numeroDeVol + ", ouvert=" + ouvert + ", compagnie=" + compagnie + ", avion="
				+ avion + ", arrivee=" + arrivee + ", depart=" + depart + "]";
	}
	




	
	
	
	
}
