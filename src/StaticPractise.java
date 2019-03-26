
public class StaticPractise {

	
	String s1 = null;
	
	void method(){
		System.out.println("anu".equals(s1)); // false
		System.out.println(s1.equals("anu")); // Null pointer exception
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticPractise ob = new StaticPractise();
		ob.method();
	}

}


