import java.util.Arrays;
class A60
{
	public static void main(String[] args) 
	{
		int [] array = { 10, 5, 13, 16, 4, 7, 20, 18};
		             //   0  1   2   3  4  5   6   7
		System.out.println("initial:" + Arrays.toString(array));
		 int temp = array[0];
		 int temp1 = array[1];
		for (int i = 0; i < array.length - 2; i++)
			{
		
			  array[i] = array[i + 2];
				
			}
			array[array.length - 1] = temp1;
			array[array.length - 2] = temp;
		System.out.println("final" + Arrays.toString(array));
	} 
		
	
		
	
}
