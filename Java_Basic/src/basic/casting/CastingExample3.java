package basic.casting;

public class CastingExample3 {

	public static void main(String[] args) {
		char c= 'B'; 
		int i =2;
		
		//서로 타입이 다른 기본 데이터의 연산 시에는 데이터 타입이 큰쪽에
		//작은 쪽이 맞춰져서 자동으로 형 변환이 진행된 뒤에 연산이 진행됩니다.
		
		int intResult = c + i;
		char charResult = (char)(c + i);
		System.out.println(intResult);//68
		System.out.println(charResult);//D
		
		int k = 10;
		double d = (double) k/4; 
		System.out.println(d);//2.5 아니라 2.0
		//int와 int의 연산이므로 2가 되고 대입 시 2.0 된다.
		//결과가 2.5 되게 하고 싶다면 
		//k의 타입을 형으로 변환하든가, 숫자를 4.0으로 바꿔준다.
		
		//int보다 작은 크기의 데이터 연산은 자동으로 값이
		//int로 변환되어 처리됩니다.(데이터 손실의 방지)
		byte b1 = 100;
		byte b2 = 70;
		System.out.println(b1+b2);
	}

}
