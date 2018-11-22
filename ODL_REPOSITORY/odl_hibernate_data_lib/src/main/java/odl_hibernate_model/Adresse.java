package odl_hibernate_model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * HIBERNATE table ADRESSE with annotations
 *
 */

@Entity
@Table(name = "Adresses")
public class Adresse implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "ADRESSEID", nullable = false)
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

	@OneToMany(cascade=CascadeType.ALL,mappedBy = "adresse")
	@JsonBackReference
	private List<Utilisateur> utilisateurs;

	public Adresse() {
	}

	public Adresse(int adresseID, int numero, int codepostal, String rue, String ville, String pays,
			String complement) {
		super();
		this.adresseID = adresseID;
		this.numero = numero;
		this.codepostal = codepostal;
		this.rue = rue;
		this.ville = ville;
		this.pays = pays;
		this.complement = complement;
	}

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

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

}
