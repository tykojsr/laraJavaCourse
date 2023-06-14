class I
{
	I()
	{
        System.out.println("from I()");
	}
	{
		System.out.println("IIB1");
	}
    static
	{
		System.out.println("SIB");
	}
	
	public static void main(String[] args) 
	{
		I i1 = new I();
		System.out.println("--------");
		I i2 = new I();
		System.out.println("--------");
		I i3 = new I();
		System.out.println("--------");
	}
}
