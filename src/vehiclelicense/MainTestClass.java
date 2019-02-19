package vehiclelicense;

public class MainTestClass {

	public static void main(String[] anupama) {
		// TODO Auto-generated method stub
	DriverInfoClass driver1 = new DriverInfoClass("anupama singh","two-wheeler",100575875,"banglore");
	Vehicle vehicle_driver1 = new Vehicle(5, 6, 6,8, driver1);
	vehicle_driver1.display();
	vehicle_driver1 = new TwoWheelerVehicle(5, 6, 6,8, driver1);
	vehicle_driver1.testResult();
	
	DriverInfoClass driver2 = new DriverInfoClass("Mihir Shah","four-wheeler",1209878978,"dubai");
	Vehicle vehicle_driver2 = new Vehicle(3,2,2,1,driver2);
	vehicle_driver2.display();
	vehicle_driver2 = new FourWheelerVehicle(3,2,2,1,driver2);
	vehicle_driver2.testResult();
	
		}

}
