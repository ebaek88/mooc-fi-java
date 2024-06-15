public class Cube {
    private int edgeLength; // length for each side

    // constructor
    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    // calculating the volume of a cube
    public int volume() {
        return edgeLength * edgeLength * edgeLength;
    }

    // String representation
    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume();
    }
}
