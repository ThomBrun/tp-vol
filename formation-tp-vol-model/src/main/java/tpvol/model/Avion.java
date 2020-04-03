package tpvol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Avion {
	@Id
	@GeneratedValue
	private Long id;
	private String modele;
	@OneToMany(mappedBy = "vol")
	private List<Vol> vols	 = new ArrayList<Vol>();
	
	public Avion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Avion(String modele) {
		super();
		this.modele = modele;
	}



	public String getModele() {
		return modele;
	}


	public void setModele(String modele) {
		this.modele = modele;
	}


	public List<Vol> getVols() {
		return vols;
	}


	public void setVols(List<Vol> vols) {
		this.vols = vols;
	}


	public void addVol(Vol vols) {
		this.vols.add(vols);
	}



	@Override
	public String toString() {
		return "Avion [modele=" + modele + "]";
	}





	


	



	
	
	

}
