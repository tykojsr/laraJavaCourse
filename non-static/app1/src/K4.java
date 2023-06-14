class K4
{
	static int i;
	static
	{
	    K4 k4 = new K4(); 
		System.out.println("static: "+ k4.i);  
	}
}
	/*
	static i is already loaded with the class.

	each and every static member (static variable and static method) will be shared by all the objects of that class.

	static int i will not be loaded while creating the object to K4 class, bcz it is already loaded while K4 class was loading.
	K4 object is just using the already loaded static int i. even the future objects of all K4 class will be using the 
	same copy of static int i.


	*/
