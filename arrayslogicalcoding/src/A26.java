class A26
{
	public static void main(String[] args) 
	{
		int[] array = {1, 5, 2, 6, 9, 1, 0, 3, 4, 5};    
		          //   0  1  2  3  4  5  6  7  8  9
		  int min = Integer.MAX_VALUE;
		  for(int i = array.length/2 ; i < array.length; i++)
	        {
		        if(array[i] < min)
				{
					min = array[i];
				}
            }
			System.out.println("min" + min);
	}
}
