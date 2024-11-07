package exception_handling;

import java.util.Scanner;

public class TryWithResourcesRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int num = sc.nextInt();
			System.out.println(num);
		} catch(Exception ex) {
			
		} finally {
			if(sc != null) {		
				sc.close();
			}
		}
	}
}
