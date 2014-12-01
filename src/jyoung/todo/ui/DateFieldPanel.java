/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyoung.todo.ui;
import java.awt.Color;
import java.util.Calendar;
import java.util.Properties;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import jyoung.todo.core.DateString;
import jyoung.todo.core.MyFormatter;
import jyoung.todo.core.ToDo;
import org.jdatepicker.JDateComponentFactory;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author joy03
 */
public class DateFieldPanel extends JPanel {
    
    private JDatePicker picker;
    
    public DateFieldPanel(ToDo toDo, String label){
        super();
        setOpaque(false);
        add(new JLabel(label));
        picker = new JDateComponentFactory().createJDatePicker();
        
        picker.setTextEditable(true);
        picker.setShowYearButtons(true);
        add((JComponent) picker);
        
        if(toDo.getReminder() != null){
            DateString dateString = new DateString(toDo.getReminder());
            picker.getModel().setYear(dateString.getYear());
            picker.getModel().setMonth(dateString.getMonth());
            picker.getModel().setDay(dateString.getDay());
        }
        else{
            Calendar now = Calendar.getInstance();
            
            picker.getModel().setYear(now.get(Calendar.YEAR));
            picker.getModel().setMonth(now.get(Calendar.MONTH));
            picker.getModel().setDay(now.get(Calendar.DATE));
        }

        
        picker.getModel().setSelected(true);
        
    }
    
    public JDatePicker getPicker(){
        return picker;
    }
    
}
