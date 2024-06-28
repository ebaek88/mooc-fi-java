import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
  private List<Person> employeeList;

  // constructor
  public Employees() {
    employeeList = new ArrayList<>();
  }

  // adds the given person to the employees list
  public void add(Person personToAdd) {
    employeeList.add(personToAdd);
  }
  // adds the given list of people to the employees list
  public void add(List<Person> peopleToAdd) {
    Iterator<Person> iterator = peopleToAdd.iterator();
    while(iterator.hasNext()) {
      employeeList.add(iterator.next());
    }
  }

  // prints all employees
  public void print() {
    Iterator<Person> iterator = employeeList.iterator();
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

  // prints the employees whose education matches the education given as a parameter
  public void print(Education education) {
    Iterator<Person> iterator = employeeList.iterator();
    while(iterator.hasNext()) {
      Person temp = iterator.next();
      if(temp.getEducation() == education) {
        System.out.println(temp);
      }
    }
  }

  // removes all employees whose education matches the education given as parameter from the employees list
  public void fire(Education education) {
    Iterator<Person> iterator = employeeList.iterator();
    while(iterator.hasNext()) {
      Person temp = iterator.next();
      if(temp.getEducation() == education) {
        iterator.remove();
      }
    }
  }
}//class