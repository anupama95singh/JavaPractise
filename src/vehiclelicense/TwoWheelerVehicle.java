package vehiclelicense;


public class TwoWheelerVehicle extends Vehicle {

	public TwoWheelerVehicle(int accelerationControl, int brakeControl, int gearControl, int speedLimit,
			DriverInfoClass driver) {
		super(accelerationControl, brakeControl, gearControl, speedLimit, driver);
		// TODO Auto-generated constructor stub
	}
	private int accelerationControl() {
		if(accelerationControl>2) {
			return 1;
		}
		else
			return 0;
	}
	private int brakeControl() {
		if(brakeControl>2) {
			return 1;
		}
		else
			return 0;
	}
	private int gearControl() {
		if(gearControl>2) {
			return 1;
		}
		else
			return 0;
	}
	private int speedLimit() {
		if(speedLimit>2) {
			return 1;
		}
		else
			return 0;
	}
	
	void testResult() {
		int sum;
		sum = accelerationControl()+brakeControl()+gearControl()+speedLimit();
		if(sum<3) {
			System.out.println("two-wheeler license failed");
			System.out.println();
		}
		else
			System.out.println("two-wheeler license passed");
			System.out.println();
	}
}
