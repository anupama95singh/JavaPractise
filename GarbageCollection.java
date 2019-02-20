
public class GarbageCollection {
	
       String some_object;
       
       public GarbageCollection( String some_object) {
    	   this.some_object = some_object;
       }
       static void method1() {
    	   GarbageCollection o1 = new GarbageCollection("anupama");
    	   System.out.println("in method 1");
    	   method2();
    	  
       }
       static void method2() {
    	   GarbageCollection o1 = new GarbageCollection("anupama singh");
    	   System.out.println("in method 2");
       }
       
       
       
       
       public static void main(String[] args) {
    	   method1();
    	  System.gc();
       }
       
       protected void finalize() {
    	   System.out.println(this.some_object);
       }
}
