import java.util.Arrays;
class A6
{
		public static void main(String[] args) 
	{
         int [] a = new int[11];
		 a[(a.length + 1)/2 - 1] = 37;

         System.out.println("final:" + Arrays.toString(a));
		 System.out.println("element:" +a[(a.length + 1)/2 - 1]);
		
	}
}