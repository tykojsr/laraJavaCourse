class C 
{
	public static void main(String[] args) 
	{

		System.out.println("total arguments: " + args.length);
		for (String elements : args)
		{
			System.out.println(elements);
		}
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		System.out.println(i);
		System.out.println(j);
	}
}
// string can have different datatype variables stored in it( means it can store int type char type etc) , and any no of variables as well. 