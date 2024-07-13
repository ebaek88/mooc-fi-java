package application;

public class StandardSensor implements Sensor {
  private final int TEMPERATURE;

  public StandardSensor(int temperature) {
    TEMPERATURE = temperature;
  }

  @Override
  public boolean isOn() {
    return true; // always return true, as per the problem specification
  }

  @Override
  public void setOn() {
    // do nothing, as setOn() has no effect according to the problem specification
  }

  @Override
  public void setOff() {
    // do nothing, as setOn() has no effect according to the problem specification
  }

  @Override
  public int read() {
    return TEMPERATURE; // read returns the number that was given to the constructor
  }
}
