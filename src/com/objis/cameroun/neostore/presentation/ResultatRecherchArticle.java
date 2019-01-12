package com.objis.cameroun.neostore.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.neostore.domaine.ArticleModel;
import com.objis.cameroun.neostore.domaine.Articles;
import com.objis.cameroun.neostore.service.ITraitementsArticles;
import com.objis.cameroun.neostore.service.impl.TraitementsArticles;

import javax.swing.JTable;

/**
 * @author "Magali TIKI"
 *
 */
public class ResultatRecherchArticle extends JFrame {

	private JPanel contentPane;
	private JTable table;


	/**
	 * Create the frame.
	 */
	public ResultatRecherchArticle(String choix, String search) {
		setTitle("Article(s) recherch\u00E9(s)");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(600, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout());
		
		ITraitementsArticles service = new TraitementsArticles();
		ArticleModel artmodel = new ArticleModel();
		List<Articles> art = service.RechercheArticlesService(choix, search);
		artmodel.setData(art);
		table = new JTable(artmodel);
		JScrollPane bardef = new JScrollPane(table);
		
		//table.setBounds(0, 0, 434, 261);
		contentPane.add(bardef);
	}

}
