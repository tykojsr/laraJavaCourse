class  A46
{
	public static void main(String[] args) 
	{
		int[] array = {1, 5, 6, 9, 7, -5, 3, 4, -1, 8 };
		for (int i = 0; i <= array.length -1 ; i++ )
		{
			for (int j = i + 1;j <= array.length -1 ;j++ )
			{ 
				for (int k = i + 2;k <= array.length - 1 ; )
				{
					if (array[i] + array[j] + array[k] == 0)
					{
                    System.out.println(array[i] + "" + array[j] + "," + array[k]);
				    }
				}
			
			}
			
		}
		
	}
}
	