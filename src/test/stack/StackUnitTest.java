package test.stack;

import main.stack.Stack;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

//TODO: add more unit test
public class StackUnitTest {
	
	private Stack stack;
	private int capacityOfStack;
	
	@Before
	public void setUp() {
		capacityOfStack=10;
		stack = new Stack(capacityOfStack);
	}
	
	@Test
	public void shouldInsertAtTopOfStack() {
		
		//GIVEN
		
		//WHEN
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		//THEN
		assertEquals(4, stack.peek());
		
	}
	
	@Test(expected = StackOverflowError.class)
	public void shouldThrowStackOverflowIfMoreThanCapacityElementsArePushed() {
		//GIVEN
		
		//WHEN
		IntStream.range(1, capacityOfStack+2).forEach(element -> stack.push(element));
		
		//THEN
		
	}
	
	@Test
	public void shouldRemoveFromTopOfStack() {
		//GIVEN
		
		//WHEN
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		int elementPopped = stack.pop();
		
		//THEN
		assertEquals(4, elementPopped);
		assertEquals(3, stack.peek());
	}
	
	@Test(expected = EmptyStackException.class)
	public void shouldThrowExceptionForEmptyStackPop() {
		
		//GIVEN
		
		//WHEN
		stack.pop();
		
		//THEN
	}
}