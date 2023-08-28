package basic.constate;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		/*
        - 정수 3개를 입력 받습니다.
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
        
        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개 입력: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
//		System.out.print("정수 1: ");
//		int n1 = sc.nextInt();
//		System.out.print("정수 2: ");
//		int n2 = sc.nextInt();
//		System.out.print("정수 3: ");
//		int n3 = sc.nextInt();
		
//		int max = 0, mid = 0, min = 0;
		
		int max, mid, min;
		//초기화 안하고 빨간줄->못찾은 경우의 수가 있음
		(n1>n2 && n1>n3)? max=n1:(n2>n3)? mid=n2 : mid=n3);
	
		if(n1>n2) {
			if(n1>n3) {
				max = n1;
				if(n2>n3) {
					mid = n2;
					min = n3;
				}else {
					mid = n3;
					min = n2;
				}
			}
		}else if(n2>n3) {
			max = n2;
			if(n1>n3) {
				mid = n1;
				min = n3;
			}else {
				mid = n3;
				min = n1;
			}
		}else {//n1<n2 || n2<n3
			if(n1<n2) {//n1<n2
				if(n2<n3) {
					max = n3;
					if(n1>n2) {
						mid = n1;
						min = n2;
					}else {
						mid = n2;
						min = n1;
					}
					
				}
			}else {//n2<n3
				if(n1<n2) {
					max = n3;
					if(n1>n2) {
						mid = n1;
						min = n2;
					}else {
						mid = n2;
						min = n1;
					}
	
				}
			}
//			max = n3;
//			if(n1>n2) {
//				mid = n1;
//				min = n2;
//			}else {
//				mid = n2;
//				min = n1;
//			}
		}//3번째 끝
		
		System.out.println("가장 큰 값:"+max);
		System.out.println("중간 값:"+mid);
		System.out.println("가장 작은 값:"+min);
		
		sc.close();

	}

}
