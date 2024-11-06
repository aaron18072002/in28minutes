package exception_handling;

import java.util.Scanner;

public class FinalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner sc = null;
		try {
				sc = new Scanner(System.in);
			} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if(sc != null) {
				System.out.println("Before sc closed");
				sc.close();
			}
		}
	}

}
