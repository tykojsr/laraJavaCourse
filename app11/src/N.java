class N 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
		    System.out.println("if-body!");
		}
		else
		{
		    System.out.println("else begin");
			if(true)
			{
				System.out.println("else if body");
			}
			else
			{
				System.out.println("else else begin");
				if(true)
				{
				System.out.println("else else if body");
				}
				System.out.println("else else end");
			}
		     System.out.println("else end");
		}
		System.out.println("main end");
	}
}
