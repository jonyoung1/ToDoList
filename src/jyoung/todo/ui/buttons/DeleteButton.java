/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyoung.todo.ui.buttons;

import javax.swing.JButton;
import jyoung.todo.core.ToDo;
import jyoung.todo.ui.DeleteActionListener;
import jyoung.todo.ui.ToDoApp;

/**
 *
 * @author joy03
 */
public class DeleteButton extends JButton {
    
    public DeleteButton(ToDo toDo, ToDoApp app){
        setText("Delete");
        System.out.println("adding action listener and toDo has id of "+toDo.getID());
        addActionListener(new DeleteActionListener(toDo, app));
        setVisible(true);
        
    }
    
}
