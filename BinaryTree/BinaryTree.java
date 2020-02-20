
public class BinaryTree{
	
	Node root;
	Node cur_node;
	Node variable;
	
	public BinaryTree(Node root){
		
		this.root = root;
		
	}
	
	public void Insert(Node newNode) {
		
		if( root == null) {
			
			this.root = newNode;
		}
		else {
			
			this.cur_node = root;
			this.variable = null;
			
			while(cur_node != null) {
				
				this.variable = cur_node;
				
				if (newNode.getValue() > cur_node.getValue()) {
					
					cur_node = cur_node.getRight();
						
				}
				else {
					
					cur_node = cur_node.getLeft();
					}
			}
			
			if (newNode.getValue() > variable.getValue()) {
				
				variable.setRight(newNode);
				
				} 
			else {
				
				variable.setLeft(newNode);
				}
			
			newNode.setFather(variable);
			}
		}
	}


class Node{
	
	Node right, left, father;
	int value;
	
	Node(int value){
		
		this.right = null;
		this.left  = null;
		this.father = null;
		this.value = value;
		
		}
	
	int getValue(){
		
		return value;
		
		}
	
	Node getRight() {
		
		return right;
		
		}
	
	void setRight(Node r) {
		
		this.right = r;
		
		}
	
	Node getLeft() {
		
		return left;
		
		}
	
	void setLeft(Node l) {
		
		this.left = l;
		
		}
	
	Node getFather() {
		
		return father;
		
		}
	
	void setFather(Node f) {
		
		this.father = f;
		
		}
}





