
public class CallByValueAndReference {

	int d = 20;
	int da = 30;
	void callByValue(int da) {
		da= da+2;
		System.out.println("value: "+da);
	}
	void callByReference(CallByValueAndReference c) {
		d = d+100;
		System.out.println("reference: "+d );
		System.out.println("reference: "+(d+40) );
		
		System.out.println("reference: "+c.d );
		System.out.println("reference: "+ (c.d = c.d +80) );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallByValueAndReference o = new CallByValueAndReference();
		o.callByReference(o);
		System.out.println("ref main: "+o.d );
		o.callByValue(800);
		System.out.println("value main: "+ o.da );
		}

}
