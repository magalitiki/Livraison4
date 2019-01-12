package com.objis.cameroun.neostore.service.impl;

import java.util.List;
import java.util.Scanner;

import com.objis.cameroun.neostore.dao.DaoImpl;
import com.objis.cameroun.neostore.dao.IDao;
import com.objis.cameroun.neostore.domaine.Fournisseur;
import com.objis.cameroun.neostore.service.ITraitementsFournisseur;


/**
 * @author "Magali TIKI"
 * Cette classe regroupe les traitements métiers d'enregistrement et affichage des détails d'un fournisseur
 *
 */
public class TraitementsFournisseur implements ITraitementsFournisseur {
	
	/**
	 * @param fournisseur
	 * Cette méthode permet à l'utilisateur d'entrer les détails d'un fournisseur 
	 */
	IDao dao;
	
	public TraitementsFournisseur() {
		dao = new DaoImpl();
		// TODO Auto-generated constructor stub
	}

	public int enregistrerFournisseurService (Fournisseur fournisseur) {
		return dao.enregistrerFournisseurDao(fournisseur);
	}
	
	//Cette methode permet de retourner une liste de fournisseurs
	@Override
	public List<Fournisseur> listFournisseurService() {
		// TODO Auto-generated method stub
		return dao.listFournisseurDao();
	}

	//Cette methode permet de rechercher un fournisseur
	@Override
	public List<Fournisseur> RechercheFournisseurService(String nomColonne, String valeurRecherchee) {
		// TODO Auto-generated method stub
		return dao.RechercheFournisseurDao(nomColonne, valeurRecherchee);
	}

}
