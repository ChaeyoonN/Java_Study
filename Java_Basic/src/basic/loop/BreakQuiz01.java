package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {
		/*
        1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
         지속적으로 문제를 출제한 후 정답을 입력받으세요.
         사용자가 0을 입력하면 반복문을 탈출시키세요.
         
        2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
       */
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("*** 덧셈 퀴즈 ***");
		System.out.println("# 종료하시려면 0을 입력하세요.");
		System.out.println("-------------");
		int rightCnt = 0;
		int wrongCnt = 0;
		
		while(true){
			//문제는 계속 달라져야 하므로 반복문 안에 변수 선언
			int rn1= (int)(Math.random()*100)+1; 
			int	rn2 = (int)(Math.random()*100)+1;
			System.out.printf("%d + %d = ???\n", rn1, rn2);
			System.out.print("> ");
			//문제가 나온 후에 입력받기
			int answer = sc.nextInt();
			
			if(answer==rn1+rn2) {
				System.out.println("정답입니다!");
				System.out.println("-------------");
				rightCnt++;
			}else if(answer==0) {
				System.out.println("종료합니다.");
				System.out.println("-------------");
				
				break;
			}else {
				System.out.println("틀렸습니다.");
				System.out.println("-------------");
				wrongCnt++;
				
			}
			
		}
		//횟수는 항상 마지막에 출력 (종료합니다 후에 출력해도 된다.)
		System.out.println("정답 횟수:"+rightCnt+"회");
		System.out.println("오답 횟수:"+wrongCnt+"회");
		
		
		sc.close();

	}

}
