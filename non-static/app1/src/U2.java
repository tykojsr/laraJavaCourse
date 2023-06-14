class  U2
{
	int i;
	static U2 test()
	{
		U2 u1 = new U2();
		System.out.println(u1.i);
		u1.i = 20;
		System.out.println(u1.i);
		return u1;
	}
	public static void main(String[] args) 
	{
		U2 obj = test();
		System.out.println(obj.i);
		obj.i = 40;
		System.out.println(obj.i);

		U2 vijay = test();
		System.out.println(vijay.i);
		vijay.i = 80;
		System.out.println(vijay.i);
	}
}
// compile it by using U2 but run it by using U