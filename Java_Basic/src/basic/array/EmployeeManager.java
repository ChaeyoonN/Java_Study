package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//사원의 정보: 사번, 이름, 나이, 부서명
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];
		
		//실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.
		int count =0;

		while(true) {
			System.out.println("\n========== 사원 관리 프로그램 ==========");
            System.out.println("# 1. 사원 정보 신규 등록");
            System.out.println("# 2. 모든 사원 정보 보기");
            System.out.println("# 3. 사원 정보 검색");
            System.out.println("# 4. 사원 정보 수정");
            System.out.println("# 5. 사원 정보 삭제");
            System.out.println("# 6. 프로그램 종료");            
            System.out.println("====================================");
        
            System.out.print("> ");
            int menu = sc.nextInt();
            
            if(menu == 1) {
                //사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
                //사번은 중복되면 안됩니다.
                //(무한루프를 구현해서 사번 중복이 발생하면 다시 입력받기.)
            	
            	while(true){
            		System.out.println("# 사원 정보 등록을 시작합니다.");
            		System.out.print("사번 입력: ");
                	String userNum = sc.next();
                	
            		boolean chk = false;
            		
            		
	            	//사번 중복 검사 위한 반복문
            		for(int i=0;i<userNums.length;i++) {
            			if(userNums[i] == null) break;//for문 탈출
            			if(userNum.equals(userNums[i])) {//사번 중복이면
                			System.out.println("같은 사번을 입력할 수 없습니다.");
                			System.out.println("다른 사번을 입력해주세요.");
                			chk = true;
            				break;//for문 탈출
                		}
            		}//end of for
            		
            		if(!chk) {//chk==f라면 (사번 중복 아니라면)
            			userNums[count] = userNum;
            			
            			System.out.print("이름 입력: ");
                    	String name = sc.next();
                    	
                    	System.out.print("나이 입력: ");
                    	int age = sc.nextInt();
                    	
                    	System.out.print("부서명 입력: ");
                    	String department = sc.next();
                    	
                		
                    	names[count] = name;	
                    	ages[count] = age;
                    	departments[count] = department;
                    	count++;
                    	
                    	System.out.println(Arrays.toString(userNums));
                    	System.out.println(Arrays.toString(names));
                    	System.out.println(Arrays.toString(ages));
                    	System.out.println(Arrays.toString(departments));
                    	
            			break;//무한루프 탈출!
            		}//end of if
            		
            	}//end of while(true)
            	
            	
            }else if(menu == 2) {
            	//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
                //만약 사용자가 사원 등록을 한 명도 하지 않았다면
                //"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
            	
            	System.out.println("모든 사원 정보를 출력합니다.");
            	if(count<=0) {
            		System.out.println("등록된 사원 정보가 없습니다.");
            	}else {
            		System.out.println("총 사원수:"+count);
            		for(int i=0; i<count;i++) {
            			System.out.println("사번: "+userNums[i]);
	            		System.out.println("이름: "+names[i]);
	            		System.out.println("나이: "+ages[i]);
	            		System.out.println("부서: "+departments[i]);
	            		System.out.println();
            		}
            	}
            	
            	
            }else if(menu == 3) {
                //입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
                //입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
            	System.out.print("검색할 사원의 사번 입력: ");
            	String userNum = sc.next();
            	
            	boolean searchChk = false;
            	int i = 0;
            	for(i=0; i<count; i++) {
            		if(userNum.equals(userNums[i])) {
            			System.out.println("사번: "+userNums[i]);
	            		System.out.println("이름: "+names[i]);
	            		System.out.println("나이: "+ages[i]);
	            		System.out.println("부서: "+departments[i]);
	            		searchChk = true;
            		}
            		if(i==count) {
            			System.out.println("조회하신 사원의 정보가 없습니다!");
            		}
            	}
            	if(!searchChk) {
            		System.out.println("조회하신 사원의 정보가 없습니다.");
            	}
      	
            	
            }else if(menu == 4) {
            	//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
                //프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
                //사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
                //사번이 존재하지 않는다면 없다고 얘기해 주세요.
            	
            	System.out.print("수정할 사원의 사번 입력: ");
            	String userNum = sc.next();
            	
            	boolean searchChk = false;
            	
            	outer: for(int i=0; i<count; i++) {
            		if(userNum.equals(userNums[i])) {
            			System.out.println("# "+names[i]+"님의 정보를 변경합니다.");
            			
            			menu4: while(true) {
            				System.out.println("[1. 나이변경 | 2. 부서변경 | 3.취소]");
            				int rewriteNum = sc.nextInt();
            				
            				switch(rewriteNum){
            				case 1:
            					System.out.print("수정 적용할 나이 입력: ");
            					int age = sc.nextInt();
            					ages[i] = age;
            					System.out.printf("나이가 %d세로 변경되었습니다.",ages[i]);
            					System.out.println();
            					break;
            				case 2:
            					System.out.print("수정 적용할 부서 입력: ");
            					String department = sc.next();
            					departments[i] = department;
            					System.out.printf("부서가 %s로 변경되었습니다.",departments[i]);
            					System.out.println();
            					break;
            				case 3:
            					System.out.println("메인으로 돌아갑니다.");
            					break menu4;
            				default:
            					System.out.println("# 변경 메뉴를 잘못 입력하셨습니다.");
            				}//switch
            				
            			}//while
            			searchChk = true;
            			break;//for문 탈출
            		}//if
            		
            	}//for
            	
            	if(!searchChk) {
            		System.out.print("조회하신 사원의 정보가 없습니다.");
            	}
            	
            	
            	
            }else if(menu == 5) {
            	//사번을 입력받아서
                //해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
                //삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
                //y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
                //배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
                //앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
            	System.out.print("삭제하실 사원의 번호 입력: ");
            	String userNum = sc.next();
            	
            	boolean f = false;
            	for(int i=0; i<count; i++) {
            		if(userNum.equals(userNums[i])){
            			System.out.println("삭제할 사원 이름: "+names[i]);
            			System.out.println("정말 삭제하시겠습니까? [Y/N]");
            			String ans = sc.next();
            			
            			switch(ans) {
            			case"Y": case"y": case"ㅛ":
            				if(i == userNums.length-1) {
            					//삭제하고자하는 값이 각 배열의 마지막 값인 경우
            					userNums[i] = null;
	            				names[i] = null;	
	                        	ages[i] = 0;
	                        	departments[i] = null;
            				}else {
            					for(int j=i; j<count; j++) {
            					userNums[i] = userNums[j+1];
	            				names[i] = names[j+1];	
	                        	ages[i] = ages[j+1];
	                        	departments[i] = departments[j+1];	
            					}
            				}
            				
            				
            				count--;
            				System.out.println("삭제가 정상적으로 완료되었습니다.");
            				System.out.println(Arrays.toString(userNums));
                        	System.out.println(Arrays.toString(names));
                        	System.out.println(Arrays.toString(ages));
                        	System.out.println(Arrays.toString(departments));
            				break;
            				
            			case"N": case"n": case"ㅜ":
            				System.out.println("# 삭제를 취소합니다.");
            				break;
            			
            			default:
            				System.out.println("# 잘못 입력하셨습니다.");
            				System.out.println("# 메인으로 돌아갑니다.");            				
            			}
            			
            			
            			f = true;
            			break;//for문 탈출
            		}
            	}
            	if(!f) {
            		System.out.print("조회하신 사원의 정보가 없습니다.");
            	}
            	
            	
            }else if(menu == 6) {
            	System.out.println("프로그램을 종료합니다.");
            	sc.close();
            	break;//while true break;
            }else {
            	System.out.println("메뉴를 잘못 입력하셨습니다.");
            }
          
            
		}//end of while true
		
		
		sc.close();

	}//end of main

}
