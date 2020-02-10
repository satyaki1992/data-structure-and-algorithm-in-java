package main.queue;

/**
 * Implementation of Queue with the help of array
 */
public final class Queue {
	
	private int queuePointer = 0;
	private int[] queueArr;
	//TODO: can this be removed ?
	private boolean elementInserted;
	
	public Queue(final int sizeOfQueue) {
		if (sizeOfQueue <= 0) throw new IllegalArgumentException("Please enter a value greater than 0");
		queueArr = new int[sizeOfQueue];
	}
	
	public void enqueue(final int element) {
		if (elementInserted) ++queuePointer;
		
		if (queuePointer == queueArr.length) throw new IllegalArgumentException("Queue is full");
		
		queueArr[queuePointer] = element;
		elementInserted=true;
	}
	
	public int dequeue() throws IllegalAccessException {
		
		if(queuePointer == 0) throw new IllegalAccessException("Queue is empty");
		int elementDequeued = queueArr[0];
		shiftElementQueueArr();
		return elementDequeued;
	}
	
	private void shiftElementQueueArr() {
		
		for(int i=1; i<queuePointer; i++) {
			queueArr[i-1] = queueArr[i];
		}
	}
	
	public int peek() throws IllegalAccessException {
		
		if(queuePointer==0) throw new IllegalAccessException("Queue is empty");
		
		return queueArr[0];
	}
}
