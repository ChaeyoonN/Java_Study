package basic.loop;

public class BreakExample1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10;i++) {
			if(i >6) break;//1 2 3 4 5 6
			
			System.out.print(i+" ");
			
//			if(i >6) break; //1 2 3 4 5 6 7
		}
		
		System.out.println("\n반복문 종료!");
		
		System.out.println("------------------");
		
		/*
        - 내부 반복문에 포함된 break로 바깥쪽 반복문까지 한번에
         종료시키고 싶다면 바깥쪽 반복문에 label을 붙입니다.
         그리고, break 선언 시 label을 함께 선언합니다. 
        */
		
		outer: for(int i=0; i<=2; i++) {
			for(int j=0;j<=1;j++) {
				if(i==j) break outer;
				//자신이 포함된 첫for문만 나감이 원칙.
				//for문에 이름 붙여서 원하는 반복문 나갈 수 있다.
				System.out.println(i+"-"+j);
			}
		}

	}

}
