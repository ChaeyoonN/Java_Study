package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {
		
		String[] foods = {"삼겹살", "족발", "피자", "햄버거"};
		System.out.println(Arrays.toString(foods));
		
		foods[0] = "치킨";
		foods[2] = "탕수육";
		System.out.println(Arrays.toString(foods));
		
		System.out.println("-------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("탐색할 음식을 입력하세요: ");
		String name = sc.next();
		
//		int i;//방법2: 선언하고 for문 제어변수에서 int 지워.
		//방법3: 불린 변수(flag)로 break;전에 true로 바꿔. for문 끝나고 if(!flag)
		for(int i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("탐색 완료!");
				System.out.println("인덱스: "+i+"번");
				break;
			}
//			System.out.println(i);
			if(i == foods.length-1) {//방법1: else if로 써도 무방
				System.out.println("그런 음식 없음~!");
			}
		}
		
//		if(i == foods.length) {
//			System.out.println("그런 음식 없음!");
//		}
		
		sc.close();
		
	}

}
