
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    @Override
    public boolean equals(Object object) {
        //if both variables refer to the same instance, return true
        if(this == object) {
            return true;
        }

        //return false if the object is null or if they are of different classes
        if(object == null || this.getClass() != object.getClass()) {
            return false;
        }

        //convert the object to a SimpleDate instance
        SimpleDate compared = (SimpleDate)object;

        //if the contents are the same, return true
        if(this.year == compared.year &&
            this.month == compared.month &&
            this.day == compared.day) {
            return true;
        }

        //otherwise, return false
        return false;
    }

}
