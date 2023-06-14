class E
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++  +   i;
		//       0        1
		System.out.println(i);
		System.out.println(j);
		System.out.println("--------");
		int m = 0;
		int n = ++m   +   m;
		//        1       1
		System.out.println(m);
		System.out.println(n);
		System.out.println("---------");

	}
}
