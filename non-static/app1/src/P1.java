class P 
{
	int i;
	static void test()
	{
		P p1 = new P();
		p1.i = 10;
		System.out.println("test: ");
	}

	public static void main(String[] args) 
	{
		System.out.println("main: " + i);
		test(p1);
	}
}