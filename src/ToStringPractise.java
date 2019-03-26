
public class ToStringPractise {

	String name;
	int age;
	
	
	
	

	public String toString() {
		return "ToStringPractise [name=" + name + ", age=" + age + "]";
	}




	public ToStringPractise(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ToStringPractise obj = new ToStringPractise("anu", 22);
		System.out.println(obj);
		System.out.println(obj.toString());

	}

}
