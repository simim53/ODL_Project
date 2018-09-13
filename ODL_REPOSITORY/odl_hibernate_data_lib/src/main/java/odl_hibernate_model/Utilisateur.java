package odl_hibernate_model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * HIBERNATE table USERS with annotations
 *
 */

@Entity
@Table(name = "Users")
public class Utilisateur implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "USERID", nullable = false)
	private int userID;

	@Column(name = "AGE")
	private int age;

	@Column(name = "NOM")
	private String nom;

	@Column(name = "PRENOM")
	private String prenom;

	@Column(name = "TELEPHONE")
	private String telephonNumber;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "LOGIN", nullable = false)
	private String login;

	@Column(name = "PASSWORD")
	private String password;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_CREATEACCOUNT", nullable = false, updatable = false)
	@org.hibernate.annotations.Generated(org.hibernate.annotations.GenerationTime.ALWAYS)
	private Date dateCreateAccount;

	// @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_LASTCONNEXION")
	private String dateLastCon;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ADRESSEID")
	@JsonManagedReference
	private Adresse adresse;

	public Utilisateur(Adresse adresse, int userID, int age, String nom, String prenom, String telephonNumber,
			String email, String login, String password, Date dateCreateAccount, String dateLastCon) {
		super();
		this.adresse = adresse;
		this.userID = userID;
		this.age = age;
		this.nom = nom;
		this.prenom = prenom;
		this.telephonNumber = telephonNumber;
		this.email = email;
		this.login = login;
		this.password = password;
		this.dateCreateAccount = dateCreateAccount;
		this.dateLastCon = dateLastCon;
	}

	public Utilisateur() {

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTelephonNumber() {
		return telephonNumber;
	}

	public void setTelephonNumber(String telephonNumber) {
		this.telephonNumber = telephonNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateLastCon() {
		return dateLastCon;
	}

	public void setDateLastCon(String dateLastCon) {
		this.dateLastCon = dateLastCon;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public int getUserID() {
		return userID;
	}

	public Date getDateCreateAccount() {
		return dateCreateAccount;
	}

	public void setUserID(int userid) {
		this.userID = userid;
	}

	public void setDateCreateAccount(Date dateCreateAccount) {
		this.dateCreateAccount = dateCreateAccount;
	}

}
