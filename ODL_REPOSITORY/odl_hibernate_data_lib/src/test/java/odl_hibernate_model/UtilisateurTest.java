package odl_hibernate_model;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;


public class UtilisateurTest {

	final static Logger logger = Logger.getLogger(UtilisateurTest.class);

	private int userid = 1;
	private int age = 20;
	private String nom = "testnom";
	private String prenom = "testprenom";
	private String telephone = "9999999999";
	private String email = "test@test.com";
	private String login = "testprenom";
	private String password = "testprenom";
	private Date datecreation = new Date();
	private String datelogin = "01/01/1990 - 22h22:22";
	private Adresse adresse = new Adresse();

	@Test
	public void createUtilisateur() {

		Utilisateur user = new Utilisateur();

		adresse.setAdresseID(1);

		user.setAdresse(adresse);
		user.setAge(age);
		user.setDateCreateAccount(datecreation);
		user.setDateLastCon(datelogin);
		user.setLogin(login);
		user.setNom(nom);
		user.setPrenom(prenom);
		user.setPassword(password);
		user.setTelephonNumber(telephone);
		user.setEmail(email);
		user.setUserID(userid);

		Assert.assertSame(user.getAdresse().getAdresseID(), 1);
		Assert.assertSame(user.getAge(), age);
		Assert.assertSame(user.getDateCreateAccount(), datecreation);
		Assert.assertSame(user.getDateLastCon(), datelogin);
		Assert.assertSame(user.getLogin(), login);
		Assert.assertSame(user.getNom(), nom);
		Assert.assertSame(user.getPrenom(), prenom);
		Assert.assertSame(user.getPassword(), password);
		Assert.assertSame(user.getTelephonNumber(), telephone);
		Assert.assertSame(user.getEmail(), email);
		Assert.assertSame(user.getUserID(), userid);

	}

}