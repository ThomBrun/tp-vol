package tpvol.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Version;

@Entity // obligatoire
@DiscriminatorValue("part")
public class Particulier extends Client{
	
	@Column(name="prenom", length = 100)
	private String prenom;
	
	//Generator
	
	public Particulier() {
		super();
	}
	

	public Particulier(String nom, String mail, String telephone, Integer numeroAdresse, Integer codePostal, String rue,
			String ville, String complementAdresse, String pays, String prenom) {
		super(nom, mail, telephone, numeroAdresse, codePostal, rue, ville, complementAdresse, pays);
		this.prenom = prenom;
	}



	public Particulier(String prenom) {
		super();
		this.prenom = prenom;
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
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	//toString

	@Override
	public String toString() {
		return "Particulier [prenom=" + prenom + super.toString() +"]";
	}
	
	

	

}
