import java.util.Arrays;
class A53
{
	public static void main(String[] args) 
	{
		int [] array = { 10, 5, 13, 16, 4, 7, 20, 18};
		System.out.println("initial:" + Arrays.toString(array));
		for (int i = 0; i < array.length -1 ; i += 2 )
			{
				 int temp = array[i];
				array[i] = array[i +1];
				array[i + 1] = temp;
			}
		System.out.println("after swap" + Arrays.toString(array));
	} 
		
	
		
	
}
