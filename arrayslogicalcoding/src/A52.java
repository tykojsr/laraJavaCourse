import java.util.Arrays;
class A52
{
	public static void main(String[] args) 
	{
		int [] array = { 10, 5, 13, 16, 4, 7, 20, 18};
		System.out.println("initial:" + Arrays.toString(array));
		for (int i = 0; i < array.length ; i++ )
		{
			if (i >=2)
			{
				int temp = array[0];
				array[0] = array[array.length - 1];
				array[array.length - 1] = temp;
			}
			
		}
		System.out.println("after swap" + Arrays.toString(array));
	
		
	}
}
