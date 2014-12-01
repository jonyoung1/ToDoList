/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyoung.todo.ui.fields;

import javax.swing.JComboBox;

/**
 *
 * @author joy03
 */
public class DropDown extends JComboBox<String> {
    
    private String[] urgencies = {"LOW","MEDIUM","HIGH"};
    
    public DropDown(){
        for(String urgency : urgencies){
            addItem(urgency);
        }
    }
    
}
