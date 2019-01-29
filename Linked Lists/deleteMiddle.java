public class deleteMiddle {
	
	static class Node {
		int val;
		Node next;
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	static void delete_Middle(Node head) {
		Node ptr1=head, ptr2 = head, prev = null;
		
		while(ptr2!=null && ptr2.next!=null) {
			prev = ptr1;
			ptr1 =ptr1.next;
			ptr2 = ptr2.next.next;
		}
		prev.next = ptr1.next;
		System.gc();
	}
	
	static boolean delete_Middle2(Node n) {
		if(n==null || n.next==null)
			return false;
		n.val = n.next.val;
		n.next = n.next.next;
		System.gc();
		return true;
	}
	
	static void printList(Node head) {
		while(head!=null) {
			System.out.println(head.val + " ");
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		Node start = new Node(1); 
        start.next = new Node(1); 
        start.next.next = new Node(2); 
        start.next.next.next = new Node(3); 
        start.next.next.next.next = new Node(4); 
        start.next.next.next.next.next = new Node(5); 
        start.next.next.next.next.next.next = new Node(6); 
        //start.next.next.next.next.next.next.next = new Node(7); 
        
        delete_Middle(start);
        printList(start);
	}
}