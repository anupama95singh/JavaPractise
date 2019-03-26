
public class Loops {
	
	//for each loop
	
	public void forEachLoop(){
		
		int n=10;
		int array[] = new int[n];
		for(int i = 0; i<array.length; i++) {
			array[i]= i*4;
			System.out.print("array index"+i+":"+array[i] + " ");
			System.out.print("\n");
		}
		System.out.println();
		for(int arrayValue: array) {
			arrayValue+=2;
			System.out.print("array-value:"+arrayValue);
			System.out.print("\n");
		}
		
		System.out.print("The drawback of for each: "+array[1]);
		System.out.print("\n");
		
	}
	
	// 2 D array inverted-pyramid
	
	public void twoDimArray() {
		int x=5;
		int twoDimArray[][] = new int[x][];
		for(int i=0; i<x; i++) {
			twoDimArray[i] = new int[i+1];
		}
		
		for(int i = x; i>0; i--) 
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(j + " ");
				
			}
			System.out.println("\n");
		}
		
	}
		
	}



