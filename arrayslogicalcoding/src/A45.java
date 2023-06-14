class  A45
{
	public static void main(String[] args) 
	{
		int[] array = {1, 5, 6, 9, 7, -5, 3, 4, -1, 8 };
		for (int i = 0; i <= array.length -1 ; i++ )
		{
			for (int j = i + 1;j <= array.length -1 ;j++ )
			{ 
				if (array[i] + array[j] == 0)
				{
                    System.out.println(array[i] + "" + array[j]);
				}
			}
			
		}
		
	}
}
