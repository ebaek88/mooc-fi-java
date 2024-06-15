public class Timer {
    private ClockHand seconds; // hand for seconds
    private ClockHand hundredths; // hand for hundredths of seconds

    // constructor
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredths = new ClockHand(100);
    }

    // advances hundredths first
    public void advance() {
        // by this, the hundredths has to be 1
        this.hundredths.advance();

        // when hundredths reaches 0, it means that it already reaches 100 hundredths = 1 second
        if(this.hundredths.value() == 0) {
            this.seconds.advance();
        }
    }

    // String representation
    public String toString() {
        // if object variables are connected with other strings,
        // they are automatically converted to strings
        // by their own toString methods
        return this.seconds + ":" + this.hundredths;
    }


}
