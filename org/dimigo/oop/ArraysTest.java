package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		String[] src = {"차다빈", "성인실", "박근정", "양기현", "양기가"};
		
		// 배열 복사
		String[] dest = Arrays.copyOf(src, src.length);
		
		// 배열 출력
		System.out.println(Arrays.toString(dest));
		
		// 배열 비교
		System.out.println(Arrays.equals(src, dest));
		
		// 배열 정렬
		Arrays.sort(dest);
		
		System.out.println(Arrays.toString(dest));
		
		// 배열 검색
		System.out.println(Arrays.binarySearch(dest, "양기가"));
		
		
	}

}
