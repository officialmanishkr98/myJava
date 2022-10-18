package oops_sess27;

import java.util.Stack;

//1. Reverse display the stack by using recursion
//2. Storing elements in revere order in another stack

public class Stack_QPS {
	public static void main(String[] args) {
		Stack<Integer> stak = new Stack<>();
		stak.add(10);
		stak.add(20);
		stak.add(30);
		stak.add(40);
		stak.add(50);
		System.out.println(stak +"<----");
		
		//1. RevStack
		System.out.print("[ ");	
		Revstak(stak);
		System.out.print("]");
		
		//2. Stack in Reverse Order
		Stack RevStak = RevOrderStack(stak);
	}
	
	public static void Revstak(Stack<Integer> stak) {
		if( stak.isEmpty()) return;

		int temp = stak.pop();
		Revstak(stak);
		System.out.print(temp +" ");
		stak.add(temp);
	}
	public static Stack<Integer> RevOrderStack(Stack<Integer> stak){
		
		
	}
	
	

}
