
public class loopdetection{
	static class Node{
		int val;
		Node next =null;
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	static Node loop_detection(Node head) {
		if(head==null) return null;
		
		Node ptr1 = head, ptr2 = head;
		
		while(ptr2!=null && ptr2.next!=null) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next.next;
			if(ptr1==ptr2) break;
			
		}
		
		if(ptr2==null || ptr2.next==null) return null;
		ptr1 = head;
		while(ptr1!=ptr2) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		return ptr1;
	}
	
	public static void main(String args[]) {
		Node start = new Node(1); 
        start.next = new Node(1); 
        start.next.next = new Node(2); 
        start.next.next.next = new Node(3); 
        start.next.next.next.next = new Node(1); 
        start.next.next.next.next.next = new Node(1); 
        start.next.next.next.next.next.next = new Node(1); 
        start.next.next.next.next.next.next.next = new Node(1); 
        start.next.next.next.next.next.next.next = start.next.next;
        
        if(loop_detection(start)!=null) System.out.println(loop_detection(start).val);
        
	}
}