import java.util.Scanner;
class C 
{
	public static void main(String[] args) 
	{
		System.out.println("please enter one int value: ");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();    // the return type of nextInt() method will be primitive int value
		System.out.println("Integer value is: " + value);

	}
}