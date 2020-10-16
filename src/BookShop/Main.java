package BookShop;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * Main Class
 * @author euggio 
 */
public class Main {

    /**
     * Main method that starts the whole project
     * @param args
     */
    public static void main(String[] args){
        
        // Creates JFrame and JTable
        JFrame frame = new JFrame();
        JTable table = new JTable(); 
        
        // Creates a table model and sets column identifiers to this model 
        Object[] columns = {"Id","First Name","Last Name","Age"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        // Sets the model to the table
        table.setModel(model);
        
        // Changes A JTable background color, font size, font color, row height
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("",1,22);
        table.setFont(font);
        table.setRowHeight(30);
        
        // Creates JTextFields
        JTextField textId = new JTextField();
        JTextField textFname = new JTextField();
        JTextField textLname = new JTextField();
        JTextField textAge = new JTextField();
        
        // Creates JButtons
        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");     
        
        textId.setBounds(20, 220, 100, 25);
        textFname.setBounds(20, 250, 100, 25);
        textLname.setBounds(20, 280, 100, 25);
        textAge.setBounds(20, 310, 100, 25);
        
        btnAdd.setBounds(150, 220, 100, 25);
        btnUpdate.setBounds(150, 265, 100, 25);
        btnDelete.setBounds(150, 310, 100, 25);
        
        // Creates JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);
        
        frame.setLayout(null);
        
        frame.add(pane);
        
        // Adds JTextFields to the jframe
        frame.add(textId);
        frame.add(textFname);
        frame.add(textLname);
        frame.add(textAge);
    
        // Adds JButtons to the Jframe
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        
        // Creates an array of objects to set the row data
        Object[] row = new Object[4];
        
        // Button Add Row
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                row[0] = textId.getText();
                row[1] = textFname.getText();
                row[2] = textLname.getText();
                row[3] = textAge.getText();
                
                // Adds row to the model
                model.addRow(row);
            }
        });
        
        // Button Remove Row
        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            
                // i = the index of the selected row
                int i = table.getSelectedRow();
                if(i >= 0){
                    // Removes a row from Jtable
                    model.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }
            }
        });
        
        // Gets selected row data from table to textfields 
        table.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
            
            // i = the index of the selected row
            int i = table.getSelectedRow();
            
            textId.setText(model.getValueAt(i, 0).toString());
            textFname.setText(model.getValueAt(i, 1).toString());
            textLname.setText(model.getValueAt(i, 2).toString());
            textAge.setText(model.getValueAt(i, 3).toString());
        }
        });
        
        // Button Update Row
        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = table.getSelectedRow();
                
                if(i >= 0) 
                {
                   model.setValueAt(textId.getText(), i, 0);
                   model.setValueAt(textFname.getText(), i, 1);
                   model.setValueAt(textLname.getText(), i, 2);
                   model.setValueAt(textAge.getText(), i, 3);
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });
        
        frame.setSize(900,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}