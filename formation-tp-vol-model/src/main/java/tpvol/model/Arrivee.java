package tpvol.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Arrivee {
	@Id
	@GeneratedValue
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateArrivee;
	@ManyToOne
	@JoinColumn(name="aeroport_id")
	private Aeroport aeroport;
	private Vol vol;
	
	public Arrivee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date getDateArrivee() {
		return dateArrivee;
	}
	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	public Aeroport getAeroprt() {
		return aeroport;
	}
	public void setAeroprt(Aeroport aeroprt) {
		this.aeroport = aeroprt;
	}
	public Vol getVol() {
		return vol;
	}
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	@Override
	public String toString() {
		return "Arrivee [dateArrivee=" + dateArrivee + ", aeroport=" + aeroport + "]";
	}
	
	
	
	
	
	

}
