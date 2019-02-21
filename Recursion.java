
public class Recursion {
	//concept
		int i = 0;
	void method() {
		i++;
		if(i==4) {
			System.out.println("the if loop is wrking");
			return;
		}
		
		method();
		System.out.println("this will run or not");
		return;
	}
	
	int factorial(int n) {
		int fact = 1;
		if(n == 1) {
			return 1;
		}
		fact = n*factorial(n-1);
		return fact;
	}
	int firstNo = 0;
	int secondNo = 1;
	void fibonacciSeries(int count) {
		if(count>0) {
			int nextNo = firstNo + secondNo;
			firstNo = secondNo ;
			secondNo=nextNo;
			System.out.println(secondNo);
			fibonacciSeries(count-1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Recursion().method();
			System.out.println(new Recursion().factorial(5));
			int count =10;
			System.out.println("0, 1");
			new Recursion().fibonacciSeries(count-2);
	}

}
