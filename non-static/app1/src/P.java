class P 
{
	int i;
	static void test(P obj)
	{
		System.out.println("test: " + obj.i);
	}

	public static void main(String[] args) 
	{
		P p1 = new P();
		System.out.println("main: " + p1.i);
		p1.i = 10;
		test(p1);
	}
}
// to which object p1 is pointing to the same object obj is also pointing. so two variables r pointing towards same class object 