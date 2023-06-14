class K5a
{
	static int i;

	K5a k5a = new K5a();
	static
	{
	K5a.i = 50;
	}

    public static void main(String[] args)
	{
		System.out.println("main: "+ i);  
	}
}