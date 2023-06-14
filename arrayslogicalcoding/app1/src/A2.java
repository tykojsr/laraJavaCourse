import java.util.*;
class A2
{
		public static void main(String[] args) 
	{
         byte[] a = new byte[5];
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Input first byte number : " );
		 a[1] = sc.nextByte();
		 System.out.print("Input second byte number : " );
		 a[2] = sc.nextByte();
		 System.out.println("final:" + Arrays.toString(a));
		 System.out.print("sum of both numbers : " );
		 System.out.println(a[1] + a[2]);
		
	}
}