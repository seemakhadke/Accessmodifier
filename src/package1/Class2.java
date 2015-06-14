package package1;

public class Class2 {

	public static void main(String[] args) {
		Class1.test_pub();   // public methods can be access outside the class
	//	Class1.pri();        private method can't accessible outside the class
		Class1.test_prot();  // protected methods can be access outside the class
		Class1.test_nomodifier(); //No methods can be access outside the class
		
		System.out.println("Value of i is : " +Class1.i);
	//	System.out.println("Value of str is : " +Class1.str);  private variable can't be access outside the class
		System.out.println("Value of d is : " +Class1.d);
		System.out.println("Value of c is : " +Class1.a);
	}

}
