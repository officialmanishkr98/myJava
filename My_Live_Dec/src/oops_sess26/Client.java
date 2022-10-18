package oops_sess26;

public class Client {
	public static void main(String[] args) throws Exception {
		Student s =  new Student(23 , "Manish");

		s.Intro();
		

		System.out.println(s.getName());
		
		
		// 2 ways of handling exception
		//1st way is to add "throws Exception" in the receiving end
		s.setAge(-50);
		
		//2nd way is to try/catch the exception;
		
	
		
		
		
	}

}
