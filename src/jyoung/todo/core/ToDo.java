package jyoung.todo.core;

import java.io.FileNotFoundException;
import java.io.IOException;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Collections;
import java.util.LinkedList;

public class ToDo implements Comparable {
	
	private String ID;
	private String details;
	private String urgency;
	private String reminder;
	private String recurring;
	private String name;
	
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getUrgency() {
		return urgency;
	}
	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}
	public String getReminder() {
		return reminder;
	}
	public void setReminder(String reminder) {
		this.reminder = reminder;
	}
	public String getRecurring() {
		return recurring;
	}
	public void setRecurring(String recurring) {
		this.recurring = recurring;
	}
	
	
	public void initialiseToDoRow(String id) {
			try {
			CsvReader toDoList = new CsvReader("ToDoList.csv");	
			toDoList.readHeaders();
			while (toDoList.readRecord())
			{
				ID = toDoList.get("ID");
				if(ID.equals(id)){
					details = toDoList.get("Details");;
                                        urgency = toDoList.get("Urgency");;
					reminder = toDoList.get("Reminder");;
					recurring = toDoList.get("Recurring");;
					name = toDoList.get("Name");;
				}
			}
			toDoList.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
        
        @Override
    public int compareTo(Object left) {
        ToDo leftToDo = (ToDo) left;
        return compare(leftToDo);       
    }
    
    private int compare(ToDo left){
        String leftUrgency = left.getUrgency();
        String rightUrgency = getUrgency();  
        if(leftUrgency.equals("HIGH") &&
                (rightUrgency.equals("MEDIUM") || rightUrgency.equals("LOW"))){
            return 1;
        }
        if(leftUrgency.equals("MEDIUM") && rightUrgency.equals("LOW")){
            return 1;
        }
        if(leftUrgency.equals(rightUrgency)){
            System.out.println("both urgencies are "+leftUrgency);
            if(left.getName().compareTo(getName()) == -1){
                System.out.println("comparison");
                return 1;
            }
        }
        return -1;
    }

    public void save() {
        String outputFile = "ToDoList.csv";
			
		try {
			
                    SortedToDoList std = new SortedToDoList();
                    File file = new File("ToDoList.csv");
                    file.delete();
                    boolean newEntry = true;
                    CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');

                    csvOutput.write("ID");
                    csvOutput.write("Name");
                    csvOutput.write("Details");
                    csvOutput.write("Urgency");
                    csvOutput.write("Reminder");
                    csvOutput.write("Recurring");
                    csvOutput.endRecord();
                    for(ToDo td : std){
                        if(td.getID().equals(ID)){
                            newEntry = false;
                            td = this;  
                        }
                        csvOutput.write(td.getID());
                        csvOutput.write(td.getName());
                        csvOutput.write(td.getDetails());
                        csvOutput.write(td.getUrgency());
                        csvOutput.write(td.getReminder());
                        csvOutput.write(td.getRecurring());
                        csvOutput.endRecord();
                    }
                    if(newEntry == true){
                        csvOutput.write(this.getNewID(std));
                        csvOutput.write(this.getName());
                        csvOutput.write(this.getDetails());
                        csvOutput.write(this.getUrgency());
                        csvOutput.write(this.getReminder());
                        csvOutput.write(this.getRecurring());
                        csvOutput.endRecord();
                    }
                    csvOutput.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
    }

    private String getNewID(SortedToDoList std) {
        LinkedList<Integer> list = new LinkedList<>();
        for(ToDo td : std){
            list.add(Integer.parseInt(td.getID()));
        }
        Collections.sort(list);
        Integer newID = 1;
        System.out.println("ids are "+list);
        if(!list.isEmpty()){
            System.out.println(" first element is "+list.get(0));
            newID = list.getLast() + 1;
        }
        return newID.toString();
    }

    public void delete() {
        String outputFile = "ToDoList.csv";
        try {
            SortedToDoList std = new SortedToDoList();
            File file = new File("ToDoList.csv");
            file.delete();
            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');

            csvOutput.write("ID");
            csvOutput.write("Name");
            csvOutput.write("Details");
            csvOutput.write("Urgency");
            csvOutput.write("Reminder");
            csvOutput.write("Recurring");
            csvOutput.endRecord();
            for(ToDo td : std){
                System.out.println("re-adding "+td.getID());
                if(td.getID().equals(ID)){
                    System.out.println("not re-adding "+td.getID());
                    continue;
                }
                csvOutput.write(td.getID());
                csvOutput.write(td.getName());
                csvOutput.write(td.getDetails());
                csvOutput.write(td.getUrgency());
                csvOutput.write(td.getReminder());
                csvOutput.write(td.getRecurring());
                csvOutput.endRecord();
            }
            csvOutput.close();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
	
}
