//each and every class will be extending object class either directly or indirectly
//if class(k) is not extending any other class then that class is direct sub class of object class
//if the class(L) is already extending another class then that class is the indirect sub class of object class
//whether we keep it or not compiler only keeps the extends for all the classes
class K 
{
	K()
	{
		//if u dont keep any explicit super or this calling statement in the constructor body as a first statement , then compiler only keeps the super with no argument calling statement
		// we can remove this super(); statement and still output will be same
		super();
		System.out.println("from k()");
	}
}
class L extends K
{
	L()
	{
		super();
		System.out.println("from L()");
	}

	public static void main(String[] args) 
	{
		L obj = new L();
	}
}
