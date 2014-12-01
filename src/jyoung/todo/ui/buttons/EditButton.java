/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyoung.todo.ui.buttons;

import javax.swing.JButton;
import jyoung.todo.core.ToDo;

/**
 *
 * @author joy03
 */
public class EditButton extends JButton {
 
    private ToDo toDo;
    
    public EditButton(ToDo todo){
        setText("Edit");
        this.toDo = toDo;
        setVisible(true);
    }
}

