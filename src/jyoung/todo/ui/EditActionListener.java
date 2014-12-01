/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyoung.todo.ui;

import java.awt.event.ActionListener;
import jyoung.todo.core.ToDo;

/**
 *
 * @author joy03
 */
public class EditActionListener implements ActionListener {
    
    private ToDo toDo;
    private ToDoApp app;
    
    public EditActionListener(ToDo toDo, ToDoApp app){
        this.toDo = toDo;
        this.app = app;
    }
    
    @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("event is "+evt.getActionCommand());
                
                System.out.println("creating todo form here and todo had id of "+toDo.getID());
                ToDoForm form = new ToDoForm(toDo, app);
                
            }
            
    
}
