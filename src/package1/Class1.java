package package1;

public class Class1 {

	public static int i=10;
	private static String str="Hello";
	protected static double d=20.5;
	static char a='s';
	
	public static void test_pub()
	{
		System.out.println("tetst_pub method is executed");
		System.out.println("value of i is : " +i);
		System.out.println("value of str is : " +str);
		System.out.println("value of d is : " +d);
		System.out.println("value of c is : " +a);
		
	}
	
	private static void test_pri()
	{
		System.out.println("tetst_pri method is executed");
	}	
	
	protected static void test_prot()
	{
		System.out.println("tetst_prot method is executed");
	}	
	
	static void test_nomodifier()
	{
		System.out.println("tetst_nomodifier method is executed");
	}
	
	//change
	
	public static void main(String[] args) {
		
		test_pub();
		test_pri();
		test_prot();
		test_nomodifier();
		
		

	}

}
