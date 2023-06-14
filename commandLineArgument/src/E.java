class E 
{
	public static void main(String[] args) 
	{
		System.out.println("total arguments: " + args.length);
		System.out.println("-----------------------------");
		// its not converting from string to char
		// its just fetching values from a particulat string index
		// we cannot convert string to char
		String s1 = args[0];
		char c1 = s1.charAt(0);   //  also check with char c1 = args[0].charAt(0);
		System.out.println(c1);
	
	}
}
// a special method to convert string to char
// internally strings are also array of characters, and will be having indexes. index starts from 0