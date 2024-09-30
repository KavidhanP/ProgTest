/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roadaccidents;

/**
 *
 * @author kanda
 */
// Interface: IRoadAccidents
public interface IRoadAccidents {
    String getAccidentVehicleType();
    String getCity();
    int getAccidentTotal();
}

// Abstract Class: RoadAccidents
abstract class RoadAccidents implements IRoadAccidents {
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

    // Getter method for city
    public String getCity() {
        return city;
    }

    // Getter method for accident total
    public int getAccidentTotal() {
        return accidentTotal;
    }
}

// Subclass: RoadAccidentReport extends RoadAccidents
class RoadAccidentReport extends RoadAccidents {
    
    // Constructor for the subclass
    public RoadAccidentReport(String vehicleType, String city, int accidentTotal) {
        super(vehicleType, city, accidentTotal);
    }

    // Method to print the accident report
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

// Main Class: RunApplication
public class RoadAccidents {
    public static void main(String[] args) {
        // Use a scanner to gather input from the user
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Get input for vehicle type
        System.out.print("Enter the accident vehicle type: ");
        String vehicleType = scanner.nextLine();

        // Get input for the city
        System.out.print("Enter the city for the vehicle accidents: ");
        String city = scanner.nextLine();

        // Get input for the total number of accidents
        System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
        int accidentTotal = scanner.nextInt();

        // Create an instance of RoadAccidentReport
        RoadAccidentReport report = new RoadAccidentReport(vehicleType, city, accidentTotal);

        // Print the report
        report.printAccidentReport();
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
