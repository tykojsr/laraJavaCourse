class  I
{
	public static void main(String[] args) 
	{
		System.out.println("from main1 begin");
		test1();
		test2();
		System.out.println("from main1 eds");
	}
	public static void test1()
	{
		System.out.println("from test1 begin");
		test2();
		System.out.println("from test1 end");
	}
	public static void test2()
	{
		System.out.println("from test2");
	}
}
