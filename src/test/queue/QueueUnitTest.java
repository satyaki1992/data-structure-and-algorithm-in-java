package test.queue;

import main.queue.Queue;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class QueueUnitTest {
	
	private Queue queue;
	private int capacity;
	
	@Before
	public void setUp() {
		capacity = 10;
		queue = new Queue(capacity);
	}
	
	@Test
	public void shouldAddElementsToQueue() throws IllegalAccessException {
		//GIVEN
		
		//WHEN
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		
		//THEN
		assertEquals(1, queue.peek());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldAddOnlyMaxElementsAllowed() {
		//GIVEN
		
		//WHEN
		IntStream.range(1, capacity+2).forEach(element -> queue.enqueue(element));
		
		//THEN
		
	}
	
	@Test
	public void shouldDequeue() throws IllegalAccessException {
		
		//GIVEN
		
		//WHEN
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		int elementDequeued = queue.dequeue();
		
		//THEN
		assertEquals(1, elementDequeued);
		assertEquals(2, queue.peek());
	}
}
