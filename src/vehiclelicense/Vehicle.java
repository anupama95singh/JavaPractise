package vehiclelicense;

public class Vehicle {
	
	protected  int accelerationControl;
	protected  int brakeControl;
	protected  int gearControl;
	protected  int speedLimit;
	DriverInfoClass driver;
	
	public Vehicle(int accelerationControl, int brakeControl, int gearControl,int speedLimit, DriverInfoClass driver) {
		this.accelerationControl = accelerationControl;
		this.brakeControl = brakeControl;
		this.gearControl = gearControl;
		this.speedLimit = speedLimit;
		this.driver = driver;
	}
	
	void display() {
		System.out.println("Applicant Name:"+driver.name+ "\n" +"Applicant Learning license no:"+driver.learningLicenseNo+"\n"+"Vehicle Choosen:"+ driver.applieddVehicle+"\n"+"Applicant address:"+ driver.address +"\n"+"The following are the test results on the range of 1 to 10 for "+driver.name+":"+"accelerationControl:"+accelerationControl+" "+"brakeControl:"+brakeControl+" "+"gearControl:"+gearControl+" "+"speedLimit:"+speedLimit);
		System.out.println();
	}
	void testResult() {
		
	}

}
