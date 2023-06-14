class N13a 
{
	public static void main(String[] args) 
	{
		int i = 24576434;
		int count = 0;
		while ( i != 0)
		{
			if (i % 2 == 0)
			{
				count++;
			}
			i = i / 10;
		}
		System.out.println(count++);
	}
}
