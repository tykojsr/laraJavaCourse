import java.util.Scanner;
class H
{
	public static void main(String[] args) 
	{
		System.out.println("please enter three int  values: ");
		Scanner sc = new Scanner(System.in);
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		int value3 = sc.nextInt();         
		System.out.println("addition of three int value is:" + value1 + value2 + value3);

	}
}
// byte < short < int < long < float < double