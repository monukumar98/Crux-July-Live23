package Lec41;

public class Abstract_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Abstract_Demo ab = new Abstract_Demo();
//		Payment_Menthod ab = new Payment_Menthod();
//		ab.Payment();
		Abstract_Demo ab = new Abstract_Demo() {

			@Override
			public void Payment() {
				// TODO Auto-generated method stub

			}

			@Override
			public int No_of_item() {
				// TODO Auto-generated method stub
				return 0;
			}

		};
//		Abstract_Demo ab1 = new Abstract_Demo() {
//			
//		};
	}

}
