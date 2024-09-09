import java.util.Scanner;

public class Question5 {
    private double carRate;
    private double truckRate;
    private double motorcycleRate;
    private int numCars;
    private int numTrucks;
    private int numMotorcycles;
    private double totalRevenue;

    // Method to accept the number of vehicles of each type
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Cars: ");
        numCars = scanner.nextInt();
        System.out.print("Enter the number of Trucks: ");
        numTrucks = scanner.nextInt();
        System.out.print("Enter the number of Motorcycles: ");
        numMotorcycles = scanner.nextInt();
    }

    // Method to set toll rates for different vehicle types
    public void setTollRates() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter toll rate for Car (₹): ");
        carRate = scanner.nextDouble();
        System.out.print("Enter toll rate for Truck (₹): ");
        truckRate = scanner.nextDouble();
        System.out.print("Enter toll rate for Motorcycle (₹): ");
        motorcycleRate = scanner.nextDouble();
    }

  
