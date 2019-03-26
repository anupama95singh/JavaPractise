

class A extends Thread{
	public void run() {
		System.out.println("class A thread"+ getId());
	}
}

class B extends Thread{
	public void run() {
		System.out.println("class B thread");
	}
}
public class ThreadPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		A objOfClassA = new A();
		B objOfClassB = new B();

//		objOfClassA.displayMethod();
//		objOfClassB.displayMethod();
		
//		objOfClassA.start();
//		 try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  
//		objOfClassB.start();
////		 try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  
////		 objOfClassA.run();
//		System.out.println(objOfClassA.getId());
//		objOfClassA.start();
//		Thread.sleep(1000);
//		System.out.println(objOfClassA.isAlive());
//		objOfClassA = new A();
//		System.out.println(objOfClassA.getId());
//		objOfClassA.start();
		objOfClassA.run();
	}

}
