
public class palindrome{
	static class Node{
		char val; 
		Node next = null;
		
		public Node(char val) {
			this.val = val;
		}
	}
	
	static boolean is_palindrome(Node head) {
		
		if(head==null)
			return false;
		
		int[] flag = new int[128];
		for(int i=0; i<128; i++) {
			flag[i] = 0;
		}
		
		while(head!=null) {
			flag[(int) head.val] += 1;
			head = head.next;
		}
		int foundOdd = 0;
		for(int i=0; i<128; i++) {
			if(flag[i]%2!=0)
			{
				if(foundOdd==0)
					foundOdd = 1;
				else
					return false;
			}		
		}
		return true;
 	}
	
	static void printList(Node head) {
		while(head!=null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	public static void main(String args[]) {
		Node start = new Node('a'); 
        start.next = new Node('b'); 
        start.next.next = new Node('c'); 
        start.next.next.next = new Node('d'); 
        start.next.next.next.next = new Node('k'); 
        start.next.next.next.next.next = new Node('b'); 
        start.next.next.next.next.next.next = new Node('a'); 
        //start.next.next.next.next.next.next.next = new Node(7);
        
        printList(start);
        System.out.println(is_palindrome(start));
	}
}