package com.objis.cameroun.neostore.presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author "Magali TIKI"
 *
 */
public class MagasinForm {

	private JFrame frmNeostore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MagasinForm window = new MagasinForm();
					window.frmNeostore.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MagasinForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNeostore = new JFrame();
		frmNeostore.getContentPane().setBackground(Color.PINK);
		frmNeostore.setBounds(100, 100, 800, 600);
		frmNeostore.setLocationRelativeTo(null);
		frmNeostore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNeostore.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Cyrille TIKI\\Desktop\\imgSupermarche2.jpg"));
		lblNewLabel.setBounds(87, 145, 620, 384);
		frmNeostore.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bienvenue sur NeoStore");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 18));
		lblNewLabel_1.setBounds(278, 61, 216, 28);
		frmNeostore.getContentPane().add(lblNewLabel_1);
		
		JLabel lblLogicielDeGestion = new JLabel("Logiciel de gestion professionnelle de supermarch\u00E9s");
		lblLogicielDeGestion.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		lblLogicielDeGestion.setBounds(205, 107, 356, 28);
		frmNeostore.getContentPane().add(lblLogicielDeGestion);
		
		JMenuBar menuBar = new JMenuBar();
		frmNeostore.setJMenuBar(menuBar);
		
		//Menu Fournisseur
		JMenu mnEnregistrerFournisseur = new JMenu("Fournisseur");
		menuBar.add(mnEnregistrerFournisseur);
		
		JMenuItem mntmEnregistrerFournisseur = new JMenuItem("Enregistrer fournisseur");
		mntmEnregistrerFournisseur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EnregistrerFournisseurForm frame = new EnregistrerFournisseurForm();
				frame.setVisible(true);
			}
		});
		mnEnregistrerFournisseur.add(mntmEnregistrerFournisseur);
		
		JMenuItem mntmRechercherFournisseur = new JMenuItem("Rechercher fournisseur");
		mntmRechercherFournisseur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RechercherFournisseur frame = new RechercherFournisseur();
				frame.setVisible(true);
			}
		});
		mnEnregistrerFournisseur.add(mntmRechercherFournisseur);
		
		JMenuItem mntmAfficherLesFournisseurs = new JMenuItem("Afficher les fournisseurs");
		mntmAfficherLesFournisseurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AfficherListeFournisseur frame = new AfficherListeFournisseur();
				frame.setVisible(true);

			}
		});
		mnEnregistrerFournisseur.add(mntmAfficherLesFournisseurs);
		
		//Menu Article
		JMenu mnArticle = new JMenu("Article");
		menuBar.add(mnArticle);
		
		JMenuItem mntmEnregistrerArticle = new JMenuItem("Enregistrer article");
		mntmEnregistrerArticle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EnregistrerArticleForm frame = new EnregistrerArticleForm();
				frame.setVisible(true);
			}
		});
		mnArticle.add(mntmEnregistrerArticle);
		
		JMenuItem mntmRechercherArticle = new JMenuItem("Rechercher article");
		mntmRechercherArticle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RechercherArticle frame = new RechercherArticle();
				frame.setVisible(true);
			}
		});
		mnArticle.add(mntmRechercherArticle);
		
		JMenuItem mntmAfficherLesArticles = new JMenuItem("Afficher les articles");
		mntmAfficherLesArticles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AfficherListeArticle frame = new AfficherListeArticle();
				frame.setVisible(true);
			}
		});
		mnArticle.add(mntmAfficherLesArticles);
	}
}
