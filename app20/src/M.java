class M
{
	public static void main(String[] args) 
	{
		System.out.println("main began");
		int i = 1;
		while(i <=2)
		{
			System.out.println("loop began:" + i);
			for(int j = 101; j <= 103; j++)
			{
			System.out.println("inner loop begin: " + i + "," + j);
			System.out.println("inner loop end: " + i + "," + j);
			}
			System.out.println("loop end" + i);
			i++;
		}
		System.out.println("main end" + i);

	}
}
