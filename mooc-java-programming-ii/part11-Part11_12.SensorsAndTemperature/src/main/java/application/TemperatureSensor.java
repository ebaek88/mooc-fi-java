package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
  private boolean sensorStatus; // true: on, false: off
  private int temperature; // variable for the current temperature

  // constructor
  public TemperatureSensor() {
    sensorStatus = false;
  }

  @Override
  public boolean isOn() {
    return sensorStatus;
  }

  @Override
  public void setOn() {
    sensorStatus = true;
  }

  @Override
  public void setOff() {
    sensorStatus = false;
  }

  @Override
  public int read() {
    if (!sensorStatus) {
      throw new IllegalStateException("The sensor must be turned on first to read temperature");
    }

    int randomTemperature = (new Random().nextInt(61) - 30);
    return randomTemperature;
  }
}// class
