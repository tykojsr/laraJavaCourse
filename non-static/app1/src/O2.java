class O2 
{
	public static void main(String[] args) 
	{
		O2 o1 = new O2();
		System.out.println(o1);
		o1 = new O2();
		System.out.println(o1);
	}
}
/*
abondaned objects r not having any references.

initially reference variable was pointing towards ist object  then a new object is created. afterwards we r assigning
that reference variable to that new object. so reference variable o1 connection with 1st object is terminated making that 
object a abandoned object

if none of the references are pointing to an object, that object is called as abanded object 
*/