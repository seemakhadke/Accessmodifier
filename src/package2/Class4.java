package package2;

import package1.Class1;

public class Class4 {

	public static void main(String[] args) {
		 Class1.test_pub(); // can access public methods outside the package
	//	 Class1.test_pri();	can not access private method outside the package
	//	 Class1.test_pro()  can not access private method outside the package
//		 Class1.test_nomodifier()  can not access nomodifier method outside the package	 
	}

}
