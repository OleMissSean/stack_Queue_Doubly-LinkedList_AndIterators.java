package edu.olemiss.cs.csci211;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/** A linked list implementation of a Queue.
 * @author Sean Staz
 * 
 *
 *
 */

public class LinkedQueue<T>  implements Queue<T>, Iterable<T>
{
	protected Node head;
	protected Node tail;
	protected int count;
	
	class Node
	{
		T element;
		Node next;
	}
	  
	public LinkedQueue()
	{
		head = null;
	    tail = null;
	    count = 0;
	}
	
	@Override
	public Iterator<T> iterator() 
	{
		// TODO Auto-generated method stub
		
		Iterator<T> itr = new LinkedQueueIterator();
		
		return itr;
	}

	@Override
	public void enqueue(T element) 
	{
		// TODO Auto-generated method stub
		
		Node n = new Node();
        n.element = element;
        
	    if (head == null) 
	    {
	        head = n;
	        tail = head;
	    } 
	    else 
	    {	    	
	        tail.next = n;
	        tail = tail.next;
	    }
	    
	      count++;
	}

	@Override
	public T dequeue() throws IllegalArgumentException
	{
		// TODO Auto-generated method stub
		
		if (head == null)
		{
			throw new IllegalArgumentException("Queue is empty.");
		}
		else 
		{
			T elementCopy = head.element;
			head = head.next;
		    count--;
		    
		    if (count == 0) 
		    {
		    	tail = null;
		    }
		    
		    return elementCopy;
		}
	}
	
	private class LinkedQueueIterator implements Iterator<T>
	{
		private int iteratorModCount;	//The number of elements in the collection
		private Node current;			//The current position
		
		@SuppressWarnings("unused")
		public LinkedQueueIterator()
		{
			current = head;
			iteratorModCount = count;
		}
		
		@Override
		public boolean hasNext() throws ConcurrentModificationException
		{
			// TODO Auto-generated method stub
			
			if(iteratorModCount != count)
				throw new ConcurrentModificationException();
			
			return(current != null);
		}

		@Override
		public T next() throws ConcurrentModificationException
		{
			// TODO Auto-generated method stub
			
			if(!hasNext())
				throw new NoSuchElementException();
			
			T r = current.element;
			current = current.next;
			
			return r;
		}

		@Override
		public void remove() throws UnsupportedOperationException
		{
			// TODO Auto-generated method stub
			
			throw new UnsupportedOperationException();
		}	
	}
}
