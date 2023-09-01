package oop.final_.method;

/*
- 클래스 선언 시 final을 사용하면 그 클래스는 상속이 불가능해집니다.

- final 클래스는 자식 클래스를 가질 수 없고, 오직 외부에서 객체 생성을
통해서만 사용할 수 있습니다.

- 대표적인 final 클래스는 String 입니다.
*/

public class Child extends Parent {

	@Override
	void method1() {
		// TODO Auto-generated method stub
		super.method1();
	}

	@Override
	void method2() {
		// TODO Auto-generated method stub
		super.method2();
	}//import없으면 같은 패키지의 Parent
	
//	void method3() {
//		System.out.println("오버라이딩 해야지~");
//	} (x) -> final 메서드는 오버라이딩을 막습니다. (물려주는 대로 써라~)
	
	
	
	
}
