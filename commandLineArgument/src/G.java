class G 
{
	public static void main(String[] args) 
	{
		String s1 = args[0];
		int i = Integer.parseInt(s1);
		int j = i * i
		System.out.println("square of" + i + "is" + j);
	}
}
// why main method argument is string type.. because from string u can convert it to any datatype
// but such facility is not available for other datatype
// for eg we cannot convert char to string