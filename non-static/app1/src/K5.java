class K5
{
	// int j;  this member will be loaded each and every time whenever we r creating object of K5 class, different copy of same j will be loaded to the memory with the default value 0
	static int i;

	static K5 k5 = new K5();
	static
	{
         System.out.println("SIB begin: "+ i); 
	     K5.i = 50;
		 System.out.println("SIB end: "+ i);
	}

    public static void main(String[] args)
	{
		System.out.println("main: "+ i);  
	}
}