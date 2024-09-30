/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;

/**
 *
 * @author kanda
 */



// Abstract Class: RoadAccidents
abstract class RoadAccidents {
    private String vehicleType;
    private String city;
    private int accidentTotal;

    // Constructor to initialize vehicle type, city, and accident total
    public RoadAccidents(String vehicleType, String city, int accidentTotal) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.accidentTotal = accidentTotal;
    }

    // Getter method for vehicle type
    public String getAccidentVehicleType() {
        return vehicleType;
    }

    public String getCity() {
        return city;
    }

    public int getAccidentTotal() {
        return accidentTotal;
    }
}

class RoadAccidentReport extends RoadAccidents {
    
      public RoadAccidentReport(String vehicleType, String city, int accidentTotal) {
        super(vehicleType, city, accidentTotal);
    }
 

    public void printAccidentReport() {
        System.out.println("**************************");
        System.out.println("VEHICLE ACCIDENT REPORT");
        System.out.println("**************************");
        System.out.println("VEHICLE TYPE: " + getAccidentVehicleType());
        System.out.println("CITY: " + getCity());
        System.out.println("ACCIDENT TOTAL: " + getAccidentTotal());
        System.out.println("**************************");
    }
}


public class JavaApplication21 {
    public static void main(String[] args) {
       
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Get input for vehicle type
        System.out.print("Enter the accident vehicle type: ");
        String vehicleType = scanner.nextLine();

        System.out.print("Enter the city of the vehicle accidents: ");
        String city = scanner.nextLine();

     
        System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
        int accidentTotal = scanner.nextInt();

        
        RoadAccidentReport report = new RoadAccidentReport(vehicleType, city, accidentTotal);

        // Print the report
        report.printAccidentReport();
        
     
    }
}
