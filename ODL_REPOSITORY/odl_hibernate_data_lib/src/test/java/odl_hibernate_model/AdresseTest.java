package odl_hibernate_model;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class AdresseTest {

	final static Logger logger = Logger.getLogger(AdresseTest.class);

	private int adresseid = 1;
	private int numero = 1;
	private int codepostal = 35000;
	private String rue = "rue du cidre";
	private String ville = "Rennes";
	private String pays = "FRANCE";
	private String complement = "";
	private Adresse adr = new Adresse();

	private Utilisateur utilisateur = new Utilisateur();
	private int userid = 1;

	@Test
	public void createAdresse() {

		adr.setAdresseID(adresseid);
		adr.setNumero(numero);
		adr.setCodepostal(codepostal);
		adr.setComplement(complement);
		adr.setPays(pays);
		adr.setRue(rue);
		adr.setVille(ville);

		utilisateur.setUserID(userid);
		adr.setUtilisateur(utilisateur);

		Assert.assertEquals(adr.getUtilisateur().getUserID(), userid);

		Assert.assertEquals(adr.getAdresseID(), adresseid);
		Assert.assertEquals(adr.getNumero(), numero);
		Assert.assertEquals(adr.getCodepostal(), codepostal);
		Assert.assertSame(adr.getComplement(), complement);
		Assert.assertSame(adr.getPays(), pays);
		Assert.assertSame(adr.getRue(), rue);
		Assert.assertSame(adr.getVille(), ville);

	}
}