package com.objis.cameroun.neostore.domaine;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;


/**
 * @author "Magali TIKI"
 *
 */
public class FournisseurModel extends AbstractTableModel{
	
	private String[] nomColonnes=new String[] {"Nom","Raison sociale","Adresse","Catégorie","Telephone"};
	List<String[]> tableValues=new ArrayList<String[]>(); 

	public FournisseurModel() {
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
	
	public void setData(List<Fournisseur> fournisseur) {
		tableValues=new ArrayList<>();
		for(Fournisseur f: fournisseur) {
			tableValues.add(new String[] {
			f.getNomFournisseur(),
			f.getRaisonSociale(),
			f.getAdresseFournisseur(),
			f.getCategorieArticle(),
			f.getTelephone(),
			});
		}
		fireTableChanged(null);
	}

}
