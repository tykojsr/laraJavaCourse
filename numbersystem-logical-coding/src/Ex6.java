

/*

read 445 from 344523

*/
class Ex6 
{
	public static void main(String[] args) 
	{
			int i = 344523;
		int j = i;
		i = i % 100000;                  // in place of i, j can also be used n that also looks correct
		i = i/100;
		System.out.println(i);
		
	}
}
