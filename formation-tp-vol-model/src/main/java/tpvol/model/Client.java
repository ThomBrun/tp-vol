package tpvol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity // obligatoire
@Table(name = "client") // optionnel 
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type", discriminatorType = DiscriminatorType.STRING, length = 15) 
public abstract class Client {
	
	@Id // obligatoire
	@GeneratedValue // optionnel
	private Long id;
	
	@Column(name="nom", length = 100, nullable = false)
	private String nom;
	
	//private String type;
	
	@Column(name="mail", length = 100)
	private String mail;
	
	@Column(name="telephone", length = 15)
	private String telephone;
	
	@Column(name="adresse")
	private Integer numeroAdresse;
	
	@Column(name="code-postal")
	private Integer codePostal;
	
	@Column(name="rue", length = 150)
	private String rue;
	
	@Column(name="ville", length = 50)
	private String ville;
	
	@Column(name="complement", length = 150)
	private String complementAdresse;
	
	@Column(name="pays", length = 50)
	private String pays;
	
	@OneToOne(mappedBy="client")
	private Utilisateur utilisateur;
	
	@OneToMany(mappedBy="client")
	private List<Passager>passagers = new ArrayList<Passager>();
	
	@OneToMany(mappedBy="client")
	private List<Reservation>reservations = new ArrayList<Reservation>();
	
	//Generator
	
	public Client() {
		super();
	}
	
	public Client(String nom, String type, String mail) {
		super();
		this.nom = nom;
		//this.type = type;
		this.mail = mail;
	}
	
	public Client(String nom, String type, String mail, String telephone, 
		          Integer numeroAdresse, Integer codePostal, String rue, 
		          String ville, String complementAdresse, String pays) {
		super();
		this.nom = nom;
		//this.type = type;
		this.mail = mail;
		this.telephone = telephone;
		this.numeroAdresse = numeroAdresse;
		this.codePostal = codePostal;
		this.rue = rue;
		this.ville = ville;
		this.complementAdresse = complementAdresse;
		this.pays = pays;
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
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	/*public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}*/
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Integer getNumeroAdresse() {
		return numeroAdresse;
	}
	public void setNumeroAdresse(Integer numeroAdresse) {
		this.numeroAdresse = numeroAdresse;
	}
	public Integer getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getComplementAdresse() {
		return complementAdresse;
	}
	public void setComplementAdresse(String complementAdresse) {
		this.complementAdresse = complementAdresse;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<Passager> getPassagers() {
		return passagers;
	}
	public void setPassagers(ArrayList<Passager> passagers) {
		this.passagers = passagers;
	}
	public List<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	//Add
	
	public void addPassager (Passager passager) {
		this.passagers.add(passager);
	}
	public void addReservation (Reservation reservation) {
		this.reservations.add(reservation);
	}
	
	//toString
	
	/*@Override
	public String toString() {
		return "Client [nom=" + nom + ", type=" + type + ", mail=" + mail + ", telephone=" + telephone
				+ ", numeroAdresse=" + numeroAdresse + ", codePostal=" + codePostal + ", rue=" + rue + ", ville="
				+ ville + ", complementAdresse=" + complementAdresse + ", pays=" + pays + ", utilisateur=" + utilisateur
				+ "]";
	}*/
	
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", mail=" + mail + ", telephone=" + telephone
				+ ", numeroAdresse=" + numeroAdresse + ", codePostal=" + codePostal + ", rue=" + rue + ", ville="
				+ ville + ", complementAdresse=" + complementAdresse + ", pays=" + pays + ", utilisateur=" + utilisateur
				+ "]";
	}
	
	
	
	

}
