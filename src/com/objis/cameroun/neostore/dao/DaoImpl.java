package com.objis.cameroun.neostore.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import com.objis.cameroun.neostore.domaine.Articles;
import com.objis.cameroun.neostore.domaine.Fournisseur;

/**
 * @author "Magali TIKI"
 *
 */
public class DaoImpl implements IDao{
	
	//Cette methode permet d'enregistrer un article dans la table article
	@Override
	public int enregistrerArticleDao(Articles article) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = ConnectionMYSQL.getInstance();
			PreparedStatement ps = connection.prepareStatement("insert into article(reference,nom,fournisseur,marque,quantite,prixAchat,prixVente) values(?,?,?,?,?,?,?)");
			
			ps.setString(1, article.getReference());
			ps.setString(2, article.getNom());
			ps.setString(3, article.getFournisseur());
			ps.setString(4, article.getMarque());
			ps.setInt(5, article.getQuantite());
			ps.setInt(6, article.getPrixachat());
			ps.setInt(7, article.getPrixdevente());
			ps.executeUpdate();
			
			return 1;
	
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
			return 0;
		}
		
	}

	//Cette methode permet de retourner la liste de tous les articles enregistrés dans la BD
	@Override
	public List<Articles> listArticlesDao() {
		List<Articles> liste = new ArrayList<Articles>();
		try {
			Connection connection = ConnectionMYSQL.getInstance();
			PreparedStatement ps = connection.prepareStatement("select * from article");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Articles ar = new Articles();
				ar.setIdArticle(rs.getInt(1));
				ar.setReference(rs.getString(2));
				ar.setNom(rs.getString(3));
				ar.setFournisseur(rs.getString(4));
				ar.setMarque(rs.getString(5));
				ar.setQuantite(rs.getInt(6));
				ar.setPrixachat(rs.getInt(7));
				ar.setPrixdevente(rs.getInt(8));
				
				liste.add(ar);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return liste;
	}

	//Cette methode permet de rechercher un enregistrement de la table article
	@Override
	public List<Articles> RechercheArticlesDao(String nomColonne, String valeurRecherchee) {
		List<Articles> list = new ArrayList<Articles>();
		try {
			Connection connection = ConnectionMYSQL.getInstance();
			PreparedStatement ps = connection.prepareStatement("select * from article where "+nomColonne+" like ?");
			ps.setString(1, '%'+valeurRecherchee+'%');
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Articles art = new Articles();
				art.setIdArticle(rs.getInt(1));
				art.setReference(rs.getString(2));
				art.setNom(rs.getString(3));
				art.setFournisseur(rs.getString(4));
				art.setMarque(rs.getString(5));
				art.setQuantite(rs.getInt(6));
				art.setPrixachat(rs.getInt(7));
				art.setPrixdevente(rs.getInt(8));
				
				list.add(art);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}


	//Cette methode permet d'enregistrer un fournisseur dans la table fournisseur
	@Override
	public int enregistrerFournisseurDao(Fournisseur fournisseur) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = ConnectionMYSQL.getInstance();
			PreparedStatement ps = connection.prepareStatement("insert into fournisseur(nom,raisonSociale,adresse,categorie,telephone) values(?,?,?,?,?)");
			
			ps.setString(1, fournisseur.getNomFournisseur());
			ps.setString(2, fournisseur.getRaisonSociale());
			ps.setString(3, fournisseur.getAdresseFournisseur());
			ps.setString(4, fournisseur.getCategorieArticle());
			ps.setString(5, fournisseur.getTelephone());
			ps.executeUpdate();
			return 1;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
			return 0;
		}
	}


	//Cette methode permet de retourner la liste de tous les fournisseurs enregistrés dans la BD
	@Override
	public List<Fournisseur> listFournisseurDao() {
		// TODO Auto-generated method stub
		List<Fournisseur> list = new ArrayList<Fournisseur>();
		try {
			Connection connection = ConnectionMYSQL.getInstance();
			PreparedStatement ps = connection.prepareStatement("select * from fournisseur");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Fournisseur four = new Fournisseur();
				four.setIdFournisseur(rs.getInt(1));
				four.setNomFournisseur(rs.getString(2));
				four.setRaisonSociale(rs.getString(3));
				four.setAdresseFournisseur(rs.getString(4));
				four.setCategorieArticle(rs.getString(5));
				four.setTelephone(rs.getString(6));
				
				list.add(four);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}


	//Cette methode permet de rechercher un enregistrement de la table fournisseur
	@Override
	public List<Fournisseur> RechercheFournisseurDao(String nomColonne, String valeurRecherchee) {
		// TODO Auto-generated method stub
		List<Fournisseur> list = new ArrayList<Fournisseur>();
		try {
			Connection connection = ConnectionMYSQL.getInstance();
			PreparedStatement ps = connection.prepareStatement("select * from fournisseur where "+nomColonne+" like ?");
			ps.setString(1, '%'+valeurRecherchee+'%');
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Fournisseur four = new Fournisseur();
				four.setIdFournisseur(rs.getInt(1));
				four.setNomFournisseur(rs.getString(2));
				four.setRaisonSociale(rs.getString(3));
				four.setAdresseFournisseur(rs.getString(4));
				four.setCategorieArticle(rs.getString(5));
				four.setTelephone(rs.getString(6));
				
				list.add(four);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
