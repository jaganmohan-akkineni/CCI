

public class kth_to_last {
	
	static class Node
	{
		int val;
		Node next;
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	static Node kthToLast(Node head, int k) {
		Node ptr1 = head, ptr2 = head;
		for(int i=0; i<k; i++) {
			ptr2 = ptr2.next;
		}
		while(ptr2!=null) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		return ptr1;
	}
	
	public static void main(String[] args) {
		
		Node start = new Node(7); 
        start.next = new Node(8); 
        start.next.next = new Node(3); 
        start.next.next.next = new Node(4); 
        start.next.next.next.next = new Node(2); 
        start.next.next.next.next.next = new Node(9);
        
        System.out.println("kth last element:" + kthToLast(start, 2).val);
        
	}
}