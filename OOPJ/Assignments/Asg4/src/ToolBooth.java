import java.util.Scanner;

public class ToolBooth {
    private double carRate;
    private double truckRate;
    private double motorcycleRate;
    private int numCars;
    private int numTrucks;
    private int numMotorcycles;
    private double totalRevenue;

    // Method to accept the number of vehicles of each type
    public void acceptRecord() {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number of Cars: ");
			numCars = sc.nextInt();
			System.out.print("Enter the number of Trucks: ");
			numTrucks = sc.nextInt();
			System.out.print("Enter the number of Motorcycles: ");
			numMotorcycles = sc.nextInt();
		}
    }

    public void setTollRates() {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter toll rate for Car (₹): ");
			carRate = sc.nextDouble();
			System.out.print("Enter toll rate for Truck (₹): ");
			truckRate = sc.nextDouble();
			System.out.print("Enter toll rate for Motorcycle (₹): ");
			motorcycleRate = sc.nextDouble();
		}
 }

	public double getCarRate() {
		return carRate;
	}

	public void setCarRate(double carRate) {
		this.carRate = carRate;
	}

	public double getTruckRate() {
		return truckRate;
	}

	public void setTruckRate(double truckRate) {
		this.truckRate = truckRate;
	}

	public double getMotorcycleRate() {
		return motorcycleRate;
	}

	public void setMotorcycleRate(double motorcycleRate) {
		this.motorcycleRate = motorcycleRate;
	}

	public int getNumCars() {
		return numCars;
	}

	public void setNumCars(int numCars) {
		this.numCars = numCars;
	}

	public int getNumTrucks() {
		return numTrucks;
	}

	public void setNumTrucks(int numTrucks) {
		this.numTrucks = numTrucks;
	}

	public int getNumMotorcycles() {
		return numMotorcycles;
	}

	public void setNumMotorcycles(int numMotorcycles) {
		this.numMotorcycles = numMotorcycles;
	}

	public double getTotalRevenue() {
		return totalRevenue;
	}

	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue = totalRevenue;
	}
}