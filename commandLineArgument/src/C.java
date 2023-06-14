class C 
{
	public static void main(String[] args) 
	{

		System.out.println("total arguments: " + args.length);
		for (string arg : args)
		{
			System.out.println(arg);
		}
	}
}
// jvm will be calling the main method by supplying empty string array object, if you dont supply anything as a command line argument while executing any class.
// if you directly print the array reference(args) you will be getting the memory address of the string array object
// each and every array will be having a length.we can find out array length by using ' length' property( by calling length property on the array reference ).
// arrays are also objects in java.
// array index will be starting from 0 but length we will calculate from no 1.
// if there are no elements present in the array then we can say that array is empty or size of length is zero
// arrays are also object in java
// args will be pointing towards string array object
// by default whaever u r supplying as a command line argument that will be considered as string type only.
// 
// 