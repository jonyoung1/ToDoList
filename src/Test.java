import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import jyoung.todo.core.ToDo;
import jyoung.todo.core.SortedToDoList;
import jyoung.todo.ui.MainWindow;

public class Test {

		public static void main(String[] args) {
			System.out.println("running");
			SortedToDoList list = new SortedToDoList();
			for(ToDo tod : list){
				System.out.println("todo urgency is "+tod.getUrgency());
			}
			
			
			/*ToDo toDo = new ToDo();
			toDo.initialiseToDoRow("3");
			System.out.println("got value of "+toDo.getID());
			System.out.println("got value of "+toDo.getName());
			System.out.println("got value of "+toDo.getDetails());
			System.out.println("got value of "+toDo.getUrgency());
			System.out.println("got value of "+toDo.getReminder());
			System.out.println("got value of "+toDo.getRecurring());
			*/
			MainWindow mv = new MainWindow();
			mv.run();

			
		}
	
}
