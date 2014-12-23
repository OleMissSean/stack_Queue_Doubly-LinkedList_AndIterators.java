package edu.olemiss.cs.csci211;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.olemiss.cs.csci211.DoublyLinkedList.Node;

/**
 * 
 */

/** An iterator class for doubly linked lists.
 * @author rhodes
 *
 */
public class DoublyLinkedListIterator<E> implements Iterator<E>
{
	private int iteratorModCount;	//The number of elements in the collection
	private Node current;			//The current position
	private Node previous;
	
	public DoublyLinkedListIterator(DoublyLinkedList<E> list) 
	{
		current = list.head;
		previous = null;
		iteratorModCount = list.count;
	}

	@Override
	public boolean hasNext() throws NoSuchElementException
	{
		// TODO Auto-generated method stub
		
        if (iteratorModCount == 0) 
        	throw new NoSuchElementException();
		
		return(current != null);
	}

	@Override
	public E next() throws NoSuchElementException
	{
		// TODO Auto-generated method stub
		
        if (!hasNext()) 
        	throw new NoSuchElementException();
        
        E r = (E) current.element;
        current.previous = current;
        current = current.next;
        
        iteratorModCount++;
        
        return r;
	}

	@Override
	public void remove() throws NoSuchElementException
	{
		// TODO Auto-generated method stub
		
		if(iteratorModCount == 0)
			throw new NoSuchElementException();

            if (previous != null) 
            {
                previous.next = current.next;
            } 
            else 
            {
                current = current.next;
            }
	}
}
