/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyoung.todo.core;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author joy03
 */
public class SortedToDoList extends ArrayList<ToDo> {
    
    IListFetch fetch;
    
    public SortedToDoList(){
        
        fetch = new CSVListFetch();
        ToDoList toDoList = fetch.createList();
        addAll(sortList(toDoList));
    }
    
    private ArrayList<ToDo> sortList(ToDoList tdl){
        Collections.sort(tdl);
        return tdl;
    }
    
}
