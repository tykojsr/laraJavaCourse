class K3
{
	int i;
	static
	{
		
		System.out.println("static: "+ k3.i);  // til  now object is nt created as static are executed from top to bottom.
	}
	static K3 k3 = new K3();     // this will run if we put this line in main method
}