package exception_handling;

public class ExceptionHandleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		System.out.println("End of main thread");
	}
	
	private static void method1() {
		method2();
	}
	
	private static void method2() {
		String str = null;
		str.length();
	}
}
