import java.util.ArrayList;

public class Room {
    private ArrayList<Person> memberList;

    // constructor
    public Room() {
        this.memberList = new ArrayList<>();
    }

    public void add(Person person) {
        this.memberList.add(person);
    }

    public boolean isEmpty() {
        return this.memberList.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return memberList;
    }

    // returns the shortest person added to the room
    public Person shortest() {
        // if the room is empty, return null
        if(this.getPersons().isEmpty()) {
            return null;
        }

        // initially assume that the first person added is the shortest
        Person shortest = this.getPersons().get(0);

        // same as for(int i = 1; i < this.getPersons().size() ; i++)
        for(Person element: this.getPersons()) {
            if(shortest.getHeight() > element.getHeight()) {
                shortest = element;
            }
        }

        return shortest;
    }

    public Person take() {
        // if the room is empty, return null;
        if(this.getPersons().isEmpty()) {
            return null;
        }

        Person shortest = this.shortest();
        this.getPersons().remove(shortest);
        return shortest;
    }
}
