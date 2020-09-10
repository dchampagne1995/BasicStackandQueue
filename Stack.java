package stacksHeapsQueuesPractice;

public class Stack {
	private class Node {
		private int data;
		private Node next;
		private Node(int data) {
			this.data = data;
		}
		
	}
	
	private Node top;
	
	//Check if stack is empty
	public boolean isEmpty() {
		return (top == null);
	}
	
	//Check item at top of stack
	public int peek() {
		return top.data;
		
	}
	
	//Push function (add to top)
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
			
	}
	//Pop function (Remove from top)
	public int pop() {
	int data = top.data;
	top = top.next;
	return data;
	
	}
}
	
	
	
	
	

