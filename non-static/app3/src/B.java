class B 
{
	B()
	{
		System.out.println("from B()");
	}
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("--------");
		B b2 = new B();
		System.out.println("--------");
	}
}

//  IIB BLOCK-it can be developed outside of any method and inside a class
//  befrore the execution of constructor IIB block will be executing from top to bottom only once for one object
//  IIB blocks are non static
//  we can create any no of IIB blocks
//  if we r creating IIB blocks inside of any other block that will not be consudered as an IIB block, it will be just a normal block
//  need of IIB block: if any common implementation is there for all the objects then we can keep that in IIB block
//  