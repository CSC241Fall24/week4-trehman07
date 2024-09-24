// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
    	
    	if(l1 == null) {
    		return copyList(l2);	
    	}
    	ListNode currentNode = l1;
    	while(currentNode.next != null) {
    		currentNode = currentNode.next;
    	}
    	
    	// copy each node from l2 and append(Add) to l1
    	
    	ListNode l2copy = copyList(l2);
    	currentNode.next = l2copy;
    	return l1;
    }
    
    
    private static ListNode copyList(ListNode node) {
    	if(node == null) {
    		return null;
    	}
    	
    	ListNode head = new ListNode(node.val);
    	ListNode current = head;
    	while(node.next!= null) {
    		node = node.next;
    		current.next = new ListNode(node.val);
    		current = current.next;
    	}
    	return head ;
    }
}
