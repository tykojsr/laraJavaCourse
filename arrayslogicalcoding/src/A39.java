class  A39
{
	public static void main(String[] args) 
	{
		int[] array = {1, 5, 6, 9, 7, 5, 3, 4, 5, 8 };
		for (int i = 1; i < array.length -1 ; i++ )
		{
			if ( array[i -1] % 2 == 0 && array[i +1] % 2 ==0)
			{
                System.out.println(array[i]);
			}
		}
		
	}
}
/*
for (int i = 0; i < array.length - 2 ; i++ )
if ( array[i] % 2 == 0 && array[i + 2] % 2 ==0)
			{
                System.out.println(array[i + 1]);
			}
			*/