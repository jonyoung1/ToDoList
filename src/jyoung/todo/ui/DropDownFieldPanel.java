/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyoung.todo.ui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import jyoung.todo.core.ToDo;
import jyoung.todo.ui.fields.DropDown;

/**
 *
 * @author joy03
 */
public class DropDownFieldPanel extends JPanel {

    private DropDown dropDown;
    
    public DropDownFieldPanel(ToDo todo, String label){
        super();
        setOpaque(false);
        add(new JLabel(label));
        dropDown =  new DropDown();
        if(todo.getUrgency() != null){
            dropDown.setSelectedItem(todo.getUrgency());
        }
        add(dropDown);
    }
    
    public DropDown getDropDown(){
        return dropDown;
    }
    
}
