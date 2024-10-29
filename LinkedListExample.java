package Java_Questions;

public class LinkedListExample {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}

	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50};
		for(int i=0;i<arr.length;i++) {
			Node node=new Node(arr[i]);
			if(head==null) {
				head=node;
			}else {
				Node last=head;
				while(last.next!=null) last=last.next;
				last=node;
			}
		}
		printLinkedList(head);
		Node reverseNode=reverseLinkedList(head);
		printLinkedList(reverseNode);
		
	}

	private static void printLinkedList(Node node) {
		System.out.print("LinkedList is: ");
		while(node!=null) {
			System.out.println(" "+node.data);
			node=node.next;
		}
	}

	private static Node reverseLinkedList(Node head) {
		if(head==null || head.next==null) return head;
		Node prev=null;
		Node curr=head;
		while(curr!=null) {
			Node temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}
}
