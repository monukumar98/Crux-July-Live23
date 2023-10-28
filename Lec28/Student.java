package Lec28;

public class Student {

	String name;
	int age;

	public void Intro_yourSelf() {
		SayMentor_Name();

		System.out.println("My Name is " + this.name + " and age is " + this.age);

	}

	public void SayHey(String name) {

		System.out.println(this.name + " Say Hey " + name);

	}

	public static void SayMentor_Name() {

		System.out.println("Mentor Name Monu Bhaiya");

	}

	static {
		System.out.println("I am a in static blocks");
	}
}
