package etc.api.lang.wrapper;

import java.util.Arrays;
import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {

		/*
	주민등록번호를 입력받아서 다음과 같은 정보를 추출하여 출력합니다.
	
	ex) 입력값: 9201013-1234567
	출력값: 1992년 10월 13일 31세 남자 
	
	입력값: 040906-4123456
	출력값: 2004년 9월 6일 19세 여자 
	
	입력값은 하이픈이 포함된 문자열이어야 합니다. 
	하이픈이 포함되어 있지 않거나, 주민등록번호 뒷자리 첫번째 숫자가 1,2,3,4가 아닐 시에는 다시 입력받아야 합니다.
	또한 하이픈을 제외한 값이 숫자가 아닐 시에도 다시 입력받아 주시면 됩니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("주민등록번호 입력: ");
			String idNum = sc.next();
			int first; int last;
			
			if(idNum.indexOf("-") == -1) {
				System.out.println("\'-\'을 포함하여 입력해 주세요!");
			}else{// 하이픈 조건 통과
				String[] ids = idNum.split("-");
				System.out.println(Arrays.toString(ids));
				
				
				try {
					first = Integer.parseInt(ids[0]);
					last = Integer.parseInt(ids[1]);
					System.out.println(first); 
					System.out.println(last); 
					
				}catch(NumberFormatException e){
					System.out.println("숫자가 아닙니다!");
				}
				
				
				if(ids[0].length() != 6 || ids[1].length() != 7) {
					System.out.println("주민등록번호 자릿수를 정확히 입력해주세요!");
				}else {//자릿수 조건 통과
//					System.out.println(((Integer) first).getClass()); 
					
					if(ids[0].charAt(0)==0) {//2000년대생
						if(ids[1].charAt(0)==1) {//남자
							System.out.printf("20%s년 %s월 %s일 %d세 남자", //012345
								ids[0].substring(0, 2),
								ids[0].substring(2, 4),
								ids[0].substring(4, 6),
								2023-Integer.parseInt(String.valueOf(20)+ids[0].substring(0, 2)));
							break;
						}else {
							System.out.printf("20%s년 %s월 %s일 %d세 여자", //012345
									ids[0].substring(0, 2),
									ids[0].substring(2, 4),
									ids[0].substring(4, 6),
									2023-Integer.parseInt(String.valueOf(20)+ids[0].substring(0, 2)));
							break;
						}
				
					}else {//2000년대생 아님
						if(ids[1].charAt(0)==1) {//남자
							System.out.printf("19%s년 %s월 %s일 %d세 남자", //012345
								ids[0].substring(0, 2),
								ids[0].substring(2, 4),
								ids[0].substring(4, 6),
								2023-Integer.parseInt(String.valueOf(19)+ids[0].substring(0, 2)));
							break;
						}else {
							System.out.printf("19%s년 %s월 %s일 %d세 여자", //012345
									ids[0].substring(0, 2),
									ids[0].substring(2, 4),
									ids[0].substring(4, 6),
									2023-Integer.parseInt(String.valueOf(19)+ids[0].substring(0, 2)));
							break;
						}
						
					}
					
				}
				
				
		
			}

		
			
		}//end of while 
		
		

	}

}
