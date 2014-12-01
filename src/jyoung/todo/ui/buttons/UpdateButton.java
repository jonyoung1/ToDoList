/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyoung.todo.ui.buttons;

import javax.swing.JButton;
import jyoung.todo.core.ToDo;
import jyoung.todo.ui.ToDoApp;
import jyoung.todo.ui.ToDoForm;
import jyoung.todo.ui.UpdateActionListener;



/**
 *
 * @author joy03
 */
public class UpdateButton extends JButton {
    private final ToDoForm toDoForm;
    private final ToDo toDo;
    private final ToDoApp app;
    
    public UpdateButton(ToDoForm toDoForm, ToDo toDo, ToDoApp app){
        super("Save");
        this.toDoForm = toDoForm;
        this.toDo = toDo;
        this.app = app;
        addActionListener(new UpdateActionListener(toDoForm, toDo, app));
    }
    
    
    
    
}
