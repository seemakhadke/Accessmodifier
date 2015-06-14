package package2;

import package1.Class1;

public class Class3 extends Class1 {

	public static void main(String[] args) {
		test_pub();  // can access public methods outside the package
	//	test_pri(); can not access private methods outside the class
		test_prot(); // can acees protected methods in the child class
	//	test_nomodifier();  cant access outside the package
		
		System.out.println("Value of i is : " + i); // can access public variables outside the package
	//	System.out.println("Value of str is : " + str);  can not access private variables outside the package
		System.out.println("Value of d is : " + d); // can access protected variables inside the child class
//		System.out.println("Value of c is : " + c);  can not access no modifier variables outside the package
	}

}
