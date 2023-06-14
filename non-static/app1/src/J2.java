class J 
{
	void test1()
	{
		System.out.println("from test1");
	}
	static void test2()
	{
	    obj.test1();
		J obj = new J();
		System.out.println("from test2");
	}
}
// non static test1 is loading while creating object to j class in the test2 static method