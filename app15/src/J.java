class J 
{
	public static void main(String[] args) 
	{
		int m = 10 , n = 20 , o = 15;
		int min;
		if(m < n && m < o)
		{
			min = m;
		}
		else if(n < m && n < 0)
		{
			min = n;
		}
		else
			min = 0;
		System.out.println(" min among " + m + "," + n + "," + o + "is" + min);
	}
}
