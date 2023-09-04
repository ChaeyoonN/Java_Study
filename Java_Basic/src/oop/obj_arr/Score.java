package oop.obj_arr;

public class Score {

	/*
	     - 이름, 국어, 영어, 수학, 총점, 평균(double)을
	      담을 수 있는 객체를 디자인하세요.
	      
	     - 학생의 모든 정보를 한 눈에 확인할 수 있게
	      scoreInfo() 메서드를 선언해 주세요.
	      메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
	      
	     - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
	    */
	//필드
	private String name;
	private int korean;
	private int english;
	private int math;
	
	private int total;
	private double avg;
	
	static boolean flag;
	
	//생성자
	public Score() {
		this.name = getName();
		this.korean = getKorean();
		this.english = getEnglish();
		this.math = getMath();
		this.total = getTotal();
		this.avg = getAvg();
		
	}
	
	
	//메서드
	//이름
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//국어
	public int getKorean() {
		return korean;
	}
	
	public void setKorean(int korean) {
		if(korean < 0 || korean > 100) {
			System.out.println("성적 입력이 잘못되었습니다.");
			flag = true;
			return;
		}
		flag = false;
		this.korean = korean;
	}
	//영어
	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		if(english < 0 || english > 100) {
			System.out.println("성적 입력이 잘못되었습니다.");
			flag = true;
			return;
		}
		flag = false;
		this.english = english;
	}
	//수학
	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(math < 0 || math > 100) {
			System.out.println("성적 입력이 잘못되었습니다.");
			flag = true;
			return;
		}
		flag = false;
		this.math = math;
	}
	//총점
	public int getTotal() {
		return total;
	}

	public void setTotal() {
		if(korean + english + math < 0 || korean + english + math > 300) {
			System.out.println("유효한 총점이 아닙니다.");
			flag = true;
			return;
		}
		flag = false;
		this.total = this.korean + this.english + this.math;
		
	}
	//평균
	public double getAvg() {
		return avg;
	}

	public void setAvg() {
		if(total / 3 < 0 || total / 3 > 300) {
			System.out.println("유효한 평균이 아닙니다.");
			flag = true;
			return;
		}
		flag = false;
		this.avg = total / 3.0;
	}

	//출력
	void scoreInfo(){
		System.out.println("학생 이름: "+name);
		System.out.println("국어 성적: "+korean);
		System.out.println("영어 성적: "+english);
		System.out.println("수학 성적: "+math);
		System.out.println("총점: "+total);
		System.out.println("평균: "+avg);
		System.out.println("------------------");
	}
	
}
