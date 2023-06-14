class N13 
{
	public static void main(String[] args) 
	{
		int i, j = 0;
		for (i = 34753134; i != 0 ; i /= 10)
		{
			if( i % 2 == 0)
			{
				j++;
			}

		}
		System.out.println("total no of even digits is " + j);
	}
}
