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
	private Utilisateur user = new Utilisateur();

	@Test
	public void getAdresse() {
		adresse.setAdresseID(1);
		user.setAdresse(adresse);
		Assert.assertSame(user.getAdresse().getAdresseID(), 1);
	}
	@Test
	public void getAge() {
		user.setAge(age);
		Assert.assertSame(user.getAge(), age);
	}

	@Test
	public void getDateCreateAccount() {
		user.setDateCreateAccount(datecreation);
		Assert.assertSame(user.getDateCreateAccount(), datecreation);
	}

	@Test
	public void getDateLastCon() {
		user.setDateLastCon(datelogin);
		Assert.assertSame(user.getDateLastCon(), datelogin);
	}

	@Test
	public void getLogin() {
		user.setLogin(login);
		Assert.assertSame(user.getLogin(), login);
	}

	@Test
	public void getNom() {
		user.setNom(nom);
		Assert.assertSame(user.getNom(), nom);
	}

	@Test
	public void getPrenom() {
		user.setPrenom(prenom);
		Assert.assertSame(user.getPrenom(), prenom);
	}

	@Test
	public void getPassword() {
		user.setPassword(password);
		Assert.assertSame(user.getPassword(), password);
	}

	@Test
	public void getTelephonNumber() {
		user.setTelephonNumber(telephone);
		Assert.assertSame(user.getTelephonNumber(), telephone);
	}

	@Test
	public void getEmail() {
		user.setEmail(email);
		Assert.assertSame(user.getEmail(), email);
	}

	@Test
	public void getUserID() {
		user.setUserID(userid);
		Assert.assertSame(user.getUserID(), userid);

	}
}