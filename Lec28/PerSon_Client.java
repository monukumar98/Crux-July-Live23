package Lec28;

public class PerSon_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Person p = new Person("Raj", 22);
//		System.out.println(p.name);
//		System.out.println(p.age);
		Person p1 = new Person("Pooja", 21);
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		// p1.age = -90;
		p1.setAge(19);
		System.out.println(p1.getAge());

	}

}
