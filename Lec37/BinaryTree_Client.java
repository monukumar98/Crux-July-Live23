package Lec37;

public class BinaryTree_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false	
		BinaryTree bt = new BinaryTree();
		bt.Display();
		System.out.println(bt.max());
		System.out.println(bt.find(60));
		System.out.println(bt.ht());
		bt.PreOrder();
		bt.INOrder();
		bt.POStOrder();
		bt.levelOrder();
	}

}
