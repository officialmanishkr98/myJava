package oops_sess25;

public class client {
	public static void main(String[] args) {
		student s =  new student();
		
//		System.out.println(s);
//		System.out.println(s.Age);
//		System.out.println(s.Name);
		s.Name = "Manish";
		s.Age = 23;
		s.Intro();
		
		//object name says hii
		s.sayHi();
		
		//object name says hi to someone(passing string name
		s.sayHi("Rahul");
		
		
		//passing student class in function
		student s2 = new student();
		s2.Age = 20;
		s2.Name = "Rahul";
		
		s.party(s2);
//		System.out.println(s.Name);
//		System.out.println(s2.Name);
		
		student s3 = new student( 25 , "Manav");
		System.out.println(s3.Name);
		
		student s4 = new student();
		System.out.println(s4.Name);
	}
}
