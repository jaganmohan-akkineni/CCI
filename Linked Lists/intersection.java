
public class intersection{
	static class Node{
		int val;
		Node next = null; 
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	static Node Intersection(Node head1, Node head2) {
		if(head1==null || head2==null) return null;
		
		Node ptr1 = head1, ptr2 = head2;
		int size1 = 0, size2 = 0;
		while(ptr1.next!=null)
		{
			size1++;
			ptr1 = ptr1.next;
		}
		while(ptr2.next!=null)
		{
			size2++;
			ptr2 = ptr2.next;
		}
		size1++;
		size2++;
		
		System.out.println("Size1:" + size1 + "size2:" + size2);
		
		if(ptr1!=ptr2)			//if tails are not same then there is no intersection.
			return null;
		
		ptr1 = head1; 
		ptr2 = head2;
		
		if(size1>size2)
		{
			int n = size1 - size2;
			for(int j=0; j<n; j++)
				ptr1 = ptr1.next;
		}
		else if(size2>size1)
		{
			int n = size2 - size1;
			for(int j=0; j<n; j++)
				ptr2 = ptr2.next;
		}
		
		while(ptr1==ptr2)
		{
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		return ptr1;
	}
	
	static void printList(Node head) {
		while(head!=null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	public static void main(String args[]) {
		
		Node start = new Node(1); 
        start.next = new Node(1); 
        start.next.next = new Node(2); 
        start.next.next.next = new Node(3); 
        start.next.next.next.next = new Node(1); 
        
        Node start2 = new Node(1); 
        start2.next = new Node(1); 
        start2.next.next = new Node(2); 
        start2.next.next.next = new Node(3); 
        start2.next.next.next.next = new Node(1); 
        
        start.next.next.next.next.next = new Node(1); 
        start2.next.next.next.next.next = start.next.next.next.next.next;
        
        start.next.next.next.next.next.next = new Node(3);
        
        printList(start);
        System.out.println(" ");
        printList(start2);
        System.out.println(Intersection(start, start2).val);
 		
	}
}