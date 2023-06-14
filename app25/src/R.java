class R
{
	public static void main(String[] args) 
	{
		String i = "1";
		switch(i)                                           
		{
			case "1":
				System.out.println("from case 1");
			    for (int i = 1; i <= 2 ; i++ )
			    {
					System.out.println("from case 1 loop" + i);
			    }
			    break;
			case "2":
			    System.out.println("from case 2");
			    break;
		}
	}
}
