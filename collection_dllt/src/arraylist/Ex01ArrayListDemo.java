package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex01ArrayListDemo {
	
	public static void main(String[] args) {
		//1. Khai báo List
		List<Integer> list = new ArrayList<Integer>();
		//2. Khai báo với sl phần tử ban đầu
		List<Integer> list2 = new ArrayList<Integer>(5);
		//3. Khởi tạo với các pt ban đầu
		List<Integer> list3 = 
				new ArrayList<Integer>(List.of(1,2,3,4,5,6));
		
		// xuất
		System.out.println("lis1 --> " + list.toString());
		System.out.println("lis2 --> " + list2.toString());
		System.out.println("lis3 --> " + list3.toString());
		
		// add phần tử
		List<Integer> list4 = new ArrayList<Integer>(list3);
		// add pt
		list4.add(7);
		list4.add(8);
		list4.add(10);
		list4.add(8, 9);
		System.out.println("list4 --> " + list4);
		
		// Trả về số phần tử của list
		System.out.println("list4 size: " + list4.size());
		
		// trả về giá trị tại index
		System.out.println("giá trị tại index 4 = " + list4.get(4));
		
		// xóa phần tử tại index
		list4.remove(2);
		System.out.println("list4 sau khi xóa giá trị tại index2 --> " + list4);
		
		// xóa phần tử được chỉ định
		List<Integer> lis5 = new ArrayList<Integer>(List.of(3,3,3,5,6,7));
		lis5.remove(Integer.valueOf(3));
		System.out.println("lis5 sau khi xóa 3 --> " + lis5);
		
		// set element tại index
		List<Integer> lis6 = new ArrayList<Integer>(List.of(1,2,3,4,5,6));
		lis6.set(2, 99);
		System.out.println("lis6 sau khi set 99 tại index 2 --> " + lis6);
		
		// Kiểm tra Collection có phần tử nào đó hay ko
		List<Integer> lis7 = new ArrayList<Integer>(List.of(1,2,3,4,5,6));
		System.out.println("Có 4 hay ko --> " + lis7.contains(4));
		
		// Sắp xếp tăng dần
		List<Integer> lis8 = new ArrayList<Integer>(List.of(6,5,4,3,2,1));
		Collections.sort(lis8, (n1,n2) -> Integer.compare(n1, n2));
		System.out.println("lis8 sau khi sắp xếp --> " + lis8);
		
		// Tìm vị trí đầu tiên xuất hiện
		List<Integer> lis9 = new ArrayList<Integer>(List.of(6,5,4,3,2,1));
		System.out.println("vị trí của 9 là: " + lis9.indexOf(9));
	}
	
}
