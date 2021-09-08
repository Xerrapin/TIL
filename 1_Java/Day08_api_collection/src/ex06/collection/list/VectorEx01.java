package ex06.collection.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx01 {
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("lenghth 	/      capacity");
		System.out.println(v.size() + "            " +	v.capacity());
		
		Vector<Integer> v2 = new Vector<Integer>(3, 4); // 초기용량, 증가용량
		
		v2.add(2);
		v2.add(new Integer(333));

		v2.add(2);
		v2.add(12);
		v2.add(89);
		v2.add(77);
		v2.add(43);
		v2.add(21);
		v2.add(52);
		
		System.out.println(v2.size() +"    /     " + v2.capacity());
		
		System.out.println("------ iterator() method ----------");
		Iterator it = v2.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\n------ get() method ----------");
		
		for (int i = 0; i < v2.size(); i++) {
			System.out.print(v2.get(i) + " ");
		}
		
		System.out.println("\n------ sort() method ----------");
//		Collections.sort(v2, Comparator.reverseOrder()); // 내림차순
		Collections.sort(v2); 
		for (int i = 0; i < v2.size(); i++) {
			System.out.print(v2.get(i) + " ");
		}
		
		System.out.println("\n------ elementsAt() method ----------");
		for (int i = 0; i < v2.size(); i++) {
			Integer num = v2.elementAt(i);
			System.out.print(num + " ");
		}
		
		System.out.println("\n------ trimToSize() method ----------");
		v2.trimToSize(); // capacity 조정하기
		System.out.println(v2.size() + "      /          " + v2.capacity());
		
	}
}
