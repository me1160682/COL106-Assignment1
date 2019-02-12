public class Tuple
{
	//Instance fields
	public int num_disks;
	public int start_pos;
	public int end_pos;
	public boolean done;
	
	//Constructors
	public Tuple(int a, int b, int c)
	{
		num_disks = a;
		start_pos = b;
		end_pos = c;
		done = false;
	}
	public Tuple(){}
}
