class A
{
	A()
	{ 
		System.out.println("A(int)");
	}
	{ 
		System.out.println("A-IIB");
	}
}
class V 
{
    public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("--------");
		A a2 = new A();
	}
}
// object can be created anywhere(even outside method but for that object creation statement should be static) ,in
//any class but that class and the class for which we r creating object 
// should lie in the same directory or package
// we can even create object inside constructor(N1.java)