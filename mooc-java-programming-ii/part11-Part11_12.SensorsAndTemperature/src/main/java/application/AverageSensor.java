package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
  private List<Sensor> sensorList; // list to contain sensors
  private List<Integer> readingHistory; // list to record the history of all the executed readings of the average sensor

  // constructor
  public AverageSensor() {
    sensorList = new ArrayList<>();
    readingHistory = new ArrayList<>();
  }

  // adds a sensor to the list
  public void addSensor(Sensor toAdd) {
    sensorList.add(toAdd);
  }

  @Override
  public boolean isOn() {
    // checks if all the sensors in the list are on
    return sensorList.stream().allMatch(Sensor::isOn);
  }

  @Override
  public void setOn() {
    sensorList.stream().forEach(Sensor::setOn); // turn all the sensors on
  }

  @Override
  public void setOff() {
    sensorList.stream().forEach(Sensor::setOff); // turn all the sensors off
  }

  @Override
  public int read() {
    if (!isOn()) { // if the sensors are not on, throw an exception
      throw new IllegalStateException("All the sensors must be on to read the average temperature.");
    }

    int temperatureSum = sensorList.stream().mapToInt(sensor -> sensor.read()).sum(); // calculate the sum of all the
                                                                                      // readings of the sensors in the
                                                                                      // list
    int average = temperatureSum / sensorList.size(); // calculate the average
    readingHistory.add(average); // record the average reading in the history list
    return average;
  }

  public List<Integer> readings() { // return the history of average readings
    return readingHistory;
  }
}// class
