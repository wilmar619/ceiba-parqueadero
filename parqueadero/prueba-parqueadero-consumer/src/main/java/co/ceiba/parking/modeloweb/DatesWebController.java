package co.ceiba.parking.modeloweb;


import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class DatesWebController {

    private final FormDatesWeb forms;
    private final CustmoModel modelTable = new CustmoModel();
    private final TableRowSorter<TableModel> ordenTable = new TableRowSorter<>(modelTable);
   
    
    
    public DatesWebController(FormDatesWeb form) {
        this.forms = form;
        form.table.setModel(modelTable);
        form.table.setRowSorter(ordenTable);
        form.rdbBuscarId.setSelected(true);
        form.textSelecId.setEnabled(false);



       

//        form.cmbTabla.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String toString = form.cmbTabla.getSelectedItem().toString();
//                listFieldsColumns(toString);
//            }
        }

    }  


   

    class CustmoModel extends DefaultTableModel {

        @Override
        public void setDataVector(Object[][] dataVector, Object[] columnIdentifiers) {
            super.setDataVector(dataVector, columnIdentifiers); //To change body of generated methods, choose Tools | Templates.
        }

    }

