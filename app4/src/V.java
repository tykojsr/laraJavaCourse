class V 
{
	public static void main(String[] args) 
	{
		int i =0;
		System.out.println(true || (i++ ==0));
		//                           not required. since ist one is true 2nd is nt executing.so i has to be zero
		System.out.println(i);

		int j = 0;
		System.out.println(false || (j++ == 0);
		System.out.println(j);


	}
}
