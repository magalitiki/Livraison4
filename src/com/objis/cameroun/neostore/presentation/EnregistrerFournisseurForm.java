package com.objis.cameroun.neostore.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.neostore.domaine.Fournisseur;
import com.objis.cameroun.neostore.service.ITraitementsFournisseur;
import com.objis.cameroun.neostore.service.impl.TraitementsFournisseur;

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
public class EnregistrerFournisseurForm extends JFrame {

	private JPanel contentPane;
	private JTextField nomTextField;
	private JTextField raisoSoTextField;
	private JTextField adresseTextField;
	private JTextField categorieTextField;
	private JTextField telephoneTextField;


	/**
	 * Create the frame.
	 */
	public EnregistrerFournisseurForm() {
		setTitle("Enregistrer un fournisseur");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 393, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nomTextField = new JTextField();
		nomTextField.setBounds(145, 23, 226, 30);
		contentPane.add(nomTextField);
		nomTextField.setColumns(10);
		
		raisoSoTextField = new JTextField();
		raisoSoTextField.setColumns(10);
		raisoSoTextField.setBounds(145, 64, 226, 30);
		contentPane.add(raisoSoTextField);
		
		adresseTextField = new JTextField();
		adresseTextField.setColumns(10);
		adresseTextField.setBounds(145, 105, 226, 30);
		contentPane.add(adresseTextField);
		
		categorieTextField = new JTextField();
		categorieTextField.setColumns(10);
		categorieTextField.setBounds(145, 144, 226, 28);
		contentPane.add(categorieTextField);
		
		telephoneTextField = new JTextField();
		telephoneTextField.setColumns(10);
		telephoneTextField.setBounds(145, 185, 226, 30);
		contentPane.add(telephoneTextField);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNom.setBounds(10, 23, 55, 28);
		contentPane.add(lblNom);
		
		JLabel lblRaisonSociale = new JLabel("Raison sociale");
		lblRaisonSociale.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRaisonSociale.setBounds(10, 66, 92, 20);
		contentPane.add(lblRaisonSociale);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAdresse.setBounds(10, 105, 92, 24);
		contentPane.add(lblAdresse);
		
		JLabel lblCategorieFournisseur = new JLabel("Categorie fournisseur");
		lblCategorieFournisseur.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCategorieFournisseur.setBounds(10, 144, 129, 22);
		contentPane.add(lblCategorieFournisseur);
		
		JLabel lblTelephone = new JLabel("Telephone");
		lblTelephone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTelephone.setBounds(10, 183, 115, 24);
		contentPane.add(lblTelephone);
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Recuperation des valeurs saisies par l'utilisateur
				String nom = nomTextField.getText();
				String raisonSociale = raisoSoTextField.getText();
				String adresse = adresseTextField.getText();
				String categorie = categorieTextField.getText();
				String telephone = telephoneTextField.getText();
				
				// Creation d'un objet fournisseur et initialisation de ses attributs
				Fournisseur fournisseur = new Fournisseur ();
				fournisseur.setNomFournisseur(nom);
				fournisseur.setRaisonSociale(raisonSociale);
				fournisseur.setAdresseFournisseur(adresse);
				fournisseur.setCategorieArticle(categorie);
				fournisseur.setTelephone(telephone);
				
				// Enregistrement de l'objet fournisseur dans la BD via la couche service; appel de la couche service
				
				ITraitementsFournisseur service = new TraitementsFournisseur();
				
				//Appel de la methode enregistrerFournisseurService de la couche service
				
				int statuts;
				
				statuts = service.enregistrerFournisseurService(fournisseur);
				
				if(statuts == 1) {
					  JOptionPane.showMessageDialog(null, "Article " + fournisseur.getNomFournisseur() + 
							  " enregistré dans la BD!");
					  
					  nomTextField.setText("");
					  raisoSoTextField.setText("");
					  adresseTextField.setText("");
					  categorieTextField.setText("");
					  telephoneTextField.setText("");
					  
				  }else {
					  JOptionPane.showMessageDialog(null, 
							  "Erreur lors de l'enregistrement de l'fournisseur!");
				  }
			}
		});
		btnEnregistrer.setBounds(262, 234, 99, 23);
		contentPane.add(btnEnregistrer);
	}
}
