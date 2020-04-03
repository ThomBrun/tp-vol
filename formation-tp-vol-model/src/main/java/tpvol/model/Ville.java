package tpvol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Ville {
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String pays;
	@ManyToMany(mappedBy = "villes")
	private List<Aeroport> aeroports = new ArrayList<Aeroport>();

	public Ville() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public List<Aeroport> getAeroports() {
		return aeroports;
	}

	public void setAeroports(List<Aeroport> aeroports) {
		this.aeroports = aeroports;
	}

	public void addAeroport(Aeroport aeroports) {
		this.aeroports.add(aeroports);
	}

}
