/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyoung.todo.ui;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;
import jyoung.todo.core.ToDo;
import jyoung.todo.ui.buttons.UpdateButton;
import jyoung.todo.ui.panels.ButtonPanel;

/**
 *
 * @author joy03
 */
public class ToDoForm extends JDialog {
    
    private FieldPanel namePanel;
    private FieldPanel descriptionPanel;
    private DropDownFieldPanel urgencyPanel;
    private DateFieldPanel reminderPanel;
    private BooleanFieldPanel recurringPanel;
    
    
    public ToDoForm(ToDo toDo, ToDoApp app){
        super();
        setModal(true);
        setSize(600, 400);
        getContentPane().setBackground(new java.awt.Color(0, 255, 255));
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3,2));
        initialisePanels(toDo);
        
        add(namePanel);
        add(descriptionPanel);
        add(urgencyPanel);
        add(reminderPanel);
        add(recurringPanel);
        add(new ButtonPanel(this, toDo, app));
        
        
        setVisible(true);
    }
    
    public FieldPanel getNamePanel(){
        return namePanel;
    }
    
    public FieldPanel getDescriptionPanel(){
        return descriptionPanel;
    }
    
    public DropDownFieldPanel getUrgencyPanel(){
        return urgencyPanel;
    }
    
    public DateFieldPanel getReminderPanel(){
        return reminderPanel;
    }
    
    public BooleanFieldPanel getRecurringPanel(){
        return recurringPanel;
    }

    private void initialisePanels(ToDo toDo) {
        namePanel = new FieldPanel(toDo, "Name");
        descriptionPanel = new FieldPanel(toDo, "Description");
        urgencyPanel = new DropDownFieldPanel(toDo, "Urgency");
        reminderPanel = new DateFieldPanel(toDo, "Reminder Date");
        recurringPanel = new BooleanFieldPanel(toDo, "Recurring Reminder?");
    }
}
