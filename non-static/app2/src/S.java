class S
{
	S()
	{
		System.out.println("S()");
	}
	S(int i)
	{
		S();                                // error because this is method calling not constructor calling. this is how a methos is called
		System.out.println("S(int)");                         
	}
	public static void main(String[] args) 
	{
		S s1 = new S();
		System.out.println("--------");
		S s2 = new S(10);
		System.out.println("--------");
	}
}
