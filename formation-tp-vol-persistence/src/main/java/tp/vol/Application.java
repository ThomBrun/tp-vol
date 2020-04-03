package tp.vol;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.formation.Application;
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
	
	private final IUtilisateurDao utilisateurDao = new UtilisateurDaoJpa();
	private final IClientDao clientDao = new ClientDaoJpa();
	private final ISocieteDao societeDao = new SocieteDaoJpa();
	private final IParticulierDao particulierDao = new ParticulierDaoJpa();
	
	private final IVolDao volDao = new VolDaoJpa();
	private final ICompagnieDao compagnieDao = new CompagnieDaoJpa();
	private final IAvionDao avionDao = new AvionDaoJpa();
	private final IDepartDao departDao = new DepartDaoJpa();
	private final IArriveeDao arriveeDao = new ArriveeDaoJpa();
	private final IAeroportDao aeroportDao = new AeroportDaoJpa();
	private final IVilleDao villeDao = new VilleDaoJpa();
	
	private Application() {
		
	}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

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
	
	public IUtilisateurDao getUtilisateurDao() {
		return utilisateurDao;
	}

	public IClientDao getClientDao() {
		return clientDao;
	}

	public ISocieteDao getSocieteDao() {
		return societeDao;
	}

	public IParticulierDao getParticulierDao() {
		return particulierDao;
	}

	public IVolDao getVolDao() {
		return volDao;
	}

	public ICompagnieDao getCompagnieDao() {
		return compagnieDao;
	}

	public IAvionDao getAvionDao() {
		return avionDao;
	}

	public IDepartDao getDepartDao() {
		return departDao;
	}

	public IArriveeDao getArriveeDao() {
		return arriveeDao;
	}

	public IAeroportDao getAeroportDao() {
		return aeroportDao;
	}

	public IVilleDao getVilleDao() {
		return villeDao;
	}


}
