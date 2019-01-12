package com.objis.cameroun.neostore.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.neostore.domaine.ArticleModel;
import com.objis.cameroun.neostore.domaine.Articles;
import com.objis.cameroun.neostore.domaine.Fournisseur;
import com.objis.cameroun.neostore.domaine.FournisseurModel;
import com.objis.cameroun.neostore.service.ITraitementsArticles;
import com.objis.cameroun.neostore.service.ITraitementsFournisseur;
import com.objis.cameroun.neostore.service.impl.TraitementsArticles;
import com.objis.cameroun.neostore.service.impl.TraitementsFournisseur;

/**
 * @author "Magali TIKI"
 *
 */
public class ResultatRechercheFournisseur extends JFrame {

	private JPanel contentPane;
	private JTable table;


	/**
	 * Create the frame.
	 */
	public ResultatRechercheFournisseur(String choix, String search) {
		setTitle("Fournisseur(s) recherch\u00E9(s)");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(600, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout());
		
		ITraitementsFournisseur service = new TraitementsFournisseur();
		FournisseurModel fourmodel = new FournisseurModel();
		List<Fournisseur> four = service.RechercheFournisseurService(choix, search);
		fourmodel.setData(four);
		table = new JTable(fourmodel);
		JScrollPane bardef = new JScrollPane(table);
		contentPane.add(bardef);
	}

}
