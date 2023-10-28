package Lec28;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.name = "Kaju";
		s.age = 18;
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "Kamlesh";
		s1.age = 17;
		s1.Intro_yourSelf();
		s1.SayHey("Ramesh");
		Student.SayMentor_Name();

	}
	static {
		System.out.println("I am a in static blocks in Main");
	}

}
