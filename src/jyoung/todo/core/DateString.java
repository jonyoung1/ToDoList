/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyoung.todo.core;


/**
 *
 * @author joy03
 */
public class DateString {
    
    private final String dateString;
    
    public DateString(String dateString){
        this.dateString = dateString;
    }
    
    public DateString(String day, String month, String year){
        dateString = day+"\\"+month+"\\"+year;
    }
    
    public String getDateString(){
        return dateString;
    }
    
    private String[] getSplitString(){
        return dateString.split("\\\\");
    }
    
    public int getDay(){
        return Integer.parseInt(getSplitString()[0]);
    }    
    
    public int getMonth(){
        return Integer.parseInt(getSplitString()[1]);
    }
    
    public int getYear(){
        return Integer.parseInt(getSplitString()[2]);
    }
}
