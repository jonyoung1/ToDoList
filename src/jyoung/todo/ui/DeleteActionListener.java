/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyoung.todo.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jyoung.todo.core.ToDo;

/**
 *
 * @author joy03
 */
public class DeleteActionListener implements ActionListener {
    
    private ToDo toDo;
    private ToDoApp app;
    
    public DeleteActionListener(ToDo toDo, ToDoApp app){
        this.toDo = toDo;
        this.app = app;
        System.out.println("delete action listener constructor: todo: "+toDo+" ToDoApp: "+app);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("initialising ToDoApp once more");
        toDo.delete();
        System.out.println("survived delete");
        app.initialiseValues();
        System.out.println("survived initialise dafuq?");
    }
    
}
