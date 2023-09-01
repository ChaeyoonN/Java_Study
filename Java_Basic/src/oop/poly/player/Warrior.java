package oop.poly.player;

public class Warrior extends Player {
	
	int rage;
	
	//생성자 안 적으면 jvm이 이렇게 써줌. 
	Warrior(String name){
		//모든 생성자에는 super()가 내장되어 있습니다.
		//자식 객체가 생성될 때는 부모의 객체도 생성이 되어야
		//부모의 속성과 기능이 실존하게 되고, 물려줄 수 있기 때문입니다.
		super(name);
		this.rage = 60;
	}
	
	public void rush(Player p) {
		/*
        - 전사의 고유 기능인 rush 메서드를 작성합니다.
        
        - rush의 대상은 모든 직업들 입니다.
        
        - 만약 rush의 대상이 전사라면 10의 피해를 받고,
         마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.
         
        - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.
        
        - 남은 체력도 출력해 주세요.
        
        - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
        */
		System.out.println(this.name+"님이 "+p.name+"님에게 돌진!!!");
		System.out.println("---------------------");
		int damage; String job;
		if(p instanceof Warrior) {//p가 워리어 타입 가질 수 있니
//			p.hp -= 10;
//			System.out.println(p.name+"님이 "+10+"의 피해를 입었습니다. (남은 체력: "
//			+p.hp+")");
			damage = 10; job = "전사";
		}else if(p instanceof Mage) {
//			p.hp -= 20;
//			System.out.println(p.name+"님이 "+20+"의 피해를 입었습니다. (남은 체력: "
//					+p.hp+")");
			damage = 20; job = "마법사";
		}else {
//			p.hp -= 15;
//			System.out.println(p.name+"님이 "+10+"의 피해를 입었습니다. (남은 체력: "
//					+p.hp+")");
			damage = 15; job = "사냥꾼";
		}
		
		p.hp -= damage;//else if라고 하면 초기화 안되는 경우 있다고 판단해 빨간줄 생김.
		System.out.println(p.name+"님("+job+")이 "+damage+"의 피해를 입었습니다. (남은 체력: "
				+p.hp+")");
		System.out.println("=====================================");
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: "+rage);
	}
	
	
}
