import java.util.Arrays;
class A59
{
	public static void main(String[] args) 
	{
		int [] array = { 10, 5, 13, 16, 4, 7, 20, 18};
		             //   0  1   2   3  4  5   6   7
		System.out.println("initial:" + Arrays.toString(array));
		 int temp = array[0];
		for (int i = 0; i < array.length - 1; i++)
			{
		
			  array[i] = array[i + 1];
				
			}
			array[array.length - 1] = temp;
		System.out.println("final" + Arrays.toString(array));
	} 
		
	
		
	
}
