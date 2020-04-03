package tpvol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Aeroport {
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	@ManyToMany
	@JoinTable(name="link_aeroport_ville", 
				joinColumns = @JoinColumn(name=("aeroport_id")), 
				inverseJoinColumns = @JoinColumn(name="ville_id"))
	private List<Ville> villes = new ArrayList<Ville>();
	
	public Aeroport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}
	

	public void addVille(Ville villes) {
		this.villes.add(villes);
	}

	@Override
	public String toString() {
		return "Aeroport [nom=" + nom + ", villes=" + villes + "]";
	}
	
	
	
}
