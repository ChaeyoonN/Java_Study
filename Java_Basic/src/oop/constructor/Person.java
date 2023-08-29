package oop.constructor;

public class Person {

	String name;
	int age;
	double height;
	
	Person() {//기본 생성자
		
	}
	
	Person(String n, int a, double h){
		name = n;
		age = a;
		height = h;
	}
	
	
	void info() {
		System.out.println("*** 인적 정보 ***");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age+"세");
		System.out.println("키: "+height+"cm");
	}
	
}
