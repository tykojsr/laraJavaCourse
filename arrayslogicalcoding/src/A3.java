class A3 
{
	public static void main(String[] args) 
	{
		int[] array = {1, 4, 2, 6, 9, 2, 3, 7, 8, 5};
		          //   0  1  2  3  4  5  6  7  8  9
		System.out.println(array[7]);
		System.out.println(array[8]);
		System.out.println(array[9]);
		//or
		System.out.println(array[array.length - 3]);  // last elements in array= array.length - 1
		System.out.println(array[array.length - 2]);
		System.out.println(array[array.length - 1]);

	}
}
