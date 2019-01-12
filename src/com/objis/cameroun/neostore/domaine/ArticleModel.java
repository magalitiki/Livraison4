package com.objis.cameroun.neostore.domaine;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;


/**
 * @author "Magali TIKI"
 *
 */
public class ArticleModel extends AbstractTableModel{
	
	private String[] nomColonnes=new String[] {"Reference","Nom","Fournisseur","Marque","Quantité","Prix d'achat", "Prix de vente"};
	List<String[]> tableValues=new ArrayList<String[]>(); 

	public ArticleModel() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return tableValues.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return nomColonnes.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return tableValues.get(rowIndex)[columnIndex];
	}
	@Override
	public String getColumnName(int column) {
		
		return nomColonnes[column];
	}
	
	public void setData(List<Articles> article) {
		tableValues=new ArrayList<>();
		for(Articles a: article) {
			tableValues.add(new String[] {
			a.getReference(),
			a.getNom(),
			a.getFournisseur(),
			a.getMarque(),
			""+a.getQuantite(),
			String.valueOf(a.getPrixachat()),
			String.valueOf(a.getPrixdevente()),
			});
		}
		fireTableChanged(null);
	}

}
