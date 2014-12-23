CSci211.A1.java
===============

Assignment #1 for CSci 211.

csci 211 Assignment 1
Simple Linked Data Structures
Due: Monday, October 14, 20131
This assignment provides exposure and experience with the Eclipse debugger, JUnit testing, test
driven development and implementing linked data structures.
Overview
This assignment asks you to implement and test Stack, Queue, Doubly-Linked List, and associated
iterators. You should not use the equivalent classes from the Java Collections framework,
but should instead do your own implementations.
What is provided
You should find an Eclipse project archive on blackboard that you can import directly into
eclipse. This works the same way as in exercise 1.
Javadoc
For this exercise, you’ll find javadoc has been generated for you that describes the desired behavior
of various classes. You’ll want to read this documentation to find out what methods of the
various classes should do.
What to do
There are three levels to this assignment. Be sure that you have a correct and fully tested implementation
of each level before moving to the next level.
75% level. To get credit for this level, you’ll need to implement a class called LinkedStack. This
class implements the Stack<T> and Iterable<T> interfaces, as described in the javadoc. (Iterable<
T> is part of the Java libraries, and was covered in class.) You will also need to write a
class that implements the Iterator<T> interface and works with your LinkedStack class. The
javadoc for SinglyLinkedListIterator describes a good model for this iterator. Note that it
throws an exception if remove() is called.
Lastly, write a JUnit test class named LinkedStackTest that tests both LinkedStack and the
iterator class that goes with it. Be as thorough as possible in your tests.
85% level. To get credit for this level, you must complete the previous level, and also implement
a classes called LinkedQueue. This class implements the Queue<T> and Iterable<T> interfaces,
as described in the javadoc. You will also need to write a class that implements the Iterator<T>
interface and works with your LinkedQueue class. You may find it convenient to make a class
1 Assignments are not considered late until 8AM the following morning. After that, a late penalty of 5% per
day will be applied up to seven days, after which the assignment cannot be accepted.
called something like SinglyLinkedList<T> that serves as the implementation for both your
Stack and Queue classes. In this case, you will probably only need one Iterator class. Inheritance
is a useful mechanism for this kind of design.
Lastly, write a JUnit test class named LinkedQueueTest that tests both LinkedStack and the
iterator class that goes with it. Be as thorough as possible in your tests.
100% level. To get credit for this level, you must complete the previous level, and also implement
the DoublyLinkedList<T> class. As described in the Javadoc, this class uses nodes that
maintain references to the previous as well as next node in the list. You will also need to implement
a class named DoublyLinkedListIterator<T> that works with DoublyLinkedList<T>.
Unlike the iterator(s) used for the 75 and 85% levels, you will need to implement the remove()
method for this iterator.
Lastly, write a JUnit test class named DoublyLinkedListTest that tests both DoublyLinked-
ListTest and the iterator class that goes with it. Be as thorough as possible in your tests.
Academic Honesty
Obviously, handing in someone else’s code as your own is considered cheating, and we actively
(and successfully) check for this. More importantly, if you don’t do your own work, you won’t
develop the skills that you have paid for, and won’t be able to compete in the job market.
Submission
It is important to put your name on all of your files. It also important to make a single zip archive
(not 7zip, or any other weird formats) containing your project. You can do this from inside
Eclipse using Export... under the File menu. Next, submit your archive file via blackboard. Be
sure to complete the blackboard submission process entirely.
