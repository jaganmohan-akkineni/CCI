
public class partition{
	
	static class Node{
		int val;
		Node next = null; 
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	static Node partition_k(Node head, int k) {
		Node ptr1 = head, prev=null;
		
		while(ptr1!=null)
		{
			if(ptr1.val<k && ptr1!=head) {
				prev.next = ptr1.next;
				ptr1.next = head;
				head = ptr1;
				ptr1 = prev.next;
			}
			else {
				prev = ptr1;
				ptr1 = ptr1.next;
			}
		}
		
		return head;
	}
	
	static Node partition_k2(Node head, int k) {
		Node BeforeStart = null, BeforeEnd = null;
		Node AfterStart = null, AfterEnd = null;
		
		while(head!=null)
		{
			if(head.val<k) {
				if(BeforeStart==null) {
					BeforeStart = head; 
					BeforeEnd = head;
				}
				else {
					BeforeEnd.next = head; 
					BeforeEnd = head;
				}
			}
			else {
				if(AfterStart == null) {
					AfterStart = head;
					AfterEnd = head;
				}
				else {
					AfterEnd.next = head;
					AfterEnd = head;
				}
			}
			head = head.next;
		}
		
		BeforeEnd.next = AfterStart;
		AfterEnd.next = null;
		return BeforeStart;
	}
	
	static void printList(Node head) {
		while(head!=null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	public static void main(String args[]) {
		Node start = new Node(3); 
        start.next = new Node(5); 
        start.next.next = new Node(8); 
        start.next.next.next = new Node(5); 
        start.next.next.next.next = new Node(10); 
        start.next.next.next.next.next = new Node(2); 
        start.next.next.next.next.next.next = new Node(1); 
        //start.next.next.next.next.next.next.next = new Node(7);
        
        //start = partition_k(start, 5);
        //printList(start);

        start = partition_k2(start, 5);
        printList(start);
	}
}