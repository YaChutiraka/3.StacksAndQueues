public class Stack {
	Node top;
	Node newNode;
	
	public Stack(){
		
	}
	
	public Stack(Object newItem){
		newNode=new Node(newItem);
		top=newNode;
	}
	public boolean isEmpty(){
		if(top==null) return true;
		else return false;
	}
	
	public void push(Object newItem){
		newNode=new Node(newItem, top);
		top=newNode;
	}
	
	public Object pop(){
		if(!isEmpty()){
			Object temp=top.getItem();
			top=top.getNext();
			return temp;
		}else return null;
	}
	
	public void popAll(){
		top=null;
	}
	
	public Object peek(){
		if(!isEmpty()) return top.getItem();
		else return null;
	}
	
	//Uncomment this to test
	public static void main(String[] args){
		Stack s=new Stack();
		Stack st=new Stack(1);
		
		s.push(10);
		st.push(2);
		
		System.out.println(s.peek()+ " ");
		
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}
