package stacksHeapsQueuesPractice;

public class Queue {
	private class Node {
		private int data;
		private Node next;
		private Node(int data) {
			this.data = data;
		}
		
	}
	
	private Node head;
	private Node tail;
	
	//Check if Queue is empty
	public boolean isEmpty() {
		return (head == null);
	}
	
	//Read first position
	public int peek() {
		return head.data;
		
	}
	
	//Add to back of queue
	public void add(int data) {
		Node newNode = new Node(data);
		if(tail !=null) {
			tail.next = newNode;
		}
		tail = newNode;
		if (head == null) {
			head = newNode;
		}
	}
	
	//Remove from head of queue
	public int remove() {
		int data = head.data;
		head = head.next;
		if(head==null) {
			tail=null;
		}
		return data;
		
	}
}
