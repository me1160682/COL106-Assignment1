import java.util.EmptyStackException;
public class MyStack<E>
{
	//Instance fields
	private SingelyLinkedList<E> list;
	private SingleNode<E> head;
	
	//Constructor
	public MyStack()
	{
		list = new SingelyLinkedList<E>();
		head = new SingleNode<E>();
	}
	
	//Update Methods
	public void push(E item)
	{
		SingleNode<E> n = new SingleNode<E>(item);
		list.addHead(n);
		head = n;
	}
	
	public E pop()
	{
		if (empty()) throw new EmptyStackException();
		E item = head.getElement();
		list.removeHead();
		head = list.getHead();
		return item;
	}
	
	//Access Methods
	public E peek()
	{
		if (empty()) throw new EmptyStackException();
		return head.getElement();
	}
	
	public boolean empty()
	{
		if (head.getElement() == null)
		{
			return true;
		}
		return false;
	}
	
	public void print()
	{
		list.print();
	}
}

	
	
	
	
	
	
	
	
		 
