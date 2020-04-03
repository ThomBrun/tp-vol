package tpvol.testDao;

import tpvol.Application;
import tpvol.model.Ville;
import tpvol.persistence.IVilleDao;

public class TestTpvolJpa {

	public static void main(String[] args) {
		
		IVilleDao villeDao = Application.getInstance().getVilleDao();
		
		
		Ville paris = new Ville("Paris", "ORLY");
		
		paris = villeDao.save(paris);

	}

}
