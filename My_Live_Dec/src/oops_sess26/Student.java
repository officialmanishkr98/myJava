package oops_sess26;

public class Student {
	int Age = 999;
	private String Name = "anjaan";

	public Student() {
	}

	public Student(int age, String name) {
		this.Age = age;
		this.Name = name;
	}
	

	public void Intro() {
		System.out.println(this.Age + "___" + this.Name);
	}

	public void sayHi(String Name) {
		System.out.println(this.Name + " says hii to " + Name);
	}
	
	public int getAge() {
		return this.Age;
	}
	public String getName() {
		return this.Name;
	}
	
	public void setAge(int age) throws Exception{
		if(age >= 0) {
			this.Age = age;
		} else {
			throw new Exception ("bhai kya kr rha h???\n age can't be negetive");
//			System.out.println("bhai kya kr rha h???");
		}
	}


}
