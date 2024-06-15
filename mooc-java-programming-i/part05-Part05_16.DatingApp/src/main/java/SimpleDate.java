
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

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    // moves the date by one day
    // assume that each month has 30 days
    public void advance() {
        this.day++;
        // changes the month if the day is already the 30th
        if(this.day >= 31) {
            this.day = 1;
            this.month++;
            // changes the year if the month is already December
            if(this.month >= 13) {
                this.month = 1;
                this.year++;
            }
        }
    }

    // moves the date by the specific number of days
    public void advance(int howManyDays) {
       // advancing by the parameter at once might be more complex
       // because you need to calculate how many extra days should go into months etc.
       // therefore, it is better to advance days one by one
       // using the advance() method
       for(int i = 0; i < howManyDays; i++) {
            this.advance();
       }
    }

    // advances time by the specified number of days and return a SimpleDate object
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);

        newDate.advance(days);

        return newDate;
    }


}
