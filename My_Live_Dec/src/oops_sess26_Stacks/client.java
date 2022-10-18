package oops_sess26_Stacks;

public class client {

	public static void main(String[] args) {
		Stack stk = new Stack();
		
		
		stk.Add(10);
		stk.Add(20);
		stk.Add(30);
		stk.Add(40);
		stk.disp();
		System.out.println(stk.Pop());
		stk.disp();
		
		stk.Add(40);
		stk.Add(50);
		stk.Add(60);


	}
}
