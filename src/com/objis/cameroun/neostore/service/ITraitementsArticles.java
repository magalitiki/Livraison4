package com.objis.cameroun.neostore.service;

import com.objis.cameroun.neostore.domaine.Articles;

import java.util.List;

/**
 * @author "Magali TIKI"
 *
 */
public interface ITraitementsArticles {
	
	// Methode permettant d'enregistrer un article
	public int enregistrerArticleService (Articles article);
	
	// methode affichant tous les articles
	public List<Articles> listArticlesService();
	
	//Methode de recherche d'un article
	public List<Articles> RechercheArticlesService(String nomColonne, String valeurRecherchee);
	
	// Methode permettant de générer la reference d'un article
	public String genererReferenceService(Articles articl) throws Exception;
	
	
}
