import java.util.Scanner;
class A 
{
	public static void main(String[] args) 
	{
		System.out.println("please enter your name ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();              // next is a method
		System.out.println("welcome " + name);

	}
}
// it is not available in java.lang so we have to import it
// out and in both r objects
// in scanner class there are so many methods
// first we need to create scanner class objects
// token i.e, 