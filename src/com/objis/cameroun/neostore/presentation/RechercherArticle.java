package com.objis.cameroun.neostore.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.neostore.domaine.ArticleModel;
import com.objis.cameroun.neostore.domaine.Articles;
import com.objis.cameroun.neostore.service.ITraitementsArticles;
import com.objis.cameroun.neostore.service.impl.TraitementsArticles;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JTable;

import java.awt.Choice;

/**
 * @author "Magali TIKI"
 *
 */
public class RechercherArticle extends JFrame {
	
	private String refArtice = "reference";
	private String nomArticle = "nom";
	private String nomFournisseur = "fournisseur";
	private String nomMarque = "marque";
	private String choix;
	private JPanel contentPane;
	private JTextField searchTextField;

	/**
	 * Create the frame.
	 */
	public RechercherArticle() {
		setTitle("Rechercher un article");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(413, 190);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVeuillerSaisirLe = new JLabel("Veuillez ensuite saisir la valeur correspondant au champ s\u00E9lectionn\u00E9");
		lblVeuillerSaisirLe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVeuillerSaisirLe.setBounds(10, 95, 390, 20);
		contentPane.add(lblVeuillerSaisirLe);
		
		searchTextField = new JTextField();
		searchTextField.setBounds(10, 126, 268, 25);
		contentPane.add(searchTextField);
		searchTextField.setColumns(10);
		
		
		JLabel lblVeuillezSelectionnerLa = new JLabel("Veuillez selectionner le champ \u00E0 rechercher");
		lblVeuillezSelectionnerLa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVeuillezSelectionnerLa.setBounds(10, 28, 335, 20);
		contentPane.add(lblVeuillezSelectionnerLa);
		
		Choice choice = new Choice();
		choice.setBounds(10, 58, 162, 20);
		choice.add(refArtice);
		choice.add(nomArticle);
		choice.add(nomFournisseur);
		choice.add(nomMarque);
		contentPane.add(choice);
		

		JButton btnRechercher = new JButton("Rechercher");
		btnRechercher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String search = searchTextField.getText();
				choix = choice.getSelectedItem();
				ResultatRecherchArticle frame = new ResultatRecherchArticle(choix, search);
				frame.setVisible(true);
				
			}
		});
		btnRechercher.setBounds(288, 126, 112, 25);
		contentPane.add(btnRechercher);
	}
}
