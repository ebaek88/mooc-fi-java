package application;

import java.util.List;

public class Program {

    public static void main(String[] args) {
        // you can test your classes here:
        Sensor kumpula = new TemperatureSensor();
        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read()
                + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read()
                + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read()
                + " degrees Celsius");

        System.out.println("readings: " + helsinkiRegion.readings());
    }// main

}// class
