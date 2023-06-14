class F2
{
	int i;
	F2(int k)
	{
		i = 10;                                    // this i is local to constructor block
        System.out.println("F(int)");              // supply an argument and check for the value of i
	}
	public static void main(String[] args) 
	{
		F2 f1 = new F2(90);
		System.out.println(f1.i);
	}
}