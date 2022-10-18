package oops_sess25;

public class student {
	int Age = 999;
	String Name = "anjaan";
	public student () {};
	public student(int age , String name) {
		this.Age = age;
		this.Name = name;
	}
	public void Intro() {
//		System.out.println("My name is "+ Name + " and i am " + Age + " yrs old" );
		System.out.println(this);
//		System.out.println(Age + "___" + Name);
		System.out.println(this.Age + "___" + this.Name);
	}
	public void sayHi() {
		System.out.println(Name + " says hii");
	}
	public void sayHi(String Name) {
		System.out.println(this.Name + " says hii to " + Name );
	}
	
	public void party(student c) {
		System.out.println(this.Name + " says hii to " + c.Name );
	}
}
