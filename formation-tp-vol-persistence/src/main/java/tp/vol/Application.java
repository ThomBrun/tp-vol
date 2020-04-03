package tp.vol;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import tpvol.persistence.IPaiementDao;
import tpvol.persistence.IPassagerDao;
import tpvol.persistence.IReservationDao;
import tpvol.persistence.ITrajetDao;
import tpvol.persistence.jpa.PaiementDaoJpa;
import tpvol.persistence.jpa.PassagerDaoJpa;
import tpvol.persistence.jpa.ReservationDaoJpa;
import tpvol.persistence.jpa.TrajetDaoJpa;

public class Application {
	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("formation-tp-vol");
	private final IPaiementDao paiementDao = new PaiementDaoJpa();
	private final IPassagerDao passageDao = new PassagerDaoJpa();
	private final IReservationDao reservationDao = new ReservationDaoJpa();
	private final ITrajetDao trajetDao = new TrajetDaoJpa();

	public static Application getInstance() {
		return instance;
	}

	public static void setInstance(Application instance) {
		Application.instance = instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public IPaiementDao getPaiementDao() {
		return paiementDao;
	}

	public IPassagerDao getPassageDao() {
		return passageDao;
	}

	public IReservationDao getReservationDao() {
		return reservationDao;
	}

	public ITrajetDao getTrajetDao() {
		return trajetDao;
	}

}
