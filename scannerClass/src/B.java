import java.util.Scanner;
class B 
{
	public static void main(String[] args) 
	{
		System.out.println("please enter your complete name ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();    //  if u want to read everything in that line
		System.out.println("welcome " + name);

	}
}