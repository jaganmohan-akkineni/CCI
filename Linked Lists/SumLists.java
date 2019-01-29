
public class SumLists{
	static class Node{
		int val;
		Node next = null;
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	static Node sum_lists(Node head1, Node head2) {
		int carry = 0, sum = 0;
		Node prev = null, ptr1 = head1, ptr2 = head2, x = null; 
		
		if(ptr1==null)
			return ptr2;
		else if(ptr2==null)
			return ptr1;
		else {
			while(ptr1!=null && ptr2!=null) {
				sum = ptr1.val + ptr2.val + carry;
				carry = sum/10;
				sum = sum%10;
				
				ptr1.val = sum;
				prev = ptr1;
				ptr1 = ptr1.next;
				ptr2 = ptr2.next;
			}
			
			if(ptr1==null) {
				x = ptr2;
			}
			else {
				x = ptr1;
			}
			while(x!=null) {
				if(carry == 0) {
					prev.next = x;
					x = null;
				}
				else {
					prev.next = x;
					sum = x.val + carry;
					carry = sum/10;
					sum = sum%10;
					
					x.val = sum;
					prev = x;
					x = x.next;
				}
			}
			return head1;
		}
	}
	
	static void sum_lists2(Node head1, Node head2) {
		
	}
	
	static void printList(Node head) {
		while(head!=null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	public static void main(String args[]) {
		Node start = new Node(2); 
        start.next = new Node(7); 
        start.next.next = new Node(6);
        
        Node start2 = new Node(8); 
        start2.next = new Node(5); 
        start2.next.next = new Node(4);
        start2.next.next.next = new Node(2);
        start2.next.next.next.next = new Node(9);
        
        printList(start);
        printList(start2);
        System.out.println(" ");
        printList(sum_lists(null, start2));
	}
}