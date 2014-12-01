/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyoung.todo.ui;

import java.awt.Dimension;
import java.awt.TextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import jyoung.todo.core.ToDo;

/**
 *
 * @author joy03
 */
public class BooleanFieldPanel extends JPanel {

    private JCheckBox checkBox;
    
    public BooleanFieldPanel(ToDo todo, String label){
        super();
        setOpaque(false);
        add(new JLabel(label));
        checkBox =  new JCheckBox();
        add(checkBox);
    }
    
    public JCheckBox getCheckBox(){
        return checkBox;
    }
    
}
