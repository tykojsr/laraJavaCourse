class F
{
	int i;       //in order to use this i in main method we can use reference variable
	F(int i)
	{
		i = 10;                     // in order to use this i in main method we use keyword this               // this i is local to constructor block
        System.out.println("F(int)");              // supply an argument and check for the value of i
	}
	public static void main(String[] args) 
	{
		F f1 = new F(10);
		System.out.println(f1.i);
	}
}