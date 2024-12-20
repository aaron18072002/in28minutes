package exception_handling;

public class ExceptionHandleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		System.out.println("End of main thread");
	}
	
	private static void method1() {
		method2();
		System.out.println("Method1 ended");
	}
	
	private static void method2() {
		try {			
//			String str = null;
//			str.length();
			int[] numbers = new int[] {
					1,2,3
			};
			int fourthNum = numbers[4];
			System.out.println(fourthNum);
			
			System.out.println("Method2 ended");
		} catch (NullPointerException ex) {
			System.out.println("Matched NullPointerEx");
			ex.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Matched ArrayIndexOfBoundEx");
			ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Matched Exception");
			ex.printStackTrace();
		}
	}
}
