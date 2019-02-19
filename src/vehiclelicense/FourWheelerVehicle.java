package vehiclelicense;

public class FourWheelerVehicle extends Vehicle {
	
	public FourWheelerVehicle(int accelerationControl, int brakeControl, int gearControl, int speedLimit,
			DriverInfoClass driver) {
		super(accelerationControl, brakeControl, gearControl, speedLimit, driver);
		// TODO Auto-generated constructor stub
	}
	private int accelerationControl() {
		if(accelerationControl>4) {
			return 1;
		}
		else
			return 0;
	}
	private int brakeControl() {
		if(brakeControl>4) {
			return 1;
		}
		else
			return 0;
	}
	private int gearControl() {
		if(gearControl>4) {
			return 1;
		}
		else
			return 0;
	}
	private int speedLimit() {
		if(speedLimit>4) {
			return 1;
		}
		else
			return 0;
	}
	void testResult() {
		int sum;
		sum = accelerationControl()+brakeControl()+gearControl()+speedLimit();
		if(sum<3) {
			System.out.println("four-wheeler license failed");
			System.out.println();
		}
		else
			System.out.println("four-wheeler license passed");
		    System.out.println();
	}
}
