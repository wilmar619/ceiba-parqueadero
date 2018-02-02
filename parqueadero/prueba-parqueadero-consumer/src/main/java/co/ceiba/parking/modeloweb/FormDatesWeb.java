package co.ceiba.parking.modeloweb;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FormDatesWeb extends JFrame{

    public JPanel panel;
    public JTable table;
    public JButton botonListar;
    public JPanel panelHead;
    public JTextField textFiltrar;
    public JLabel labelFiltrar;
    public ButtonGroup butGroGrupo;
    public JRadioButton rdbBuscarId;
    public JRadioButton rdbBuscarTodo;
    public JTextField textSelecId;


    public FormDatesWeb() {

        labelFiltrar = new JLabel("INGRESAR VEHICULO");
        textFiltrar = new JTextField(4);
        panelHead = new JPanel(new FlowLayout());
        panelHead.setPreferredSize(new Dimension(0, 100));
        botonListar = new JButton("Listar-Tabla");
        panel = new JPanel(new BorderLayout());
        table = new JTable();
          
        rdbBuscarId = new JRadioButton("Opción por id");
        rdbBuscarTodo = new JRadioButton("Opción todo");    
        
        butGroGrupo = new ButtonGroup();
        butGroGrupo.add(rdbBuscarId);
        butGroGrupo.add(rdbBuscarTodo);
        
        textSelecId = new JTextField(4);

       
        panelHead.add(labelFiltrar);
        panelHead.add(textFiltrar);
        panelHead.add(botonListar);
        panelHead.add(rdbBuscarId);
        panelHead.add(rdbBuscarTodo);
        panel.add(panelHead, BorderLayout.NORTH);
        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        this.initComponents();
    }

    private void initComponents() {

        this.add(panel);
        this.setSize(700, 400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

}
