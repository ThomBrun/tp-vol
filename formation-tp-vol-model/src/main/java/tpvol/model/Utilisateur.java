package tpvol.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity // obligatoire
@Table(name = "utilisateur") // optionnel 
public class Utilisateur {
	
	@Id // obligatoire
	@GeneratedValue // optionnel
	private Long id;
	
	@Column(name="identifiant", length = 100, nullable = false)
	private String identifiant;
	
	@Column(name="mdp", length = 100, nullable = false)
	private String motDePasse;
	
	@OneToOne
	private Client client;
	
	//generator
	
	public Utilisateur() {
		super();
	}	
	public Utilisateur(String identifiant, String motDePasse) {
		super();
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
	}
	
	@Version
    private Long version;
	
    public Long getVersion() {
		return version;
	}
    
	public void setVersion(Long version) {
		this.version = version;
	}

	//getters and setters
	
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Utilisateur [identifiant=" + identifiant + ", motDePasse=" + motDePasse + "]";
	}
	
	
	
	
	

}
