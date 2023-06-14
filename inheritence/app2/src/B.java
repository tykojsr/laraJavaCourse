class A
{  
	int i ;
	void test1()
	{
		System.out.println("A-test1");
	}
}
class C
{
	A obj;
	void test2()
	{
		System.out.println("C-test2");
		System.out.println(i);
		test1();                          // we cannot use obj to call test1() because no object is created    // can we call it by using A.test1()?  find out
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
	    c1.test2();
	}

}