class B 
{
	static int p = 10;
	public static void main(String[] args) 
	{
		System.out.println("a: " + p);
		System.out.println("b: " + B.p);
		B obj = new B();
		// compiler replacing from reference variable to class name( it means during compilation compiler will change obj.p to B.p i.e, change reference variable name to class name and by this we mean that whenever 
		// compiler wants to read static member it will just change the reference variable with the class name and get the static member
		// can use reference of same class type
		System.out.println("c: " + obj.p);
	}
}
// all the static members of a class will be shared by each and every object of that class
// by using any reference of any object we can access any static member.
// by using any reference of any object we can able to access or modify the static member
// only the original static member will be getting modified because ststic members gets loaded only once not again n again