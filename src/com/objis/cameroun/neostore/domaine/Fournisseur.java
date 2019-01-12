package com.objis.cameroun.neostore.domaine;

/**
 * @author "Magali TIKI"
 *
 */
//Propriétés
public class Fournisseur {
	private int idFournisseur ;
	private String nomFournisseur;
	private String raisonSociale;
	private String adresseFournisseur;
	private String categorieArticle;
	private String telephone;
	
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Constructeurs
	public Fournisseur(int idFournisseur, String nomFournisseur, String raisonSociale, String adresseFournisseur,
			String categorieArticle, String telephone) {
		super();
		this.idFournisseur = idFournisseur;
		this.nomFournisseur = nomFournisseur;
		this.raisonSociale = raisonSociale;
		this.adresseFournisseur = adresseFournisseur;
		this.categorieArticle = categorieArticle;
		this.telephone = telephone;
	}

	public Fournisseur(String nomFournisseur, String raisonSociale, String adresseFournisseur, String categorieArticle,
			String telephone) {
		super();
		this.nomFournisseur = nomFournisseur;
		this.raisonSociale = raisonSociale;
		this.adresseFournisseur = adresseFournisseur;
		this.categorieArticle = categorieArticle;
		this.telephone = telephone;
	}

	// Accesseurs et mutateurs
	public int getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(int idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public String getNomFournisseur() {
		return nomFournisseur;
	}

	public void setNomFournisseur(String nomFournisseur) {
		this.nomFournisseur = nomFournisseur;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getAdresseFournisseur() {
		return adresseFournisseur;
	}

	public void setAdresseFournisseur(String adresseFournisseur) {
		this.adresseFournisseur = adresseFournisseur;
	}

	public String getCategorieArticle() {
		return categorieArticle;
	}

	public void setCategorieArticle(String categorieArticle) {
		this.categorieArticle = categorieArticle;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Fournisseur [idFournisseur=" + idFournisseur + ", nomFournisseur=" + nomFournisseur + ", raisonSociale="
				+ raisonSociale + ", adresseFournisseur=" + adresseFournisseur + ", categorieArticle="
				+ categorieArticle + ", telephone=" + telephone + "]";
	}

}
