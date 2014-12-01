/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyoung.todo.ui;

import java.awt.Dimension;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import jyoung.todo.core.ToDo;

/**
 *
 * @author joy03
 */
public class FieldPanel extends JPanel {
    
    private TextField tf;
    private JTextArea ta;
    
    public FieldPanel(ToDo todo, String label){
        super();
        System.out.println("label is "+label);
        setOpaque(false);
        add(new JLabel(label));
        tf = new TextField();
        ta = new JTextArea();
            if(label.equals("Name")){
                System.out.println("Got1");
                if(todo.getName() != null){
                tf.setText(todo.getName());
                }
                tf.setPreferredSize(new Dimension(100, 20));
                add(tf);
            }
            else if(label.equals("Description")){
                System.out.println("Got2");
                ta.setPreferredSize(new Dimension(150, 80));
                if(todo.getDetails() != null){
                    ta.setText(todo.getDetails());
                }
                
                
                add(ta);
            }
        
        
    }
    
    public TextField getTextField(){
        return tf;
    }
    
    public JTextArea getTextArea(){
        return ta;
    }
    
}
