class Z 
{
     static
	{
		System.out.println("sib begin");
		Z obj = new Z();
		System.out.println("sib end");
	}
	Z()
	{
		System.out.println("Z()");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("---------");
		Z z1 = new Z();
		System.out.println("---------");
	}
}
