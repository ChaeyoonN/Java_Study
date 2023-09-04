package oop.obj_arr;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
		/*
		         - Score 객체를 담을 수 있는 배열을 선언하세요.
		          배열의 크기는 넉넉하게 100개로 하겠습니다.
		          
		         - 반복문을 이용해서 사용자에게 이름, 국어, 영어, 수학점수를
		         입력받은 후, 입력받은 점수를 토대로 Score 객체를 생성하세요.
		         총점과 평균은 여러분들이 직접 구해서 넣으셔야 합니다.
		         (직접 넣으시든, 메서드를 하나 만들어서 계산하시든 마음대로~)
		         객체 생성 후, 미리 만들어 놓은 배열에 객체를 추가해 주세요.
		         이름 입력란에 '그만' 이라고 입력하면 반복문을 종료시켜 주세요.
		         
		         - 반복문이 종료되었다면, 배열 내부에 있는 객체들을 순회하면서
		          scoreInfo()를 모두 불러주세요. (반복문)
		          주의!) 입력이 중간에 그만두어진다면, 배열의 나머지 인덱스는
		          모두 null로 가득 차 있습니다. (null.scoreInfo() -> 에러)
		         */
		Scanner sc = new Scanner(System.in);
		Score[] arr = new Score[100];
		
		
		
		System.out.println("총점과 평균 계산기");
		System.out.println("\"그만\" 입력 시 입력받기가 종료됩니다.");
		
		int i = 0; //객체 배열 인덱스
		while(true) {
			System.out.print("이름 입력: ");
			String name = sc.next();
			
			if(name.equals("그만")) {
				System.out.println("입력 종료.");
				System.out.println("---------------");
				break;
			}
			arr[i] = new Score();
			arr[i].setName(name);
			
			for(;;) {
				int count = 0; //국어,영어,수학 입력했는지 세는 변수
				System.out.print("국어성적 입력: ");
				int korean = sc.nextInt();
				arr[i].setKorean(korean);
				if(Score.flag) {
					continue;
				}
				count++;
				
				System.out.print("영어성적 입력: ");
				int english = sc.nextInt();
				arr[i].setEnglish(english);
				if(Score.flag) {
					continue;
				}
				count++;
				
				System.out.print("수학성적 입력: ");
				int math = sc.nextInt();
				arr[i].setMath(math);
				if(Score.flag) {
					continue;
				}
				count++;
				
				if(count != 3) {
					System.out.println("모든 과목의 성적을 입력해야 합니다.");
					continue;
				}else {
					System.out.println("한 학생의 성적 입력이 완료됐습니다.");
					System.out.println("\"그만\" 입력 시 입력받기가 종료됩니다.");
					break;
				}
			}//end of for
		
//			arr[i] = new Score();
//			arr[i].getName();
//			arr[i].getKorean();
//			arr[i].getEnglish();
//			arr[i].getMath();
//			people[i] = new Person(name, age, gender);
			arr[i].setTotal();
			arr[i].setAvg();
			i++;
			
		}//end of while
		
		for(Score s : arr) {
			if(s==null) break;
			s.scoreInfo();
		}
		
		
		sc.close();

	}

}
