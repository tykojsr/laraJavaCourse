class R 
{
	int i;
	static void test(R obj)
	{
		obj.i = 20;
	}
	public static void main(String[] args) 
	{
		R r1 = new R();
		r1.i = 10;
		System.out.println("A: " + r1.i);
		// pass by reference/call by reference
		// changes in the destination reflecting to the source
		test(r1);
		System.out.println("B: " + r1.i);
	}
}
// changes in test method is reflecting back to main method