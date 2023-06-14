import java.util.Arrays;
class A61
{
	public static void main(String[] args) 
	{
		int [] array = { 10, 5, 13, 16, 4, 7, 20, 18};
		             //   0  1   2   3  4  5   6   7
		System.out.println("initial:" + Arrays.toString(array));
		for (int i = array.length - 1; i > 0 ; i--)
			{
		
			  array[i] = array[i - 1];
				
			}
		System.out.println("final" + Arrays.toString(array));
	} 
		
	
		
	
}
