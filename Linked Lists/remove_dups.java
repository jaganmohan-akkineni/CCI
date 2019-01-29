import java.util.*;

public class remove_dups {
	
	static class Node
	{
		int val;
		Node next;
		
		public Node(int val)
		{
			this.val = val;
		}
	}
	
	static void removeDuplicate(Node head) {
		Node i=null, j=null, prev=null;
		i = head;
		while(i!=null && i.next!=null)
		{
			j = i.next;
			prev = i;
			while(j!=null)
			{
				if(i.val==j.val)
				{
					prev.next = j.next;
					System.gc();
				}
				prev = j;
				j = j.next;
			}
			i = i.next;
		}
	}
	
	static void removeDuplicate2(Node head) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		Node ptr = head, prev = null;
		while(ptr!=null) {
			prev = ptr;
			
			if(set.contains(ptr.val)) {
				prev.next = ptr.next;
			}else {
				set.add(ptr.val);
				prev = ptr;
			}
			ptr = ptr.next;
		}
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
        start.next.next.next.next = new Node(1); 
        
        printList(start);
        
        
        removeDuplicate(start);
        System.out.println("RemoveDuplicate:\n");
        printList(start);
        
        removeDuplicate2(start);
        System.out.println("\nRemoveDuplicate2:\n");
        printList(start);
        

	}
}