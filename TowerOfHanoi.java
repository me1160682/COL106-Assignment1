import java.util.Scanner ;
public class TowerOfHanoi<E>
{	
	public static void toh_with_recursion(int num_disks, int start_pos, int end_pos)
	{
		if (num_disks ==0) return;
		else if (start_pos == end_pos)//Final state already reached
		{ 
			return ;
		}
		int aux = getRemaining(start_pos, end_pos); //To get the other index
		
		//Recursive algorithm
		if (num_disks == 1)
		{
			System.out.println(start_pos + "	" + end_pos);
			return;
		}
		else
		{
			toh_with_recursion(num_disks-1, start_pos, aux);
			System.out.println(start_pos + "	" + end_pos);
			toh_with_recursion(num_disks-1, aux, end_pos);
		}
	}
	
	public static void toh_without_recursion(int num_disks, int start_pos, int end_pos)
	{
		if (start_pos == end_pos) return; //Output  already reached
		if (num_disks==0) return;
		MyStack<Tuple> stack = new MyStack<Tuple>(); //Initialization of stack to simulate recursion
		Tuple tuple = new Tuple(num_disks,start_pos,end_pos); //Object of the stack which stores the data for recursion
		stack.push(tuple);
		int flip = 1; // a binary variable used to decide which branch to enter in the while loop
		int auxillary; // variable for the remaining peg
		while (!stack.empty())
		{
			Tuple tuple1 = new Tuple();
			tuple1 = stack.peek();
			if (tuple1.num_disks == 1) // terminating condition for functions
			{
				System.out.println(tuple1.start_pos + "	" + tuple1.end_pos);
				flip = 2; // Can only go to second branch after this
				stack.pop();
				continue;
			}
			else
			{
				auxillary = getRemaining(tuple1.start_pos,tuple1.end_pos);
				if (flip==1)
				{
					stack.push(new Tuple(tuple1.num_disks-1, tuple1.start_pos, auxillary));
					continue;
				}
				else if (flip == 2)
				{
					if (stack.peek().done) { stack.pop();}
					else
					{
						System.out.println(tuple1.start_pos + "	" + tuple1.end_pos);
						stack.peek().done = true; // to indicate that if control comes here again this function is over
						stack.push(new Tuple(tuple1.num_disks-1, auxillary, tuple1.end_pos));
						flip = 1; // Can only terminate or go to first branch after this
						continue;
					}
				}
			}
		}
	}
	
	//Returns the remaining index out of (1,2,3)
	public static int getRemaining(int start_pos, int end_pos)
	{
		int aux;
		if (start_pos==1)
		{
			if (end_pos==2)
			{
				aux = 3;
			}
			else
			{
				aux = 2;
			}
		}
		else if (start_pos==2)
		{
			if (end_pos==1)
			{
				aux = 3;
			}
			else
			{
				aux = 1;
			}
		}
		else
		{
			if (end_pos == 1) aux = 2;
			else aux = 1;
		}
		return aux;
	}	
}	

