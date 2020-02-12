package test.linked_list;

import main.linked_list.LinkedList;
import main.linked_list.Node;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {
	
	private LinkedList linkedList;
	
	@Before
	public void setUp() {
		linkedList = new LinkedList();
	}
	
	@Test
	public void shouldCreateFirstNode() {
		//GIVEN
		Node head;
		
		//WHEN
		head = linkedList.addNodeAtEndOfList(null, 28);
		
		//THEN
		assertEquals(28, linkedList.getLastNode(head).getData());
	}
	
	@Test
	public void shouldCreateNewNodeAtEndOfList() {
		//GIVEN
		Node head;
		
		//WHEN
		head = linkedList.addNodeAtEndOfList(null, 28);
		head = linkedList.addNodeAtEndOfList(head, 97);
		
		//THEN
		assertEquals(97, linkedList.getLastNode(head).getData());
	}
}