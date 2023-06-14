import java.util.Arrays;
class A51
{
	public static void main(String[] args) 
	{
		int [] array = { 5, 6, 9, 7, 4, 2, 8, 1, 7, 3};
		System.out.println("initial:" + Arrays.toString(array));
		for (int i = 0; i < array.length ; i++ )
		{
			if(array[i] % 2 == 0)
			{
				array[i] = array[i] * 20;
			}
			else 
			{
				array[i] = array[i] + 20;
			}
		}
		System.out.println("final:" + Arrays.toString(array));
	
		
	}
}
