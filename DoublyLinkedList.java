
package edu.olemiss.cs.csci211;

import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.olemiss.cs.csci211.DoublyLinkedList.Node;

/** This class maintains a list of elements with no specific order. This is a linked implementation, in
 * which space is allocated for list nodes dynamically. List nodes keep track of
 * both the next node and previous node in the list. If no such node exists, a null reference is
 * used to indicate the end of the list.
 * 
 * @author rhodes
 *
 * @param <T>
 */
public class DoublyLinkedList<T> implements UnorderedList<T>
{
	protected int count;
	protected Node head;
	protected Node tail;

	
	public class Node
	{
		T element;
		Node next;
		Node previous;
		
	}
	
	public DoublyLinkedList()
	{
		count = 0;
		head = tail = null;
	}
	
	@Override
	public boolean isEmpty() 
	{
		// TODO Auto-generated method stub
		
		if(head == null && tail == null)
			return true;
		
		else
			return false;
	}

	@Override
	public T removeFirst() throws IllegalArgumentException
	{
		// TODO Auto-generated method stub
		
		if(isEmpty())
			throw new IllegalArgumentException("List is empty.");
		
		Node n = new Node();
		n.element = head.element;

		head = head.next;
			
		return n.element;
	}

	@Override
	public T removeLast() 
	{
		// TODO Auto-generated method stub
		
		if(isEmpty())
			throw new IllegalArgumentException("List is empty.");
		
		Node n = new Node();
		n.element = tail.element;

		tail = tail.previous;
			
		return n.element;
	}

	@Override
	public Iterator<T> iterator() 
	{
		// TODO Auto-generated method stub
		
		DoublyLinkedListIterator itr = new DoublyLinkedListIterator(null);
		
		return itr;
	}

	@Override
	public void addToFront(T e) 
	{
		// TODO Auto-generated method stub
		
		Node n = new Node();
		
		if(head == null)
		{
			head = n;
			tail = n;
			n.next.element = null;
			n.previous.element = null;
		}
		else
		{
			n.next.element = head.element;
			head.previous.element = n.element;
			
			head = n;
		}
	}

	@Override
	public void addToRear(T e) 
	{
		// TODO Auto-generated method stub
		
		Node n = new Node();
		
		if(tail == null)
		{
			head = n;
			tail = n;
			n.next.element = null;
			n.previous.element = null;
		}
		else
		{
			n.previous.element = tail.element;
			tail.next.element = n.element;
			
			tail = n;
		}
	}
}
