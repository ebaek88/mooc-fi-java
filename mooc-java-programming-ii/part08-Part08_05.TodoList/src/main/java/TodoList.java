import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> toDoList; // ArrayList for storing tasks

    // constructor
    public TodoList() {
        toDoList = new ArrayList<>();
    }

    // returns the ArrayList
    protected ArrayList<String> getList() {
        return toDoList;
    }

    // add the task passed as a parameter to the todo list
    public void add(String task) {
        toDoList.add(task);
    }

    // prints the exercises. Use the task's index
    public void print() {
        for(String elem : toDoList) {
            System.out.println((toDoList.indexOf(elem) + 1) + ": " + elem);
        }
    }

    // removes the task associated with the given number. The number
    // is the one seen associated with the task in the print.
    public void remove(int number) {
        toDoList.remove(number - 1);
    }
}
