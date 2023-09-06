package etc.api.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


public class LottoSimulator {

	static Random r = new Random();
    
    static int prize1 = 0; //1등 당첨 횟수를 세 줄 변수
    static int prize2 = 0; //2등 당첨 횟수를 세 줄 변수
    static int prize3 = 0; //3등 당첨 횟수를 세 줄 변수
    static int prize4 = 0; //4등 당첨 횟수를 세 줄 변수
    static int prize5 = 0; //5등 당첨 횟수를 세 줄 변수
    static int failCnt = 0; // 당첨 횟수를 세 줄 변수
//    static int count = 0;//같을때의 횟수 셀 변수 여기 선언 금지!
    
    
    public static Set<Integer> createLotto() {
//        /*
//         - 1~45 범위의 난수 6개를 생성하셔서
//          컬렉션 자료형에 모아서 리턴해 주세요.
//          무엇을 쓰든 상관하지 않겠습니다.
//          중복이 발생하면 안됩니다.
//         */ 
    	
//    	int r1 = LottoSimulator.r.nextInt(45)+1;
//    	int r2 = LottoSimulator.r.nextInt(45)+1;
//    	int r3 = LottoSimulator.r.nextInt(45)+1;
//    	int r4 = LottoSimulator.r.nextInt(45)+1;
//    	int r5 = LottoSimulator.r.nextInt(45)+1;
//    	int r6 = LottoSimulator.r.nextInt(45)+1;
    	
    	Set<Integer> randomNums = new HashSet<>();
    	
    	
    	while(randomNums.size()<6) {
    		randomNums.add(LottoSimulator.r.nextInt(45)+1);
    	}
    	
    	return randomNums;
    	
    }
//    
//    
//    //보너스 번호를 생성하는 메서드
    public static int createBonusNum(Set<Integer> randomNums) {
//        
//        /*
//         - 매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후
//          당첨번호들을 피해서 보너스번호 하나만 뽑아 주세요.
//          범위는 마찬가지로 1 ~ 45 사이의 난수입니다.
//         */
		int bonusR=0;
		while(true) {
			bonusR = r.nextInt(45)+1;
			if(!randomNums.contains(bonusR)) {
				return bonusR;
			}
		}
		
//    	for(Integer n : randomNums) {
//    		bonusR = r.nextInt(45)+1;
//    		int transN = n;
//    		if(transN==bonusR) {
//    			continue;
//    		}
//    	}
//    	
//		return bonusR;
    
    }
  
//    //당첨 등수를 알려주는 메서드
    public static void checkLottoNumber(Set<Integer> randomNums, 
    		Set<Integer> buy, int bonusR) {
//        /*
//         매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
//         내 로또 번호와 당첨번호를 비교하여
//         일치하는 횟수를 세 주신 후 등수를 판단하세요.
//         판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
//         6개 일치 -> 1등
//         5개 일치 + 보너스번호 일치 -> 2등
//         5개 일치 -> 3등
//         4개 일치 -> 4등
//         3개 일치 -> 5등
//         나머지 -> 꽝
//         */
//    	List<Integer> mine =  new ArrayList<>(buy);
//    	List<Integer> win =  new ArrayList<>(randomNums);
//    
//    	Collections.sort(mine);
//    	Collections.sort(win);
//    	
//    	Integer trans = bonusR;
//    	boolean flag = false;
//    	
//    	for(int i=0; i<buy.size(); i++) {
//    		if(mine.get(i).equals(win.get(i))){
//    			count++;
//    		}
//    		
//    		if(mine.get(i).equals(trans)){
//    			flag = true;
//    		}
//    		
//    	}
    	
    	int count = 0;
    	
    	for(int n : buy) {
    		if(randomNums.contains(n)) count++;
    	}
    	
    	if(count==6) {
    		prize1++;
    	}else if(count==5) {
    		if(buy.contains(bonusR)) prize2++;
    		else prize3++;
    	}else if(count==4) {
    		prize4++;
    	}else if(count==3) {
    		prize5++;
    	}else {
    		failCnt++;
    	}
    	
    	
    }
   
    
    public static void main(String[] args) {
		
    	//로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정시키세요.
    	Set<Integer> randomNums = createLotto();
    	System.out.println(randomNums);
        
        //보너스번호도 하나 고정시키세요.
    	int bonusNum = createBonusNum(randomNums);
    	System.out.println(bonusNum);
    	
        int tryNum = 0;
        
        while(true) {
            /*
             - 1등이 당첨 될 때까지 반복문을 돌립니다.
             - 1등이 당첨 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고
              반복문을 종료합니다.
             - 로또를 구매하기 위한 금액도 출력하세요. (long)
             */
        	
        	Set<Integer> mine = createLotto();
        	tryNum++;
        	System.out.printf("%d번째 내가 고른 로또 번호: %s\n", tryNum, mine);
        	
        	checkLottoNumber(randomNums, mine, bonusNum);
        	
        	if(LottoSimulator.prize1 == 1) {
        		System.out.println(LottoSimulator.prize1);
        		System.out.println(LottoSimulator.prize2);
        		System.out.println(LottoSimulator.prize3);
        		System.out.println(LottoSimulator.prize4);
        		System.out.println(LottoSimulator.prize5);
        		System.out.printf("1등이 되기까지 누적당첨횟수: %d\n",
        			(LottoSimulator.prize1+LottoSimulator.prize2
        			+LottoSimulator.prize3+LottoSimulator.prize4
        			+LottoSimulator.prize5));
        		
        		break;
        	}
        	
        }
        long amount = 1000*tryNum;
        System.out.println("구매 금액: "+amount);
        	
   	
    	
	}
	
	
}
