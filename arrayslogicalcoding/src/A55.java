import java.util.Arrays;
class A55
{
	public static void main(String[] args) 
	{
		int [] array = { 10, 5, 13, 16, 4, 7, 20, 18};
		             //   0  1   2   3  4  5   6   7
		System.out.println("initial:" + Arrays.toString(array));
		for (int i = 0; i < array.length ; i++)
			{
			  int temp = array[i];   // this line is not required .. plzzz check
			  array[i] = i ;         // we can directly store index no in thr array
				
			}
		System.out.println("final" + Arrays.toString(array));
	} 
		
	
		
	
}
