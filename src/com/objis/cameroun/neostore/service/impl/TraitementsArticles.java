package com.objis.cameroun.neostore.service.impl;

import java.util.List;
import java.util.Scanner;

import com.objis.cameroun.neostore.dao.DaoImpl;
import com.objis.cameroun.neostore.dao.IDao;
import com.objis.cameroun.neostore.domaine.Articles;
import com.objis.cameroun.neostore.service.ITraitementsArticles;


/**
 * @author "Magali TIKI"
 * Cette classe regroupe les traitements métiers d'enregistrement et affichage des détails d'un article
 *
 */
public class TraitementsArticles implements ITraitementsArticles {
	
	/**
	 * @param article
	 * Cette méthode permet à l'utilisateur d'entrer les détails d'un article 
	 */
	IDao dao;
	
	public TraitementsArticles() {
		dao = new DaoImpl();
		// TODO Auto-generated constructor stub
	}

	public int enregistrerArticleService (Articles article) {
		return dao.enregistrerArticleDao(article);
	}
	
	@Override
	// Generation de la reference et gestion de l'exception sur son format 
	
	public String genererReferenceService(Articles articl) throws Exception {
		
		if (articl.getMarque().length()<4)	{
			throw new Exception("La marque doit avoir au moins 4 caractères!");
		}
		else if (articl.getNom().length()<4) {
			articl.setReference(articl.getMarque()+ articl.getNom());
		}
		else {
			articl.setReference(articl.getMarque()+ articl.getNom().substring(0,3));
		}
		return articl.getReference();
	}
	
	
	//Cette methode permet de retourner une liste d'articles
	@Override
	public List<Articles> listArticlesService() {
		// TODO Auto-generated method stub
		return dao.listArticlesDao();
	}
	//Cette methode permet de rechercher un article
	@Override
	public List<Articles> RechercheArticlesService(String nomColonne, String valeurRecherchee) {
		// TODO Auto-generated method stub
		return dao.RechercheArticlesDao(nomColonne, valeurRecherchee);
	}

}
