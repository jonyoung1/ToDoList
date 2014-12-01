/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyoung.todo.core;

import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author joy03
 */
class CSVListFetch implements IListFetch {

    
    public CSVListFetch() {
    }
    
    
    public ToDoList createList(){
        ToDoList list = new ToDoList();
        try {
			CsvReader toDoList = new CsvReader("ToDoList.csv");	
			toDoList.readHeaders();
			while (toDoList.readRecord())
			{
				ToDo toDo = new ToDo();
				toDo.setID(toDoList.get("ID"));
				toDo.setDetails(toDoList.get("Details"));
				toDo.setUrgency(toDoList.get("Urgency"));
				toDo.setReminder(toDoList.get("Reminder"));
				toDo.setRecurring(toDoList.get("Recurring"));
				toDo.setName(toDoList.get("Name"));
				list.add(toDo);
			}
			toDoList.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
                }
    return list;
    }
    
}
