class K
{
	public static void main(String[] args) 
	{
		System.out.println("main began");
		int i = 1;
		while(i <=5)
		{
			System.out.println("loop began:" + i);
			if(i == 3)
			{
				i++;
				continue;
			}
			System.out.println("loop end:" + i);
			i++;
		}
		System.out.println("main end" + i);

	}
}
