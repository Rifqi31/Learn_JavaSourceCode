public class Data_types {
	public static void main(String[] args) {
		// introduce java data type
		/*
		The byte data type can store whole numbers from -128 to 127. 
		This can be used instead of int or other integer types to save memory 
		when you are certain that the value will be within -128 and 127:
		*/
		byte little_num = 100;
		System.out.println(little_num);

		/*
		The short data type can store whole numbers from -32768 to 32767:
		*/
		short little_num2 = 2000;
		System.out.println(little_num2);

		/*
		The int data type can store whole numbers from -2147483648 to 2147483647. 
		In general, and in our tutorial, the int data type is the preferred data type 
		when we create variables with a numeric value.
		*/
		int medium_num = 100000;
		System.out.println(medium_num);

		/*
		The long data type can store whole numbers from -9223372036854775808 
		to 9223372036854775808. This is used when int is not large enough 
		to store the value. Note that you should end the value with an "L":
		*/
		long myNum = 15000000000L;
		System.out.println(myNum);

		/*
		The float data type can store fractional numbers from 3.4e−038 to 3.4e+038.
		Note that you should end the value with an "f":
		*/
		float myNum2 = 5.75f;
		System.out.println(myNum2);

		/*
		The double data type can store fractional numbers from 1.7e−308 to 1.7e+038. 
		Note that you should end the value with a "d":
		*/
		double myNum3 = 19.99d;
		System.out.println(myNum3);

		// scientify
		float f1 = 35e3f;
		double d1 = 12E4d;
		System.out.println(f1);
		System.out.println(d1);

		// boolean
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);     // Outputs true
		System.out.println(isFishTasty);   // Outputs false

		// char
		char myGrade = 'B';
		System.out.println(myGrade);

		// string
		String greeting = "Hello World";
		System.out.println(greeting);


	}
}