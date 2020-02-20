
public class LinkedList {
	
	NodeList first;
	NodeList last;
	NodeList cur_node;
	NodeList variable;
	int index = 0;
	
	
	public LinkedList(NodeList first, NodeList last){
		
		this.first = first;
		this.last = last;
	}
	
	
	public void Insert(NodeList newNode) {
		
		if (first == null) {
			
			this.first = newNode;
			this.first = newNode;
		}
		else {
			
			this.cur_node = first;
			
			while(cur_node != null) {
				
				this.variable = cur_node;
				cur_node = cur_node.getNext();
			
				
			}
			
			variable.setNext(newNode);
			newNode.setBefore(variable);
			this.last = newNode;
			
			
			
		}
		
	}
	
	public void Delete(NodeList trashNode) {
		
		if (trashNode.getValue() == first.getValue()) {
			
			this.cur_node = first;
			first = cur_node.getNext();
			first.setBefore(null);
			
		}else if(trashNode.getValue() == last.getValue()){
			
			this.cur_node = last;
			last = cur_node.getBefore();
			last.setNext(null);
		}
		else {

			this.cur_node = first.getNext();
			
			while(cur_node.getValue() != trashNode.getValue()) {
				
				cur_node = cur_node.getNext();
				
			}
			
			cur_node.getBefore().setNext(cur_node.getNext());
			cur_node.getNext().setBefore(cur_node.getBefore());
		}
		
	}

	public int Search(NodeList findNode) {
		
		this.cur_node = first;
		
		while(cur_node.getValue() != findNode.getValue()) {
		
			cur_node = cur_node.getNext();
			index++;
		}
		
		return index;
	}

}


class NodeList{
	
	NodeList next;
	NodeList before;
	int value;
	
	public NodeList(int value){
		
		this.value = value;
		
	}
	
	NodeList getNext(){
		
		return next;
	}
	
	void setNext(NodeList next) {
		
		this.next = next;
	}
	
	NodeList getBefore() {
		
		return before;
	}
	
	void setBefore(NodeList before) {
		
		this.before = before;
	}
	
	int getValue() {
		
		return value;
	}
}
