
import java.util.*;  
public class QueuePractise {
		protected void finalize() {
			System.out.println(this + "saurabh");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i= 0;
			QueuePractise q=new QueuePractise();
			q=null;
			System.gc();
	}

}
