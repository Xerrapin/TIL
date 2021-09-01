package ex06.collection.set;

import java.util.HashSet;
import java.util.Iterator;

// Set : 순서 없고, 중복 허용하지 않음
public class HashSetEx01 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("키보드");
		hs.add("컵");
		hs.add("볼펜");
		hs.add("java book");
		hs.add("키보드");
		
		System.out.println("요소 개수 : " + hs.size()); // 중복을 허용하지 않기때문에 4
		
		Iterator it = hs.iterator();
		while( it.hasNext()) { // 다음 요소값이 있으면(true)라면,
			System.out.println(it.next());
		}
		
		System.out.println("=============================");
		
		HashSet<Integer> hs2 = new HashSet<Integer>(); // <E>이 사이의 데이터 타입은 객체타입만 가능. int 불가
		hs2.add(100);
		hs2.add(3);
		hs2.add(222);
		hs2.add(1000);
		hs2.add(new Integer(1000)); // 둘다 가능하지만, 위의 경우가 일반적.
		
		it = hs2.iterator();
		while( it.hasNext()) { // 다음 요소값이 있으면(true)라면,
			System.out.println(it.next());
		}
		
		System.out.println("=============================");
		
		for (Integer item : hs2) {
			System.out.println(item);
		}
		
		System.out.println("=============================");
		
		System.out.println(hs2);
		
		
	}
}


















