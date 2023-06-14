import java.util.Scanner;
class E
{
	public static void main(String[] args) 
	{
		System.out.println("please enter one byte value: ");
		Scanner sc = new Scanner(System.in);
		byte value = sc.nextbyte();         
		System.out.println("Byte value is: " + value);

	}
}
// byte < short < int < long < float < double