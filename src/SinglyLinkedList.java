public class SinglyLinkedList {
	Node curr;
	Node prev;
	Node head;
	Node newNode;
	
	public void add(){
		
	}
	
	public boolean contains(Object item){
		boolean status=false;
		curr=head;
		prev=null;
		while(curr!=null){
			if(curr.getItem()==item){
				status=true;
				break;
			}else{
				prev=curr;
				curr=curr.getNext();
			}
		}
		return status;
	}
	
	public boolean delete(){
		return false;
	}
	
	public boolean insertBefore(Object newItem){
		if(contains(newItem)){
			
			return true;
		}else return false;
	}
	
	public boolean insertAfter(Object newItem){
		if(contains(newItem)){
			
			return true;
		}else return false;
	}
	
	public void appendToTail(Object newItem){
	}
	
}
