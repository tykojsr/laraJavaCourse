class A
{  
	int i ;
	void test1()
	{
		System.out.println("A-test1");
	}
}
class D
{
	A obj;           // D has a reference of A but its null                         // this type of variable is having default value as null       
	void test2()
	{
		System.out.println("D-test2");
		System.out.println(obj.i);
		obj.test1();
	}
		
	public static void main(String[] args) 
	{
		D d1 = new D();
	    d1.test2();
	}

}
// this variable obj is not pointing to any object.
// we cannot be able to call anything on the null reference. if we call we get NullPointerReference