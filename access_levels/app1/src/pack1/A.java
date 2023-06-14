package pack1;
class  A 
{
	private int i;
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.i);
	}
}
/*
// we have 4 access specifiers
//private || default || protected || public
// the narrowest is private
// the widest is public
// we have access specifiers for security purposes
// we can have control over the data, which one should be shared and which one should not be over package structure
// access specifiers == access modifiers
// access specifiers in java maintains the accessibility or scope of a field, method, constructor or class.
// default access specifier is also knowm as package or friendly
    default == package == friendly
// private members can be accessed within the class
// the scope of private member is within the declared class only.
// private members cannot be accessed outside of the class.
*/