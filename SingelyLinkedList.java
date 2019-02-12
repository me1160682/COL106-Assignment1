public class SingelyLinkedList<E>
{
	//instance fields
	private SingleNode<E> header;
	private SingleNode<E> trailer;
	
	//Constructors
	public SingelyLinkedList(SingleNode<E> head,SingleNode<E> tail)
	{
		header = new SingleNode<E>();
		trailer = new SingleNode<E>();
		header.setNext(head);
		tail.setNext(trailer);
	}
	
	public SingelyLinkedList(){
		header = new SingleNode<E>();
		trailer = new SingleNode<E>();
		header.setNext(trailer);
	}
	
	//Access Methods
	public SingleNode<E> getHeader()
	{
		return header;
	}
	
	public SingleNode<E> getHead()
	{
		return header.getNext();
	}
	
	public void print()
	{
		SingleNode<E> n = header.getNext();
		while (n.getElement() != null)
		{
			System.out.println(n.getElement());
			n = n.getNext();
		} 
	}
	
	//Update Methods
	public void removeHead()
	{
		header.setNext(header.getNext().getNext());
	}
	
	public void addHead(SingleNode<E> n)
	{
		insertAfter(n,header);
	}
	
	public void insertAfter(SingleNode<E> n, SingleNode<E> after)
	{
		n.setNext(after.getNext());
		after.setNext(n);
	}
	
	//  adding  or removing tails is inefficient
	// removing element from between is inefficeint
}
	
	
	
	
	
