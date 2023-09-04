package oop.poly.casting;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.n1 = 1;
//		p.n2 = 2; (x)
		
		p.method1();
		p.method2();
//		p.method3(); (x)
		
		System.out.println("-------------------");
		
		Child c = new Child();
		c.n1 = 1; //부모에게 물려받은 속성
		c.n2 = 2; //자식의 고유 속성

		c.method1();
		c.method2();
		c.method3();
		
		System.out.println("--------------------");
		
		//다형성 적용(promotion)
		Parent p2 = new Child();//생성자 호출해서 객체 생성하고 그 객체의 주소값을 p2에 저장.
		//p2는 Parent 객체 타입이라고 선언 시 자료형 명시.
		p2.n1 = 1;
//		p2.n2 = 2; (x) Parent의 시각으로 n2 알 수 없음.
		
		p2.method1();
		p2.method2(); //Parent의 시각으로 물려준 메서드 볼 수 있음. 자식이 오버라이딩한 메서드 호출.
//		p2.method3(); (x) Parent의 시각으로 method3() 알 수 없음.
		
		/*
		 - 다형성이 적용되면 자식 클래스의
		 본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.
		 
		 - 이를 해결하기 위해 강제 타입 변환을 사용합니다.
		 */
		Child c2 = (Child) p2; //부모 타입을 자식 타입으로 강제 변환(Downcasting)
		//주소값 넘김. 객체는 여전히 하나다.
		c.n2 = 2;
		c2.method2();
		c2.method3();
		
		System.out.println("p2의 주소값: "+p2);
		System.out.println("c2의 주소값: "+c2);
		
		Object o = new String("안녕하세요~~");
		String str = (String) o;
		System.out.println("문자열의 길이: "+str.length());
		
		//다형성이 한 번도 발생하지 않은 경우에는 
		//강제 형 변환을 사용할 수 없습니다. 부모객체 생성한다고 자식 객체가 생성되지 않으므로.
		
		Parent ppp = new Parent();
//		Child ccc = (Child) ppp; (x)
		
		
	}

}
