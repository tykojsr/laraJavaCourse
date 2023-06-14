class A
{// string[] args = {};
	//              object(empty array)    empty is different from null

	// whichever is present in lang package ,we do not need to import it like system, string
	// even jvm will not be able to directly call main method, it has to supply an argument, an empty string array( {} , this is empty string array)
	public static void main(String[] args) 
	{
		System.out.println("Hello World!" + args);
	}
}
