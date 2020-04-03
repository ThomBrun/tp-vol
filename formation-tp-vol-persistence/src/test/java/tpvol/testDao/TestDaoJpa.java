package tpvol.testDao;

import tp.vol.Application;
import tpvol.model.Paiement;

public class TestDaoJpa {

	public static void main(String[] args) {
		Paiement paiement = new Paiement("carte", 52F);
		System.out.println(paiement);
		paiement = Application.getInstance().getPaiementDao().save(paiement);
		
//		Reservation reservation = new Reservation(false, true, true, "6354f6435f");
//		System.out.println(reservation);
//		reservation = Application.getInstance().getReservationDao().save(reservation);
//		
	}
}
