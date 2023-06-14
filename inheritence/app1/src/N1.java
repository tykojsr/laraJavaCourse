class A
{
	A()
	{ 
		A a1 = new A();
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
		
		System.out.println("--------");
		
	}
}
// object can be created anywhere(even outside method but for that object creation statement should be static) ,in
//any class but that class and the class for which we r creating object 
// should lie in the same directory or package