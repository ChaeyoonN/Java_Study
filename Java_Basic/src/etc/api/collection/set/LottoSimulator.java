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
    static int failCnt = 0; // 미당첨 횟수를 세 줄 변수
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
    	
    	
    	//리스트 사용하는 방법
//    	List<Integer> lotto = new ArrayList<>();
//    	
//    	while(lotto.size() < 6) {
//    		int num = r.nextInt(45)+1;
//    		if(!lotto.contains(num)) {
//    			lotto.add(num);
//    		}
//    	}
//    	return lotto; //리스트를 리턴
    	
    	
    	
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
		
		while(true) {
			int bonusR = r.nextInt(45)+1;
			if(!randomNums.contains(bonusR)) {
				return bonusR;
			}
		}
    	
		
    
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
    	
    	for(int n : buy) { //오토언박싱해주므로 Integer말고 int라고 써도 됌!
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
//    	System.out.println("당첨 번호: "+randomNums);
        
        //보너스번호도 하나 고정시키세요.
    	int bonusNum = createBonusNum(randomNums);
//    	System.out.println("보너스 번호: "+bonusNum);
    	
        int tryNum = 0;
        long cost = 0;
        while(true) {
            /*
             - 1등이 당첨 될 때까지 반복문을 돌립니다.
             - 1등이 당첨 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고
              반복문을 종료합니다.
             - 로또를 구매하기 위한 금액도 출력하세요. (long)
             */
        	
        	Set<Integer> mine = createLotto();
        	tryNum++; cost +=1000;
//        	System.out.printf("%d번째 내가 고른 로또 번호: %s\n", tryNum, mine);
        	
        	checkLottoNumber(randomNums, mine, bonusNum);
        	
        	if(LottoSimulator.prize1 == 1) {
        		System.out.printf("당첨 번호: %s + 보너스 번호: %d\n",
        				randomNums, bonusNum);
        		System.out.println("나의 1등 당첨된 번호: "+mine);
        		
        		System.out.printf("1등이 되기까지 누적 당첨 횟수: 총%d회\n1등: %d회\n2등: %d회\n3등: %d회\n4등: %d회\n5등: %d회\n꽝: %d회\n",
        			(LottoSimulator.prize1+LottoSimulator.prize2
        			+LottoSimulator.prize3+LottoSimulator.prize4
        			+LottoSimulator.prize5),
        			LottoSimulator.prize1,
        			LottoSimulator.prize2,
        			LottoSimulator.prize3,
        			LottoSimulator.prize4,
        			LottoSimulator.prize5,
        			LottoSimulator.failCnt);
//        		long amount = 1000*tryNum;
        		System.out.println("구매 장수: "+tryNum+"장");
        		System.out.println("구매 금액: "+cost+"원");
        		break;
        	}else {
        		System.out.println("로또 "+tryNum+"째 구매중...");
        	}
        	
        }

        	
   	
    	
	}
	
	
}
