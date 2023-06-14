class E 
{
	static int i;
}
class F extends E
{
	static int j;
	public static void main(String[] args) 
	{
		System.out.println(E.i);
		System.out.println(F.j);
	}
}
// we can also use reference variables for calling static members.. no issues

//static variables are also inheriting to the sub class from the superclass.
//by using subclass reference only we can access static members of sub-class.no need of creating object.
//even by creating object to subclass also we can access ststic variables.