/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyoung.todo.core;

import java.text.ParseException;
import javax.swing.JFormattedTextField.AbstractFormatter;

/**
 *
 * @author joy03
 */
public class MyFormatter extends AbstractFormatter {
     
    @Override
    public Object stringToValue(String string) throws ParseException {
        return string;
    }

    @Override
    public String valueToString(Object o) throws ParseException {
        return o.toString();
    }
    
}
