package com.objis.cameroun.neostore.presentation;
import com.objis.cameroun.neostore.domaine.Articles;
import com.objis.cameroun.neostore.domaine.Fournisseur;
import com.objis.cameroun.neostore.service.ITraitementsArticles;
import com.objis.cameroun.neostore.service.ITraitementsFournisseur;
import com.objis.cameroun.neostore.service.impl.TraitementsArticles;
import com.objis.cameroun.neostore.service.impl.TraitementsFournisseur;

import java.util.List;
import java.util.Scanner; 

/**
 * @author "Magali TIKI"
 *
 */
public class Magasin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			Scanner ch = new Scanner(System.in);
			
			
			//while (choix=='o') {

			System.out.println ("Bienvenue dans mon application de gestion de supermarchés");
			System.out.println("\nVeuillez choisir:");
			System.out.println("\n'1' pour Enregistrer un article");
			System.out.println("\n'2' pour afficher tous les articles");
			System.out.println("\n'3' pour rechercher un article");
			System.out.println("\n'4' pour Enregistrer un fournisseur");
			System.out.println("\n'5' pour afficher tous les fournisseurs");
			System.out.println("\n'6' pour rechercher un fournisseur");
			int choix =ch.nextInt();
			
			switch (choix) {
			
			
			//Cas 1: enregistrement d'un nouvel article
			case 1: {
			ITraitementsArticles traitementsArticles = new TraitementsArticles();
			
			
			System.out.println("\nNous allons procéder à l'enregistrement d'un nouvel article");		
			
			System.out.println("\nVeuillez saisir le nom de l'article");
			String nom = sc.nextLine();
			
			System.out.println("Veuillez saisir le nom du fournisseur de l'article");
			String fournisseur = sc.nextLine();
		
			System.out.println("Veuillez saisir la marque de l'article");
			String marque = sc.nextLine();
			
			System.out.println("Veuillez saisir la quantité de l'article");
			int quantite = sc.nextInt();
			
			System.out.println("Veuillez saisir le prix d'achat de l'article");
			int prixachat = sc.nextInt();
			
			System.out.println("Veuillez saisir le prix de vente");
			int prixdevente = sc.nextInt();
			
			Articles art = new Articles();
			art.setNom(nom);
			art.setFournisseur(fournisseur);
			art.setMarque(marque);
			art.setQuantite(quantite);
			art.setPrixachat(prixachat);
			art.setPrixdevente(prixdevente);
			
			//String reference;
			String reference;
			try {
				reference=traitementsArticles.genererReferenceService(art);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			traitementsArticles.enregistrerArticleService(art);
			
			System.out.println();
			
			
			//}
			System.out.println("Enregistrement reussi!");
			break;
			}
			
			//Cas 2: affichage des articles enregistrés
			case 2 :{
				ITraitementsArticles traitement = new TraitementsArticles();
				List<Articles> listeart = traitement.listArticlesService();
				for(Articles article:listeart) {
					System.out.println("Idarticle: "+article.getIdArticle());
					System.out.println("Reference: "+article.getReference());
					System.out.println("Nom: "+article.getNom());
					System.out.println("Fournisseur: "+article.getFournisseur());
					System.out.println("Marque: "+article.getMarque());
					System.out.println("Quantite: "+article.getQuantite());
					System.out.println("Prix d\'achat: "+article.getPrixachat());
					System.out.println("Prix de vente: "+article.getPrixdevente());
					System.out.println();
				}
				break;
			}
			
			
			//Cas 3: Recherche d'un article
			case 3 :{
				System.out.println("\nVeuillez saisir exactement le nom de la colonne à rechercher tel qu'écrit ci-dessous");
				System.out.println("\nRechercher une reference ");
				System.out.println("\nou rechercher un nom ");
				System.out.println("\nou rechercher un fournisseur");
				System.out.println("\nou rechercher une marque");
				System.out.println();
				System.out.print("Colonne à rechercher: "); String colonne = sc.nextLine();
				System.out.print("Valeur à rechercher: "); String valeur = sc.nextLine();
				System.out.println();
				
				ITraitementsArticles traitementArticle = new TraitementsArticles();
				List<Articles> listeRech = traitementArticle.RechercheArticlesService(colonne, valeur);
				
				for(Articles article:listeRech) {
					System.out.println("Idarticle: "+article.getIdArticle());
					System.out.println("Reference: "+article.getReference());
					System.out.println("Nom: "+article.getNom());
					System.out.println("Fournisseur: "+article.getFournisseur());
					System.out.println("Marque: "+article.getMarque());
					System.out.println("Quantite: "+article.getQuantite());
					System.out.println("Prix d\'achat: "+article.getPrixachat());
					System.out.println("Prix de vente: "+article.getPrixdevente());
					System.out.println();
				}
				break;
			}
			
			//Cas 4: Enregistrement d'un fournisseur
			case 4:{
				ITraitementsFournisseur traitementsFournisseur = new TraitementsFournisseur();
				
				
				System.out.println("\nNous allons procéder à l'enregistrement d'un nouveau fournisseur");		
				
				System.out.println("\nVeuillez saisir le nom du fournisseur");
				String nomFournisseur = sc.nextLine();
				
				System.out.println("Veuillez saisir la raison sociale du fournisseur");
				String raisonSociale = sc.nextLine();
			
				System.out.println("Veuillez saisir l'adresse du fournisseur");
				String adresseFournisseur = sc.nextLine();
				
				System.out.println("Veuillez saisir la categorie d'articles du fournisseur");
				String categorieArticle = sc.nextLine();
				
				System.out.println("Veuillez saisir le numero de telephone du fournisseur");
				String telephone = sc.nextLine();
				
				Fournisseur four = new Fournisseur();
				four.setNomFournisseur(nomFournisseur);
				four.setRaisonSociale(raisonSociale);
				four.setAdresseFournisseur(adresseFournisseur);
				four.setCategorieArticle(categorieArticle);
				four.setTelephone(telephone);
				
				
				traitementsFournisseur.enregistrerFournisseurService(four);
				
				System.out.println();
				
				
				//}
				System.out.println("Enregistrement reussi!");
				break;
			}
			
			// Affichage de tous les fournisseurs enregistrés
			case 5:{
				ITraitementsFournisseur traitement = new TraitementsFournisseur();
				List<Fournisseur> listefour = traitement.listFournisseurService();
				for(Fournisseur fournisseur:listefour) {
					System.out.println("Idfournisseur: "+fournisseur.getIdFournisseur());
					System.out.println("Nom: "+fournisseur.getNomFournisseur());
					System.out.println("Raison sociale: "+fournisseur.getRaisonSociale());
					System.out.println("Adresse: "+fournisseur.getAdresseFournisseur());
					System.out.println("Categorie: "+fournisseur.getCategorieArticle());
					System.out.println("Telephone: "+fournisseur.getTelephone());
					System.out.println();
					System.out.println("Total fournisseurs: "+listefour.size());
				}
				break;
			}
			
			// Cas 6: Recherche d'un fournisseur
			case 6:{
				System.out.println("\nVeuillez saisir exactement le nom de la colonne à rechercher tel qu'écrit ci-dessous");
				System.out.println("\nou rechercher un nom");
				System.out.println("\nou rechercher une raison sociale");
				System.out.println("\nou rechercher une categorie");
				System.out.println();
				System.out.print("Colonne à rechercher: "); String colonne = sc.nextLine();
				System.out.print("Valeur à rechercher: "); String valeur = sc.nextLine();
				System.out.println();
				
				ITraitementsFournisseur traitementFournisseur = new TraitementsFournisseur();
				List<Fournisseur> listeRech = traitementFournisseur.RechercheFournisseurService(colonne, valeur);
				
				for(Fournisseur fournisseur:listeRech) {
					System.out.println("Idfournisseur: "+fournisseur.getIdFournisseur());
					System.out.println("nom: "+fournisseur.getNomFournisseur());
					System.out.println("Raison sociale: "+fournisseur.getRaisonSociale());
					System.out.println("Adresse: "+fournisseur.getAdresseFournisseur());
					System.out.println("Categorie: "+fournisseur.getCategorieArticle());
					System.out.println("Telephone: "+fournisseur.getTelephone());
				}
				break;
			}
			
			}		
			
		}
			
}
