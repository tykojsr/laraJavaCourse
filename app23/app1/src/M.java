class M
{
	static int m;
	public static void main(String[] args) 
	{
		boolean m = true;
		System.out.println(L.m);
	}
}
// if there r local and global variable with the same name then local is always given more importance
// but now in context with class name L we r getting static m value
// static members of a class can be accessed by using class reference as in above case static variable is accessed thrpugh class name L