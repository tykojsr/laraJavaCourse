class  Y
{
	public static void main(String[] args) 
	{
		System.out.println("main began");
		int i;
		for(i = 1 ,System.out.println("init");
		test(i);
		System.out.println("before change:" + i), i++, System.out.println("after change:" + i));
		{
			System.out.println("loop body" + i + "," + i);
		}
	}
	static boolean test(int i)
	{
		boolean flag = (i <= 5);
		System.out.println("boolean status for" + i + "is" + flag);
		return flag;
	}
}
