package tpvol.testDao;

import java.util.Date;

import tp.vol.Application;
import tpvol.model.Paiement;
import tpvol.model.Passager;
import tpvol.model.Reservation;
import tpvol.model.Societe;
import tpvol.model.Utilisateur;

public class TestDaoJpa {

	public static void main(String[] args) {
				
		Paiement paiement = new Paiement("carte", 52F);
		System.out.println(paiement);
		paiement = Application.getInstance().getPaiementDao().save(paiement);
		
		Reservation reservation = new Reservation(false, true, true, "6354f6435f");
		System.out.println(reservation);
		reservation = Application.getInstance().getReservationDao().save(reservation);
		
		Passager toto = new Passager("Toto", "aaaa", new Date(), "française","M","6843d5s35d4s1",new Date(),"passeport",false);
		System.out.println(toto);
		toto = Application.getInstance().getPassageDao().save(toto);
		
		reservation.setPaiement(paiement);
		reservation.setPassager(toto);
		reservation = Application.getInstance().getReservationDao().save(reservation);
		
		Societe AJC = new Societe("35d12cx54","6843512");
		AJC.setNom("AJC");
		AJC.setMail("ajc@gmail.fr");
		AJC.setTelephone("0564321579");
		AJC.setNumeroAdresse(13);
		AJC.setCodePostal(33700);
		AJC.setRue("Avenue JFK");
		AJC.setVille("Merignac");
		AJC.setComplementAdresse("1er étage");
		AJC.setPays("FRANCE");
		AJC = Application.getInstance().getSocieteDao().save(AJC);
		
		Utilisateur util = new Utilisateur("qjgzhbn","123456789");
		util = Application.getInstance().getUtilisateurDao().save(util);
		
		util.setClient(AJC);
		toto.setClient(AJC);
		
		util = Application.getInstance().getUtilisateurDao().save(util);
		toto = Application.getInstance().getPassageDao().save(toto);
		
	}
}
