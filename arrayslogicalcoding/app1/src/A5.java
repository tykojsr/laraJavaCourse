import java.util.Arrays;
class A5
{
		public static void main(String[] args) 
	{
         int [] a = new int[10];
		 a[9] = 200;
		 a[8] = 34;

		 System.out.println("element:" + a[a.length-1] + "," + a[a.length -2]);
		
	}
}
/*
mid value = (low + high) divided by 2
if its decimal value then ignore the decimal part
*/