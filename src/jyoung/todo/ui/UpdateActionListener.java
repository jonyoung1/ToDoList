/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyoung.todo.ui;

import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;
import jyoung.todo.core.DateString;
import jyoung.todo.core.ToDo;
import org.jdatepicker.DateModel;
import org.jdatepicker.JDatePicker;
/**
 *
 * @author joy03
 */
public class UpdateActionListener implements ActionListener {
    
    private ToDoForm toDoForm;
    private ToDo toDo;
    private ToDoApp app;
    
    public UpdateActionListener(ToDoForm toDoForm, ToDo toDo, ToDoApp app){
        this.toDo = toDo;
        this.toDoForm = toDoForm;
        this.app = app;
    }
    
    @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(checkValidity(toDoForm)){
                    System.out.println(toDo);
                    toDo.setName(toDoForm.getNamePanel().getTextField().getText());
                    toDo.setDetails(toDoForm.getDescriptionPanel().getTextArea().getText());
                    toDo.setUrgency((String) toDoForm.getUrgencyPanel().getDropDown().getSelectedItem());
                    DateModel<?> model = toDoForm.getReminderPanel().getPicker().getModel();
                    DateString dateString = new DateString(String.valueOf(model.getDay()), 
                    String.valueOf(model.getMonth()), String.valueOf(model.getYear()));
                    String date = dateString.getDateString();
                    toDo.setReminder(date);
                    if(toDoForm.getRecurringPanel().getCheckBox().isSelected()){
                        toDo.setRecurring("true");
                        
                    }
                    else {
                        toDo.setRecurring("false");   
                            }
                    toDo.save();
                    app.initialiseValues();
                    toDoForm.dispose();
                }
                else {
                    showMessageDialog(null, "Name, Description and Urgency must all be set");
                };
                
                
            }

    private boolean checkValidity(ToDoForm toDoForm) {
        String nameField = toDoForm.getNamePanel().getTextField().getText();
        String descriptionField = toDoForm.getDescriptionPanel().getTextArea().getText();
        String urgencyField = (String) toDoForm.getUrgencyPanel().getDropDown().getSelectedItem();
        if(nameField.length() == 0 || descriptionField.length() == 0 || urgencyField.length() == 0){
            return false;
        }
        return true;
    }
    
}
