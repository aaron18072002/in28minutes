package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex02EnterNElements {

	public static void main(String[] args) {
		List<Integer> numbers = enterNumOfElements(100);
		System.out.println("Mảng 100 số --> " + numbers);
		List<Integer> squaredNumbers = numbers.stream()
				.map(num -> num*num).collect(Collectors.toList());
		System.out.println("Mảng sau khi bình phương --> " + squaredNumbers);
		System.out.println("Mảng 100 số --> " + numbers);
		long countEven = IntStream.range(0, 101)
				.filter(num -> num%2==0).boxed().count();
		System.out.println("Số phần tử chẵn là --> " + countEven);
	}
	
	private static List<Integer> enterNumOfElements(int n) {
		Random rd = new Random();
		List<Integer> numbers = new ArrayList<Integer>(n);
		for(int i = 0; i < n; i++) {
			numbers.add(rd.nextInt(1,101));
		}
		return numbers;
	}
	
}
