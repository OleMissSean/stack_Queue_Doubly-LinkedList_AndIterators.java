/* A linked list implementation of a Queue. (Test)
 * @author Sean Staz
 * 
 *
 *
 */package edu.olemiss.cs.csci211;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

public class LinkedQueueTest {

	@Test
	public void testObjComparison() 
	{
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		
		Integer eleven = 11;
		Integer two = 2;
		Integer six = 6;
		Integer nine = 9;
		
		queue.enqueue(eleven);
		queue.enqueue(two);
		queue.enqueue(six);
		queue.enqueue(nine);
		
		queue.dequeue();
		queue.dequeue();
		
		assertEquals(queue.head.element, six);
	}

	@Test
	public void testDequeue() 
	{
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		
		Integer eleven = 11;
		Integer two = 2;
		Integer six = 6;
		Integer nine = 9;
		
		queue.enqueue(eleven);
		queue.enqueue(two);
		queue.enqueue(six);
		queue.enqueue(nine);
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		assertEquals(queue.head, null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDequeueException()
	{
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		
		queue.dequeue();
	}
	
	@Test
	public void testIterator()
	{
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		
		Integer eleven = 11;
		Integer two = 2;
		Integer six = 6;
		Integer nine = 9;
		
		queue.enqueue(eleven);
		queue.enqueue(two);
		queue.enqueue(six);
		queue.enqueue(nine);
		
		assertTrue(queue.iterator().hasNext());
	}
	
	@Test
	public void testIterator2()
	{
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		
		Integer eleven = 11;
		Integer two = 2;
		Integer six = 6;
		Integer nine = 9;
		
		queue.enqueue(eleven);
		queue.enqueue(two);
		queue.enqueue(six);
		queue.enqueue(nine);
		
		int i = 0;
		Integer[] seq = {eleven, two, six, nine};
		
		for (Integer val : queue) 
		{
		    assertEquals(seq[i], val);
		    i++;
		}
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testIteratorRemoveException()
	{
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		
		Integer eleven = 11;
		Integer two = 2;
		Integer six = 6;
		Integer nine = 9;
		
		queue.enqueue(eleven);
		queue.enqueue(two);
		queue.enqueue(six);
		queue.enqueue(nine);
		
		queue.iterator().remove();
	}
	
	@Test(expected = NoSuchElementException.class)
	public void testNextException()
	{
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();

		queue.iterator().next();
	}
}
