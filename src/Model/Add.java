/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import static java.util.Collections.list;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dilan
 */
public class  Add extends AbstractTableModel {
    //private static final String[] CoLUMN_NAMES=
private static final String[] CoLUMN_NAMES = {"description", "item_number", "client", "order_date", "job_number", "location", "qty", "deadline"};
 private static ArrayList<Orders> list;  

Add(ArrayList<Orders> Olist){

    list = Olist;

}
    @Override
    
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
