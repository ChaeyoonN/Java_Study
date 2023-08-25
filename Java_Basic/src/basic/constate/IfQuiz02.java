package basic.constate;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		/*
        # 스캐너를 사용하여 정수를 하나 입력받으세요.
        
        - 입력받은 값이 7의 배수라면 "7의 배수입니다." 를 출력.
        - 입력받은 값이 7의 배수가 아니라면 "7의 배수가 아닙니다." 를 출력.
        - 입력받은 값이 0이라면 "0입니다." 를 출력하세요.
       */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
//		System.out.println(0%7);//0
		
		if(num==0) {//0%7==0이므로 0을 먼저 거르자.
			System.out.println("0입니다.");
		}else if(num%7==0) {
			System.out.println("7의 배수입니다.");
		}else {
			System.out.println("7의 배수가 아닙니다.");
		}
		
		//방법2
//		if(num%7==0 && num!=0) {
//			System.out.println("7의 배수입니다.");			
//		}else if(num==0) {
//			System.out.println("0입니다.");
//		}else {
//			System.out.println("7의 배수가 아닙니다.");
//		}
		
	
		sc.close();
	
	}

}
