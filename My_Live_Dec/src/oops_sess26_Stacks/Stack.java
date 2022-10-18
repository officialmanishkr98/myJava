package oops_sess26_Stacks;

public class Stack {
	private int [] arr;
	private int tos = -1;
	
	public Stack() {
		arr = new int[5];
	}
	
	public Stack(int size) {
		arr = new int [size];
	}
	
	//add
	public void Add( int ele ) {
		if(isFull()) {
			throw new RuntimeException("Stack is Full");
		}
		tos++;
		arr[tos] = ele;
	}
	
	public int peek() {
		return arr[tos];
	}
	
	public int size() {
		return tos+1;
	}
	
	public boolean isEmpty() {
		return this.size() == 0; 
	}
	
	public boolean isFull() {
		return this.size() == arr.length; 
	}
	
	//remove
	public int Pop() {
		int ans = arr[tos];
		tos--;
		return ans;
	}
	
	//Display
	public void disp() {
		int idx = tos;
		System.out.print("[ ");
		while(idx>=0) {
			System.out.print( arr[idx] + " " );
			idx--;
		}
		System.out.println("]");
	}
//	public void disp() {
//		
//		System.out.println("displayed");
//	}
	
	
	
	

}
