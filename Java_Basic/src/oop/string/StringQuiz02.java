package oop.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {

		/*
        1. 주민등록번호 13자리를 입력받습니다.
        2. 주민등록번호는 -을 포함해서 받을 예정입니다.
        3. 13자리가 아니라면 다시 입력받습니다.
        4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.
        */
		
		Scanner sc = new Scanner(System.in);
		
		
//		System.out.println(Arrays.toString(numbers));
		outer: while(true) {
			System.out.print("주민등록번호 입력 ('-' 포함): ");
			String input = sc.next();
			input = input.trim();
			input = input.replace(" ", "");
			
			String[] numbers = input.split("-");
			
			if(numbers[0].length() !=6 || numbers[1].length() !=7) {
				System.out.println("주민등록번호는 13자리여야 합니다.");
			}else {
				if(numbers[1].charAt(0)=='1' || numbers[1].charAt(0)=='3') {
					//기본 자료형은 ==으로 비교 가능!
					System.out.println("남자");
					break;
					
				}else if(numbers[1].charAt(0)=='2' || numbers[1].charAt(0)=='4') {
					System.out.println("여자");
					break;
				}
			}
			
			//쌤이 한거
			System.out.print("주민등록번호 입력 ('-' 포함): ");
			String ssn = sc.next();
			ssn = input.replace("-", "");
			
			if(ssn.length() != 13) {
				System.out.println("주민등록번호는 13자리여야 합니다.");
			}else {
				switch (ssn.charAt(6)) {
				case '1': case '3':
					System.out.println("남자");
					break outer;
				case '2': case '4':
					System.out.println("여자");
					break outer;
				default:
					System.out.println("잘못 입력했습니다.");
				}
			}
				
		}//end of while(true)

	}

}
