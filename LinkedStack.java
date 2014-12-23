package edu.olemiss.cs.csci211;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;


/** This is a linked list implementation of a stack. 
 * 
 * @author Sean Staz
 *
 * @param <T> the type of element.
 */


public class LinkedStack<T>  implements Stack<T>, Iterable<T>
{
	class Node
	{
		T element;
		Node next;
	}
	
	protected Node top;
	protected int count;

	public LinkedStack()
	{
		count = 0;
		top = null;
	}

	@Override
	public java.util.Iterator<T> iterator()
	{
		Iterator<T> itr = new LinkedStackIterator();
		
		return itr;
	}

	@Override
	public T pop() throws NoSuchElementException
	{
		// TODO Auto-generated method stub
		
		if (top == null)
			throw new NoSuchElementException("Empty Stack.");
		
		T r = top.element;
		top = top.next;

		count --;
		
		return r;
	}

	@Override
	public void push(T element) 
	{
		// TODO Auto-generated method stub
		
		Node n = new Node();
		
		n.element = element;
		n.next = top;
		top = n;
		
		count ++;		
	}
	
	private class LinkedStackIterator implements Iterator<T>
	{
		private int iteratorModCount;	//The number of elements in the collection
		private Node current;			//The current position
		
		@SuppressWarnings("unused")
		public LinkedStackIterator()
		{
			current = top;
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
