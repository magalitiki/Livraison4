package com.objis.cameroun.neostore.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Choice;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author "Magali TIKI"
 *
 */
public class RechercherFournisseur extends JFrame {
	
	private String nomFournisseur = "nom";
	private String raisonsociale = "raisonSociale";
	private String categorieArticle = "categorie";
	private String choix;
	private JPanel contentPane;
	private JTextField searchTextField;


	/**
	 * Create the frame.
	 */
	public RechercherFournisseur() {
		setTitle("Rechercher un fournisseur");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 426, 163);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Veuillez selectionner le champ \u00E0 rechercher");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(10, 11, 335, 20);
		contentPane.add(label);
		
		Choice choice = new Choice();
		choice.setBounds(10, 37, 162, 20);
		choice.add(nomFournisseur);
		choice.add(raisonsociale);
		choice.add(categorieArticle);
		
		
		contentPane.add(choice);
		
		
		JLabel label_1 = new JLabel("Veuillez ensuite saisir la valeur correspondant au champ s\u00E9lectionn\u00E9");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(10, 63, 390, 20);
		contentPane.add(label_1);
		
		
		JButton button = new JButton("Rechercher");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				choix = choice.getSelectedItem();
				String search = searchTextField.getText();
				ResultatRechercheFournisseur frame = new ResultatRechercheFournisseur(choix, search);
				frame.setVisible(true);
			}
		});
		button.setBounds(288, 94, 112, 25);
		contentPane.add(button);
		
		searchTextField = new JTextField();
		searchTextField.setColumns(10);
		searchTextField.setBounds(10, 94, 268, 25);
		contentPane.add(searchTextField);
	}
}
