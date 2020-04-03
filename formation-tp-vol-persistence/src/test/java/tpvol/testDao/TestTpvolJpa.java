package tpvol.testDao;

import java.util.Date;

import tpvol.Application;
import tpvol.model.Aeroport;
import tpvol.model.Arrivee;
import tpvol.model.Avion;
import tpvol.model.Client;
import tpvol.model.Compagnie;
import tpvol.model.Depart;
import tpvol.model.Paiement;
import tpvol.model.Particulier;
import tpvol.model.Passager;
import tpvol.model.Reservation;
import tpvol.model.Trajet;
import tpvol.model.Utilisateur;
import tpvol.model.Ville;
import tpvol.model.Vol;
import tpvol.persistence.IAeroportDao;
import tpvol.persistence.IArriveeDao;
import tpvol.persistence.IAvionDao;
import tpvol.persistence.ICompagnieDao;
import tpvol.persistence.IDepartDao;
import tpvol.persistence.IPaiementDao;
import tpvol.persistence.IParticulierDao;
import tpvol.persistence.IPassagerDao;
import tpvol.persistence.IReservationDao;
import tpvol.persistence.ISocieteDao;
import tpvol.persistence.ITrajetDao;
import tpvol.persistence.IUtilisateurDao;
import tpvol.persistence.IVilleDao;
import tpvol.persistence.IVolDao;

public class TestTpvolJpa {

	public static void main(String[] args) {
		
		IVilleDao villeDao = Application.getInstance().getVilleDao();
		IPaiementDao paiementDao = Application.getInstance().getPaiementDao();
		IPassagerDao passageDao = Application.getInstance().getPassageDao();
		IReservationDao reservationDao = Application.getInstance().getReservationDao();
		ITrajetDao trajetDao = Application.getInstance().getTrajetDao();
		IUtilisateurDao utilisateurDao = Application.getInstance().getUtilisateurDao();
		ISocieteDao societeDao = Application.getInstance().getSocieteDao();
		IParticulierDao particulierDao = Application.getInstance().getParticulierDao();
		IVolDao volDao = Application.getInstance().getVolDao();
		ICompagnieDao compagnieDao = Application.getInstance().getCompagnieDao();
		IAvionDao avionDao = Application.getInstance().getAvionDao();
		IDepartDao departDao = Application.getInstance().getDepartDao();
		IArriveeDao arriveeDao = Application.getInstance().getArriveeDao();
		IAeroportDao aeroportDao = Application.getInstance().getAeroportDao();
				
		Ville newYork = new Ville("New-York", "Etats-Unis");
		Ville paris = new Ville("Paris", "France");
		
		paris = villeDao.save(paris);
		newYork = villeDao.save(newYork);
		
		Aeroport orly = new Aeroport("ORLY");
		Aeroport newYorkAeroport = new Aeroport("New-York Aeroport");
		
		orly = aeroportDao.save(orly);
		newYorkAeroport = aeroportDao.save(newYorkAeroport);
		
		orly.addVille(paris);
		newYorkAeroport.addVille(newYork);
		
		orly = aeroportDao.save(orly);
		newYorkAeroport = aeroportDao.save(newYorkAeroport);
		
		Depart dtDepartvol1 = new Depart();
		dtDepartvol1.setDateDepart(new Date());
		
		Arrivee dtArriveeVol1 = new Arrivee();
		dtArriveeVol1.setDateArrivee(new Date());
		
		dtDepartvol1 = departDao.save(dtDepartvol1);
		dtArriveeVol1 = arriveeDao.save(dtArriveeVol1);
		
		dtDepartvol1.setAeroport(orly);
		dtArriveeVol1.setAeroport(newYorkAeroport);
		
		dtDepartvol1 = departDao.save(dtDepartvol1);
		dtArriveeVol1 = arriveeDao.save(dtArriveeVol1);
		
		Avion boeing737Max = new Avion();
		boeing737Max.setModele("Boeing 737 Max");
		
		boeing737Max = avionDao.save(boeing737Max);
		
		Compagnie airFrance = new Compagnie();
		airFrance.setNom("Air France");
		
		airFrance = compagnieDao.save(airFrance);
		
		Vol parisNewYork = new Vol();
		parisNewYork.setNumeroDeVol("AF458785");
		parisNewYork.setOuvert(true);
		
		parisNewYork = volDao.save(parisNewYork);
		
		parisNewYork.setArrivee(dtArriveeVol1);
		parisNewYork.setDepart(dtDepartvol1);
		parisNewYork.setAvion(boeing737Max);
		parisNewYork.setCompagnie(airFrance);

		parisNewYork = volDao.save(parisNewYork);
		
		Particulier georges = new Particulier("BUSH", "mail@mail.com", "0785458569", 36, 15874, "rue des larges", "BABIBEL",
									"pas de complement", "France", "Geroges");
		
		georges = particulierDao.save(georges);
		
		Trajet trajet1 = new Trajet();
		trajet1.AddVol(parisNewYork);
		
		trajet1 = trajetDao.save(trajet1);
		
		Reservation reservation = new Reservation();
		reservation.setNumeroDeReservation("s51d6s1zer");
		
		reservation = reservationDao.save(reservation);
		
		reservation.setTraj(trajet1);
		
		reservation = reservationDao.save(reservation);
		
		reservation.setClient(georges);
		
		reservation = reservationDao.save(reservation);
		
		Paiement cb = new Paiement();
		cb.setType("CB");
		cb.setMontant(300f);
		
		cb = paiementDao.save(cb);
		
		reservation.setPaiement(cb);
		reservation = reservationDao.save(reservation);
		
		Passager georgesPassager = new Passager("BUSH", "Georges", new Date(), "Française", "M", "25481818", new Date(), "Passeport");
		
		georgesPassager = passageDao.save(georgesPassager);
		
		reservation.setPassager(georgesPassager);
		reservation = reservationDao.save(reservation);
		
		georgesPassager.setClient(georges);
		georgesPassager = passageDao.save(georgesPassager);
		
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setIdentifiant("tipiac");
		utilisateur.setMotDePasse("azerty");
		
		utilisateur = utilisateurDao.save(utilisateur);
		georges.setUtilisateur(utilisateur);
		
		
		georges = particulierDao.save(georges);
				

	}

}
