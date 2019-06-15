package odl_hibernate_model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * HIBERNATE table ADRESSE with annotations
 *
 */

@Entity
@Table(name = "ADRESSES")
public class Adresse implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ADRESSEID")
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	private int adresseID;

	@Column(name = "NUMERO")
	private int numero;

	@Column(name = "CODEPOSTAL")
	private int codepostal;

	@Column(name = "RUE")
	private String rue;

	@Column(name = "VILLE")
	private String ville;

	@Column(name = "PAYS")
	private String pays;

	@Column(name = "COMPLEMENT")
	private String complement;

	@OneToOne(mappedBy = "adresse")
	@JsonBackReference
	private Utilisateur utilisateur;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCodepostal() {
		return codepostal;
	}

	public void setCodepostal(int codepostal) {
		this.codepostal = codepostal;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public int getAdresseID() {
		return adresseID;
	}

	public void setAdresseID(int adresseID) {
		this.adresseID = adresseID;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}
