class A 
{
	static int p;

	A()
	{
		p += 10;    // we are using static variable p directly into non static body, it is possible
	}
	{
		p +=20;
	}
	void test1()
	{
		p += 30;
	}
	static void test2()
	{
		p += 40;
	}
	public static void main(String[] args) 
	{
		System.out.println("a:" + p);
		A a1 = new A();
		System.out.println("b:" + p);
		a1.test1();
		System.out.println("c:" + p);
		test2();
		System.out.println("d:" + p);
	}
}

/*
1.  static members can be used straight away in the static and non static

*/