package com.objis.cameroun.neostore.dao;

import java.util.List;

import com.objis.cameroun.neostore.domaine.Articles;
import com.objis.cameroun.neostore.domaine.Fournisseur;

/**
 * @author "Magali TIKI"
 *
 */
public interface IDao {
	
	// Methode permettant d'enregistrer un article
		public int enregistrerArticleDao (Articles article);
		
	// methode affichant tous les articles	
		public List<Articles> listArticlesDao();
		
		public List<Articles> RechercheArticlesDao(String nomColonne, String valeurRecherchee);
		
	// Methode permettant d'enregistrer un fournisseur
	   public int enregistrerFournisseurDao (Fournisseur fournisseur);
				
	// methode affichant tous les fournisseurs	
		public List<Fournisseur> listFournisseurDao();
				
		public List<Fournisseur> RechercheFournisseurDao(String nomColonne, String valeurRecherchee);
		
}
