package Lec29;

public class Student {
	private String name = "Kaju";
	private int age = 17;

	public Student(String name, int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}

	public void setAge(int age) {

		try {
			if (age < 0) {
				throw new Exception("bklol age -ve nhi hota hai");
			}
			this.age = age;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {
			System.out.println("I am in finaly blocks");

		}

	}

//	public void setAge(int age) throws Exception {
//		if (age < 0) {
//			throw new Exception("bklol age -ve nhi hota hai");
//		}
//		this.age = age;
//		
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

}
