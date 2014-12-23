/* This is a linked list implementation of a stack. (Test)
 * 
 * @author Sean Staz
 *
 * @param <T> the type of element.
 */
 
 package edu.olemiss.cs.csci211;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class LinkedStackTest {

	@Test
	public void testAllPopped()
	{
		LinkedStack<Integer> stack = new LinkedStack<Integer>();
		
		Integer eleven = 11;
		Integer two = 2;
		Integer six = 6;
		Integer nine = 9;
		
		stack.push(eleven);
		stack.push(two);
		stack.push(six);
		stack.push(nine);
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		assertTrue(stack.top == null);
	}

	@Test
	public void testObjComp()
	{
		LinkedStack<Integer> stack = new LinkedStack<Integer>();
		
		Integer eleven = 11;
		Integer two = 2;
		Integer six = 6;
		Integer nine = 9;
		
		stack.push(eleven);
		stack.push(two);
		stack.push(six);
		stack.push(nine);
		
		assertEquals(stack.top.element, nine);
	}
	
	@Test(expected=NoSuchElementException.class)
	public void testPopException()
	{
		LinkedStack<Integer> stack = new LinkedStack<Integer>();
		
		stack.pop();
	}
	
	@Test
	public void testIterator()
	{
		LinkedStack<Integer> stack = new LinkedStack<Integer>();
		
		Integer eleven = 11;
		Integer two = 2;
		Integer six = 6;
		Integer nine = 9;
		
		stack.push(eleven);
		stack.push(two);
		stack.push(six);
		stack.push(nine);
		
		assertTrue(stack.iterator().hasNext());
	}
	
	@Test
	public void testIterator2()
	{
		LinkedStack<Integer> stack = new LinkedStack<Integer>();
		
		Integer eleven = 11;
		Integer two = 2;
		Integer six = 6;
		Integer nine = 9;
		
		stack.push(eleven);
		stack.push(two);
		stack.push(six);
		stack.push(nine);
		
		int i = 0;
		Integer[] seq = {nine, six, two, eleven};
		
		for (Integer val : stack) 
		{
		    assertEquals(seq[i], val);
		    i++;
		}
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testIteratorRemoveException()
	{
		LinkedStack<Integer> stack = new LinkedStack<Integer>();
		
		Integer eleven = 11;
		Integer two = 2;
		Integer six = 6;
		Integer nine = 9;
		
		stack.push(eleven);
		stack.push(two);
		stack.push(six);
		stack.push(nine);
		
		stack.iterator().remove();
	}
	
	@Test(expected = NoSuchElementException.class)
	public void testNextException()
	{
		LinkedStack<Integer> stack = new LinkedStack<Integer>();

		stack.iterator().next();
	}
}
