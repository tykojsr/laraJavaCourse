class A
{
	static
	{
		System.out.println("A-SIB");
	}
}

class B extends A
{
	static
	{
		System.out.println("B-SIB");
	}
}
class C extends B
{
	static
	{
		System.out.println("C-SIB");
	}
}
class Z4
{
	static
	{
		System.out.println("Z4-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B b1 = new B();
		System.out.println("-----------");
		C c1 = new C();
		System.out.println("-----------");
		A a1 = new A();
		System.out.println("main end");
	}
}
[1:12 PM, 6/8/2023] +91 88677 39948: class A
{
	static
	{
		System.out.println("A-SIB");
	}
}

class B extends A
{
	static
	{
		System.out.println("B-SIB");
	}
}
class C extends B
{
	static
	{
		System.out.println("C-SIB");
	}
}
class Z5
{
	static
	{
		System.out.println("Z5-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		C c1 = new C();
		System.out.println("-----------");
		B b1 = new B();
		System.out.println("-----------");
		A a1 = new A();
		System.out.println("main end");
	}
}