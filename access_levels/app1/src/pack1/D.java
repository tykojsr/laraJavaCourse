package pack1;
class D
{
	 public private void test()
	{
        System.out.println("from test()");
	}
}

class E
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test();
		System.out.println("done");
	}
}
// compilation error
// in one java file any no of classes anywhere 
// for all classes a .class will be generated(after successful compilation of .java file). eg D.class , E.class
