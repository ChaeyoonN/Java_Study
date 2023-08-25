package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {
		/*
        1. 정수를 두개 입력받으세요. (x, y)
        2. x부터 y까지의 누적합계를 while을 사용하여 구하는 코드를 작성하세요.
        ex) 입력: 3, 7 -> "3부터 7까지의 누적합계: 25"
        
        처음에는 x에 무조건 작은 값이 들어올 것이라고 예상하고 작성하겠습니다.
        다 하신 분은 만약 x에 큰 값이 들어왔을 경우에는
        어떻게 대처할 지 생각해 보세요.
        (x에 큰 값이 들어와도 정상적으로 출력이 되었으면 좋겠습니다.
        입력: 7, 3 -> "3부터 7까지의 누적합계: 25")
        - while문을 if else 로 나눠서 두번 쓰는 것은 지양하겠습니다.
       */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 두 개 입력: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int iniX = x;
		int iniY = y;
		
		int total = 0;
		
		while(x!=y) {
			if(x<y) {
				total +=x; //x가 y-1될때까지만 누적합
				x++;//x가 y값과 같아진다.
			}else {
				total +=y;//y가 x-1될때까지만 누적합
				y++;//y가 x값과 같아진다.
			}
		}
		
		//여기 도달했을 때 x와 y의 값은 같아졌다.
		//(원래 같게 입력하거나 반복문 거쳐서 같아짐)
		if(iniX<iniY) {
			//초기 x가 초기 y보다 작을 때
			System.out.printf("입력: %d, %d -> "
						+ "\"%d부터 %d까지의 누적합계: ",
						iniX,iniY,iniX,iniY);
		}else {
			//초기 x가 초기 y보다 클 때
			System.out.printf("입력: %d, %d -> "
						+ "\"%d부터 %d까지의 누적합계: ",
						iniX,iniY,iniY,iniX);
		}
		
		//마지막 값까지 더해야 전체 누적합이 된다.
		//같은 값을 입력했다면 0+큰값이 출력된다.
		System.out.printf("%d\"",total+y);
		
		sc.close();
	}
}
