class O 
{
	int i;
	public static void main(String[] args) 
	{
		O o1 = new O();
	    O o2 = o1;  // o1 = o2   also possible   // O o2 = null
		System.out.println(o1.i);
		System.out.println(o2.i);
		o1.i = 10;
		System.out.println(o2.i);
		o2.i = 20;
		System.out.println(o1.i);
	}
}
// one object can have any no of references.
// one object can be pointed by any no of references.
// changes in one reference reflecting to all the reference that are pointing to that object
// a reference can point to only one object at a time
// we can supply an object or null or another reference variable to any reference variable
// object O o1 = new O() , O o2 = null , O o2 = o1