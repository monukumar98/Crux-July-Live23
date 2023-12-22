package Lec45;

public class HashMap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Raj", 89);
		map.put("Ankit", 79);
		map.put("Kaju", 99);
		map.put("Ankita", 59);
		map.put("Vishal", 77);
		map.put("Pooja", 88);
		map.put("Anku", 88);
		map.put("Puneet", 73);
		map.put("Ankita", 38);
		System.out.println(map.get("Ankita"));
		System.out.println(map.get("Ankit"));
		System.out.println(map);

	}

}
