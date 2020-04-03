package tpvol.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Version;

@Entity // obligatoire
@DiscriminatorValue("soc")
public class Societe extends Client{
	
	@Column(name="siret", length = 100, nullable = false)
	private String siret;
	
	@Column(name="TVA", length = 100, nullable = false)
	private String numeroDeTva;
	
	//Generator
	
	public Societe() {
		super();
	}
	
	public Societe(String siret, String tva) {
		super();
		this.siret = siret;
		this.numeroDeTva = tva;
	}
	
	@Version
    private Long version;
	
    public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	//Getters and setters
		
	public String getSiret() {
		return siret;
	}
	public void setSiret(String siret) {
		this.siret = siret;
	}
	public String getNumeroDeTva() {
		return numeroDeTva;
	}
	public void setNumeroDeTva(String numeroDeTva) {
		this.numeroDeTva = numeroDeTva;
	}

	@Override
	public String toString() {
		return "Societe [siret=" + siret + ", numeroDeTva=" + numeroDeTva + super.toString() +"]";
	}
	
}
