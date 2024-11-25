package Java_Questions;

public class LinkedList_Code_Question {

	public static void main(String[] args) {
		int[] a=new int[]{3,4,5,4,2,5,5,9,9,9};
		Node node = new Node();
		for(int i=0;i<a.length;i++) {
			node.insertValue(a[i]);
		}
		System.out.println(node.toString());
		System.out.println(doubleIt(node).toString());

	}
	public static Node doubleIt(Node node) {
		 int temp=0;
		 Node current = node.head;
	        while(current!=null){
	            temp=temp*10+current.val;
	            current=current.next;
	        }
	        temp=temp*2;
	        Node newhead=new Node();
	        while(temp!=0){
	            int val=temp%10;
	            newhead.insertValue(val);
	            temp/=10;
	        }
	        return newhead;
	}
	
}

class Node {
	int val;
	Node next;
	Node head = null;

	public Node() {
		this.val = 0;
		this.next = null;
	}

	public Node(int value) {
		this.val = value;
		this.next = null;
	}

	public Node(int value, Node next) {
		this.val = value;
		this.next = next;
	}

	public void insertValue(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
		
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		Node current = head;
		while (current != null) {
			result.append(current.val).append(" -> ");
			current = current.next;
		}
		result.append("null");
		return result.toString();
	}
}
