
import java.io.*; 
import java.util.*; 

public class StackQuestion {
	
	 void stackPush(Stack<Integer> stack, int a) {
		stack.push(a);
		System.out.println(stack);
	}
	
	 void stackPop(Stack<Integer> stack) {
		stack.pop();
		System.out.println(stack);
	}
	 
	 void stackArray(Stack<Integer> stack) {
		 Integer[] intArray = {12,12,13,11,2,3,4,21,33, 55};
		 for(Integer i: intArray) {
			 stack.push(i);
		 }
		 System.out.println();
		 System.out.println("Array Stack:"+stack);
	 }
	 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackQuestion s = new StackQuestion();
		Stack<Integer> stack = new Stack<Integer>();
		s.stackPush(stack,10);
		s.stackPush(stack,20);
		s.stackPush(stack,30);
		s.stackPush(stack,40);
		s.stackPush(stack,50);
		s.stackPush(stack,60);
		s.stackPush(stack,70);
		s.stackPush(stack,80);
		s.stackPush(stack,90);
		s.stackPush(stack,100);
		s.stackPush(stack,110);
		s.stackPush(stack,120);
		s.stackPop(stack);
		
		s.stackArray(stack);
	}

}
