import java.util.Scanner;
class D 
{
	public static void main(String[] args) 
	{
		float f1 = 20.0f;
		System.out.println("please enter one double value: ");
		Scanner sc = new Scanner(System.in);
		double value = sc.nextdouble();          // return type is doubletype
		System.out.println("double value is: " + value);

	}
}
// byte < short < int < long < float < double