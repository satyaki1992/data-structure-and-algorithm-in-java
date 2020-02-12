package main.linked_list;

public class Node {
	
	private int data;
	private Node nextNode;
	
	public Node() {
	}
	
	public Node(final int data) {
		this.data = data;
		nextNode = null;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public Node getNextNode() {
		return nextNode;
	}
	
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
}