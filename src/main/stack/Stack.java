package main.stack;

import java.util.EmptyStackException;

/**
 * Implementation of a Stack with the use of arrays
 */

public final class Stack {
	
	private int tos = 0;
	private int[] stackArr;
	//TODO: can this be removed ?
	private boolean elementInserted;
	
	public Stack(final int sizeOfStack) {
		if (sizeOfStack <= 0) throw new IllegalArgumentException("Please enter a value greater than 0");
		stackArr = new int[sizeOfStack];
	}
	
	public void push(final int element) {
		
		if (elementInserted) ++tos;
		if (tos == stackArr.length) {
			throw new StackOverflowError("Stack overflow..");
		}
		stackArr[tos] = element;
		elementInserted = true;
	}
	
	public int pop() {
		if (tos == 0) {
			throw new EmptyStackException();
		}
		return stackArr[tos--];
	}
	
	public int peek() {
		if (tos == 0) {
			throw new EmptyStackException();
		}
		return stackArr[tos];
	}
}
