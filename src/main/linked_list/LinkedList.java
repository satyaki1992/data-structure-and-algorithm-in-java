package main.linked_list;

/**
 * Implementation of a custom linked list
 */
public class LinkedList {
	
	//TODO:
	// 1. implement delete node operation
	// 2. update node value operation
	// 3. insert node method modify to add node at particular place in list
	
	public Node addNodeAtEndOfList(final Node head, final int data) {
		//list is empty
		if (head == null) {
			return new Node(data);
		} else if (head.getNextNode() == null) {
			head.setNextNode(new Node(data));
			return head;
		}
		addNodeAtEndOfList(head.getNextNode(), data);
		return head;
	}
	
	public void printDataOfList(final Node head) {
		
		//list is empty
		if (head == null) {
			return;
		}
		System.out.println(head.getData());
		if (head.getNextNode() == null) return;
		printDataOfList(head.getNextNode());
	}
	
	public Node getLastNode(final Node head) {
		
		//list is empty
		if (head == null) {
			return null;
		} else if (head.getNextNode() == null) {
			return head;
		}
		return getLastNode(head.getNextNode());
	}

}
