class K2
{
	int i;
	static K2 k2 = new K2();
	static
	{
		
		System.out.println(k2.i);
	}
	public static void main(String[] asgs)
	{
        System.out.println("main: " + k2.i);
	}
}


/*
if we make line 4 as non static. it will be compilation error because when SIB WILL be executed it will nt be able to find k2.
no object creation took place so we cannot use non static members 
*/