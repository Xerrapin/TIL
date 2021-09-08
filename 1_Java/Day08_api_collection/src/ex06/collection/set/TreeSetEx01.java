package ex06.collection.set;

import java.util.TreeSet;

public class TreeSetEx01 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		int[] score = { 85, 77, 50, 44, 98, 100, 65, 50, 35 };
		
		for (int i = 0; i < score.length; i++) {
			set.add(score[i]);
//			set.add(new Integer(score[i]));
		}
		
		System.out.println(set); // 자동 정렬
		System.out.println("50보다 작은 값 : " + set.headSet(new Integer(50))); // 50 미만.
		System.out.println("50보다 큰 값 : " + set.tailSet(new Integer(50))); // 50 이상.
	}
}