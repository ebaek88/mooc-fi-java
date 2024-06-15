import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        list = new ArrayList<>();
    }

    public void add(String task) {
        list.add(task);
    }

    public void remove(int number) {
        if(list.isEmpty()) {
            System.out.println("No such task!");
        }
        list.remove(number - 1);
    }

    public void print() {
        for(String element : list) {
            System.out.println((list.indexOf(element) + 1) + ": " + element);
        }
    }
}
