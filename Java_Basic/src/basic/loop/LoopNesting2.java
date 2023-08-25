package basic.loop;

import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {
		/*
        - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
         가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.
         
        ex)
        입력받은 수 -> 30
        소수: 2 3 5 7 11 13 17 19 23 29
        소수의 개수: 10개
       */
       Scanner sc = new Scanner(System.in);
       System.out.print("정수: ");
       int num = sc.nextInt();
       
       int count = 0;//소수의 개수를 기억해줄 변수
       System.out.print("소수: ");
       for(int i=1; i<=num; i++) {//i는 소수 판별 대상인 수
    	   int cnt = 0;//소수 판별을 위해 나누어떨어지는수의 개수를 세 줄 변수
    	   //값을 i마다 다시 세줘야 하므로 여기에 써야 한다.
    	   for(int j=1; j<=i;j++) {//j는 소수 판별 위해 나눠보는 수
    		   if(i % j == 0) cnt++;
    		
    		   if(cnt==2) {
        		   System.out.print(i + " ");
        		   count++;
        	   }//약수가 2개 이상인 수가 j가 약수가 2개가 될 때부터 i가 되기 전까지
    		   //i가 출력되므로 여기 쓰면 안된다.
    		   
    	   }
//    	   if(cnt==2) {
//    		   System.out.print(i + " ");
//    		   count++;
//    	   }
       }
       System.out.println("\n소수의 개수: "+count+"개");
       
       sc.close();
       

	}

}
