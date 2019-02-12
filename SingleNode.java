public class SingleNode<E>
{
	//instance fields
	private E element;
	private SingleNode<E> next;
	
	//Constructors
	public SingleNode(){}
	public SingleNode(E a)
	{
		element = a;
		next = null;
	}
	
	// Access Methods
	public E getElement()
	{
		return element;
	}
	public SingleNode<E> getNext() 
	{
		return next;
	}
	
	//Update Methods
	public void setElement(E a) { element = a ;}
	public void setNext(SingleNode<E> n) { next = n ;}
}
