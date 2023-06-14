class  A43
{
	public static void main(String[] args) 
	{
		int[] array = {1, 5, 6, 9, 7, 5, 3, 4, 5, 8 };
		for (int i = 1; i <= array.length -1 ; i++ )
		{
			if (array[i] % 2 != 0 && array[i -1] % 2 != 0 )
			{
                System.out.print(array[i] + ",");
                System.out.println(array[i - 1]);
			}
		}
		
	}
}
// if in place of i -1 we use i +1 then our order of answer will interchange
// like 5, 1 to 1, 5