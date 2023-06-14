class U
{
	static int i;

	public static void main(String[] args) 
	{
		System.out.println("main:" + i);
		test();
		U.test();
	}
		public static void test() 
	{
		System.out.println("test:" + i);

	}
	
}
