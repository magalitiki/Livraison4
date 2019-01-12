package com.objis.cameroun.neostore.domaine;


/**
 * @author Magali TIKI
 *
 */
	// Propriétés
public class Articles {
	private int idArticle;
	private String reference;
	private String nom;
	private String fournisseur;
	private String marque;
	private int quantite;
	private int prixdevente;
	private int prixachat;
	
	// Constructeurs
	public Articles() {
		super();
	}

	 
	public Articles(String reference, String nom, String fournisseur, String marque, int quantite, int prixdevente,
			int prixachat) {
		super();
		this.reference = reference;
		this.nom = nom;
		this.fournisseur = fournisseur;
		this.marque = marque;
		this.quantite = quantite;
		this.prixdevente = prixdevente;
		this.prixachat = prixachat;
	}
	
	

	public Articles(int idArticle, String reference, String nom, String fournisseur, String marque, int quantite,
			int prixdevente, int prixachat) {
		super();
		this.idArticle = idArticle;
		this.reference = reference;
		this.nom = nom;
		this.fournisseur = fournisseur;
		this.marque = marque;
		this.quantite = quantite;
		this.prixdevente = prixdevente;
		this.prixachat = prixachat;
	}

	// Accesseurs et mutateurs
	public int getIdArticle() {
		return idArticle;
	}


	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getPrixdevente() {
		return prixdevente;
	}

	public void setPrixdevente(int prixdevente) {
		this.prixdevente = prixdevente;
	}

	public int getPrixachat() {
		return prixachat;
	}

	public void setPrixachat(int prixachat) {
		this.prixachat = prixachat;
	}


	@Override
	public String toString() {
		return "Articles [reference=" + reference + ", nom=" + nom + ", fournisseur=" + fournisseur + ", marque="
				+ marque + ", quantite=" + quantite + ", prixdevente=" + prixdevente + ", prixachat=" + prixachat + "]";
	}	
	
	
}
