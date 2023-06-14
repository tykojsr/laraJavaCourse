class V
{
	static int i;

	public static void main(String[] args) 
	{
		System.out.println("main:" + i);
		System.out.println("main:" + U.i);
		test();
		U.test();
	}
		public static void test() 
	{
		System.out.println("test:" + i);

	}
	
}
class V
{
	public static void main(String[] args) 
	{
		System.out.println("main:" + U.i);
		U.test();
	}
}

// automatically compiler will give preference to local variable and if we want to access globlal variable we should always use class referece like for global variable we ous classname.variable name.
// similarly if we want tp use test method in another class then we have to mention like classname.method name....  U.test()