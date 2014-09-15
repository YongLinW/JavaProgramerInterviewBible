package cn.secondEdition.sixOne.one;

public class Test {

	public static void main(String[] args) {
		boolean test = true;
		System.out.println("Before test(boolean) : test = " + test);
		test(test);
		System.out.println("After test(boolean) : test = " + test);
		
		System.out.println("........................");
		
		StringBuffer string = new StringBuffer("Hello");
		test(string);
		System.out.println(string);
		
		System.out.println(".........................");
		
		String str = "Hello";
		test(str);
		System.out.println(str);
	}
	
	public static void test(boolean test){
		test = !test;
		System.out.println("In test(boolean) : test = " + test);
	}

	public static void test(StringBuffer str){
		str.append(", world!");
	}
	
	public static void test(String str){
		str = "world";
	}
	
}
