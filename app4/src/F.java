class F
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++  +   i    +   i++   +   i  +   i++   +   i;
		//       0       1         1        2       2        3
		System.out.println(i);  //3
		System.out.println(j);  //9
		System.out.println("--------");
		int m = 0;
		int n = ++m   +   m  +   m++   +   m   +   ++m   +   m   +   m++    +   m;
		 //       1       1        1       2         3       3        3          4
		System.out.println(m);
		System.out.println(n);
		System.out.println("---------");

	}
}
