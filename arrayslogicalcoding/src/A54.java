import java.util.Arrays;
class A54
{
	public static void main(String[] args) 
	{
		int [] array = { 10, 5, 13, 16, 4, 7, 20, 18};
		             //   0  1   2   3  4  5   6   7
		System.out.println("initial:" + Arrays.toString(array));
		for (int i = 0; i < array.length/2 ; i++)
			{
			  int temp = array[i];
			  array[i] = array[array.length -1-i];
			  array[array.length-1-i] = temp;
				
			}
		System.out.println("after reverse" + Arrays.toString(array));
	} 
		
	
		
	
}
