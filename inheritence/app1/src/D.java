class G 
{
	static void test1()
	{
		System.out.println("G-from test1");
	}
}
class H extends G
{
	static void test2()
	{
		System.out.println("H-fron test2");
	}

	public static void main(String[] args) 
	{
	    H.test1();  // we can also use G.test1()
		H.test2();	// we cannot also use G.test1() for calling this
	}
}
// static methods also  will be inheriting to sub class 