class C 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for( int i = 1; i <= 5; i++)
		{
		System.out.println("loop body:" + i);
		System.out.println("loop body:" + i);
		int j = 20;
		j++;
		j += 21;
		System.out.println("-----------" + j);
		}
		System.out.println("main end");
	}
}
