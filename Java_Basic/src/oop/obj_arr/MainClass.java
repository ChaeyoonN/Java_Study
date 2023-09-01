package oop.obj_arr;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
//		Person kim = new Person("김철수", 32, "남자");
//		Person lee = new Person("이영희", 25, "여자");
//		Person park = new Person("박뽀삐", 50, "남자");
//		
//		kim.personInfo();
//		lee.personInfo();
//		park.personInfo();
		
//		int[] arr = new int[5];
//		Person[] people = new Person[3];
//		people[0] = new Person("김철수", 32, "남자");
		//엄밀히 말하면 배열 안에 객체의 주소값 들어감
		
		int[] arr = {1, 2, 3, 4, 5};
		Person[] people = {
				new Person("김철수", 32, "남자"),
				new Person("이영희", 25, "여자"),
				new Person("박뽀삐", 50, "남자")
		};
		
//		System.out.println(Arrays.toString(people));
		
//		people[0].personInfo();
//		people[1].personInfo();
//		people[2].personInfo();
		
//		for(int i=0; i<people.length; i++) {
//			people[i].personInfo();
			//주솟값.메서드;
//		}
		
		for(Person p : people) {
			p.personInfo();
		}
		
		System.out.println(people);//주솟값
		System.out.println(Arrays.toString(people));//주솟값
		System.out.println(Arrays.deepToString(people));//주솟값
		
		System.out.println(people[0]);//주솟값
		System.out.println(people[1]);//주솟값
		System.out.println(people[2]);//주솟값
		
		
		
		
		
	}

}
