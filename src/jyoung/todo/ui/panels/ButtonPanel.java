/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyoung.todo.ui.panels;

import javax.swing.JPanel;
import jyoung.todo.core.ToDo;
import jyoung.todo.ui.ToDoApp;
import jyoung.todo.ui.ToDoForm;
import jyoung.todo.ui.buttons.UpdateButton;

/**
 *
 * @author joy03
 */
public class ButtonPanel extends JPanel {
    
    public ButtonPanel(ToDoForm toDoForm, ToDo toDo, ToDoApp app){
        super();
        setOpaque(false);
        add(new UpdateButton(toDoForm, toDo, app));
    }
    
}
