class A36
{
	public static void main(String[] args) 
	{
		int[] array = {1, 5, 6, 9, 7, 5, 3, 4, 5, 8, 10, 17, 4, 9, 64, 35};    
		          //   0  1  2  3  4  5  6  7  8  9
		  boolean asc = true, desc = true;
		  System.out.print( array[0] + ",");
		  for(int i = 1 ; i < array.length; i++)
	        {
		        if(array[i - 1] < array[i])
				{
					System.out.println(array[i] + ",");
					asc = true;
					desc = false;
				}
				else if(desc)
				{
					System.out.println();
					System.out.println(array[i] + ",");
					desc = true;
					continue;
				}
				if(desc && array[i-1] > array[i])
				{
					System.out.println(array[i] + ",");
					asc = false;
					desc = true;
				}
				else if(!asc)
				{
					System.out.println();
					System.out.println(array[i] + ",");
					asc = true;
				}
					

            }
			
	}
}
