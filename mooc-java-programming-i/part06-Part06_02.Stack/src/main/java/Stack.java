import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;
    // private int top;

    public Stack() {
        stack = new ArrayList<>();
        // top = -1;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void add(String value) {
        stack.add(value);
        // stack.add(++top);
    }

    // lists the values wrapped in brackets
    // you simply return the ArrayList object. then, it will list elements wrapped in brackets
    public ArrayList<String> values() {
        return stack;
    }

    public String take() {
        return stack.remove(stack.size()-1);
        // return stack.remove(top--);
    }
}
