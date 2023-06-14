class N 
{
	N()
	{
		System.out.println("N()");
	}
	N(int i)
	{
		this();
		System.out.println("N(int)");
	}
	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("-----------");
		N n2 = new N(10);
		System.out.println("-----------");
	}
}
// in every constructor body the first statement would be super() calling statement. (if thr programmer didn't keep super or this calling statement explicitely
// each and every class is a subclass to object class(whether directly or indirectly)
// object class is the supermost class in java
// some of the commonly required members are inherited to the sub classes from the object class
// super calling statement is calling the object class no argument constructor
// in the object class we have one constructor which is no argument constructor, and we don't have any statements inside the constructor
// super statement will  be  always calling the super class constructor
// super and this statement comes under non-static 
// this calling statement always calls the current class constructor not the superclass constructor
// if we only kept super(), or super with any argument then compiler will not be keeping super()
// in the constructor body only either this or super calling statement not both