package tpvol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Trajet {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToMany
	@JoinTable(name="lien_trajet_vol", joinColumns = @JoinColumn(name="trajet_id"), inverseJoinColumns = @JoinColumn(name="vol_id"))
	private List<Vol> vols = new ArrayList<Vol>();

	@OneToOne(mappedBy = "traj")
	private Reservation res;

	// generator

	public Trajet() {
		super();
	}

	
		public List<Vol> getVols() {
		return vols;
	}


	public List<Vol> getvols() {
		return vols;
	}

	public void setVols(List<Vol> vols) {
		this.vols = vols;
	}

	public void AddVol(Vol vols) {
		this.vols.add(vols);
	}

	public Reservation getRes() {
		return res;
	}

	public void setRes(Reservation res) {
		this.res = res;
	}

	@Override
	public String toString() {
		return "Trajet [volsOrdonne=" + vols + ", res=" + res + "]";
	}

}
