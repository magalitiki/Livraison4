package com.objis.cameroun.neostore.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.objis.cameroun.neostore.domaine.Articles;
import com.objis.cameroun.neostore.service.ITraitementsArticles;
import com.objis.cameroun.neostore.service.impl.TraitementsArticles;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author "Magali TIKI"
 *
 */
public class EnregistrerArticleForm extends JFrame {

	private JPanel contentPane;
	private JTextField nomTextField;
	private JTextField fournisseurTextField;
	private JTextField marqueTextField;
	private JTextField quantiteTextField;
	private JTextField prixVenteTextField;
	private JTextField prixAchatTextField;
	private JButton btnEnregistrer;

	/**
	 * Create the frame.
	 */
	public EnregistrerArticleForm() {
		setTitle("Enregistrer un article");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 432, 328);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nomTextField = new JTextField();
		nomTextField.setBounds(106, 29, 300, 27);
		contentPane.add(nomTextField);
		nomTextField.setColumns(10);
		
		fournisseurTextField = new JTextField();
		fournisseurTextField.setColumns(10);
		fournisseurTextField.setBounds(106, 67, 300, 27);
		contentPane.add(fournisseurTextField);
		
		marqueTextField = new JTextField();
		marqueTextField.setColumns(10);
		marqueTextField.setBounds(106, 104, 300, 27);
		contentPane.add(marqueTextField);
		
		quantiteTextField = new JTextField();
		quantiteTextField.setColumns(10);
		quantiteTextField.setBounds(106, 142, 300, 27);
		contentPane.add(quantiteTextField);
		
		prixVenteTextField = new JTextField();
		prixVenteTextField.setColumns(10);
		prixVenteTextField.setBounds(106, 180, 300, 27);
		contentPane.add(prixVenteTextField);
		
		prixAchatTextField = new JTextField();
		prixAchatTextField.setColumns(10);
		prixAchatTextField.setBounds(106, 218, 300, 27);
		contentPane.add(prixAchatTextField);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNom.setBounds(24, 35, 98, 21);
		contentPane.add(lblNom);
		
		JLabel lblFournisseur = new JLabel("Fournisseur");
		lblFournisseur.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFournisseur.setBounds(24, 67, 72, 27);
		contentPane.add(lblFournisseur);
		
		JLabel lblMarque = new JLabel("Marque");
		lblMarque.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMarque.setBounds(24, 106, 98, 21);
		contentPane.add(lblMarque);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9");
		lblQuantit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblQuantit.setBounds(24, 144, 72, 21);
		contentPane.add(lblQuantit);
		
		JLabel lblPrixDeVente = new JLabel("Prix de vente");
		lblPrixDeVente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPrixDeVente.setBounds(24, 186, 98, 14);
		contentPane.add(lblPrixDeVente);
		
		JLabel lblPrixDachat = new JLabel("Prix d'achat");
		lblPrixDachat.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPrixDachat.setBounds(24, 224, 98, 21);
		contentPane.add(lblPrixDachat);
		
		btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Recuperation des valeurs saisies par l'utilisateur
				String nom = nomTextField.getText();
				String fournisseur = fournisseurTextField.getText();
				String marque = marqueTextField.getText();
				int quantite = Integer.parseInt(quantiteTextField.getText());
				int prixvente = Integer.parseInt(prixVenteTextField.getText());
				int prixachat = Integer.parseInt(prixAchatTextField.getText());
				
				// Creation d'un objet article et initialisation de ses attributs
				Articles article = new Articles ();
				article.setNom(nom);
				article.setFournisseur(fournisseur);
				article.setMarque(marque);
				article.setQuantite(quantite);
				article.setPrixdevente(prixvente);
				article.setPrixachat(prixachat);
				
				// Enregistrement de l'objet article dans la BD via la couche service; appel de la couche service
				
				ITraitementsArticles service = new TraitementsArticles();
				
				//Appel de la methode enregistrerAritcleService de la couche service
				
				String reference;
				try {
					reference=service.genererReferenceService(article);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				int statuts;
				
				statuts = service.enregistrerArticleService(article);
				
				if(statuts == 1) {
					  JOptionPane.showMessageDialog(null, "Article " + article.getNom() + 
							  " enregistré dans la BD!");
					  
					  nomTextField.setText("");
					  fournisseurTextField.setText("");
					  marqueTextField.setText("");
					  quantiteTextField.setText("");
					  prixVenteTextField.setText("");
					  prixAchatTextField.setText("");
					  
				  }else {
					  JOptionPane.showMessageDialog(null, 
							  "Erreur lors de l'enregistrement de l'article!");
				  }
			}
		});
		btnEnregistrer.setBounds(301, 256, 105, 23);
		contentPane.add(btnEnregistrer);
	}
}
