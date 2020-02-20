
public class BinaryTreeTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(0);
		Node son  = new Node(1);
		//System.out.println(root.getValue());
		
		BinaryTree tree = new BinaryTree(null);
		
		//System.out.println(tree.root.getValue());
		
		tree.Insert(root);
		tree.Insert(son);
		
		System.out.println(tree.root.getValue());
		System.out.println(tree.root.right.getValue());
	}

}
