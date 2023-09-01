package oop.poly.car;

public class MainClass {

	public static void main(String[] args) {
		
			Sonata s1 = new Sonata();
			Sonata s2 = new Sonata();
			Sonata s3 = new Sonata();
		
			Porsche p1 = new Porsche();
			Porsche p2 = new Porsche();
			Porsche p3 = new Porsche();
		
			Tesla t1 = new 	Tesla();
			Tesla t2 = new 	Tesla();
			Tesla t3 = new 	Tesla();
			Tesla t4 = new 	Tesla();
			
			//시도 1.
//			s1.run(); s2.run(); s3.run();
//			p1.run(); p2.run(); p3.run();
//			t1.run(); t2.run(); t3.run(); t4.run();
			
			//시도 2.
//			Sonata[] sonatas = {s1, s2, s3};
//			for(Sonata s : sonatas) {
//				s.run();
//			}
			
			//시도 3. 다형성을 적용해서 이종모음 배열을 선언할 수 있다.
			Car[] cars = {s1, s2, s3, p1, p2, p3, t1, t2, t3, t4};
//			double[] arr = {1, 2, 3, 4, 5}; 처럼 상위 타입으로 자동 형 변환
			
			for(Car c: cars) {
				c.run();
			}
			
			System.out.println("-------------------");
			
			System.out.println("*** 타이어 교체 작업 ***");
			t1.frontLeft = new HTire();
			t1.frontRight = new HTire();
			t1.rearLeft = new HTire();
			t1.rearRight = new HTire();
			
			System.out.println("--------------------");
			
			Driver kim = new Driver();
			kim.drive(s2);
			kim.drive(t3);
			kim.drive(p1);
			
			System.out.println("--------------------");
			
			Tesla myTesla = (Tesla) kim.buyCar("테슬라");//방법1: 리턴값을 테슬라타입으로 받기
//			c.run();
//			Tesla myTesla = (Tesla) c;//방법2: 주소값 넘기기
			myTesla.activeAutopilot();
			
	}

}
