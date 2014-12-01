package jyoung.todo.ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import jyoung.todo.core.ToDo;
import jyoung.todo.core.ToDoList;

public class MainWindow {
	
	
	public void run(){
		
		//Create and set up the window.
        JFrame frame = new JFrame("To Do List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("jkj");
        frame.getContentPane().add(label);
        
        MainDisplay md = new MainDisplay();
        md.setMainDisplay();
        frame.add(md);
        ToDoList todolist = new ToDoList();
        for (ToDo toDo : todolist){
        	JButton but = new JButton();
        	but.setLabel("Button");
        	frame.add(but);
        }
        
        
        //Display the window.
        frame.pack();
        frame.setSize(400, 500);
        frame.setVisible(true);
		
	}
	
	
}
