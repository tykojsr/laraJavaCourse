class W
{
	static
	{
		System.out.println("sib");
	}
	W()
	{
		System.out.println("W()");
	}
	
	public static void main(String[] args) 
	{
		W w1 = new W();
		System.out.println("--------");
		W w2 = new W();
		System.out.println("--------");
	}
}
// static block executes only once while class is loading
// constructor executes every time when object is created