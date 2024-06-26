

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    // Implements the compareTo method of Comparable interface
    // by adopting the compareToIgnoreCase method from String class
    @Override
    public int compareTo(Student comparedStudent) {
        return this.getName().compareToIgnoreCase(comparedStudent.getName());
    }
}
