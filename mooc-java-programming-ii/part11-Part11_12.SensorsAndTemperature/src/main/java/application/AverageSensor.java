package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
  private List<Sensor> sensorList; // list to contain sensors
  private boolean averageSensorStatus; // true: all sensors are on, false: at least one sensor is off

  // constructor
  public AverageSensor() {
    sensorList = new ArrayList<>();
    averageSensorStatus = false;
  }

  // adds a sensor to the list
  public void addSensor(Sensor toAdd) {
    sensorList.add(toAdd);
  }

  @Override
  public boolean isOn() {
    return averageSensorStatus;
  }

  @Override
  public void setOn() {
    for (Sensor element : sensorList) {
      element.setOn(); // turn all the sensors on
    }

    averageSensorStatus = true;
  }

  @Override
  public void setOff() {
    sensorList.stream().forEach(Sensor::setOff); // turn all the sensors off
  }

}// class
