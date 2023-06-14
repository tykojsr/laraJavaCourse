import java.util.Scanner;
class F
{
	public static void main(String[] args) 
	{
		System.out.println("please enter one short value: ");
		Scanner sc = new Scanner(System.in);
		short value = sc.nextShort();         
		System.out.println("short value is: " + value);

	}
}
// byte < short < int < long < float < double