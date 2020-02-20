
public class BinaryTreeTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(5);
		Node eight  = new Node(8);
		Node three = new Node(3);
		Node four = new Node(4);
		Node two = new Node(2);
		Node six = new Node(6);
		Node seven = new Node(7);
	
		//System.out.println(root.getValue());
		
		BinaryTree tree = new BinaryTree(null);
		
		//System.out.println(tree.root.getValue());
		
		tree.Insert(root);
		tree.Insert(seven);
		tree.Insert(three);
		tree.Insert(four);
		tree.Insert(two);
		tree.Insert(six);
		tree.Insert(eight);
		
		
		System.out.println(tree.root.getValue()); //Value of the root
		System.out.println(tree.root.right.right.getValue()); //Minimum value
		System.out.println(tree.root.left.left.getValue()); //Maximum value
	}

}
