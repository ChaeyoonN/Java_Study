package oop.poly.player;

public class Mage extends Player {

	int mana;//필드
	
	//생성자
	Mage(String name){
		super(name);
		this.mana = 100;
	}
	
	
	//메서드
	public void blizzard(Player[] p) {//가변인수 써도 됌.
		
		System.out.println(this.name+"님이 눈보라 시전!!!");
		this.mana -= 30;
		System.out.println("30의 마나가 소모됩니다. 남은 정신력: "+this.mana);
		System.out.println("----------------------");
		
		for(int i=0; i<p.length; i++) {//향상 for문 써도 됌.
			int damage = (int)(Math.random()*6)+10;
			p[i].hp -= damage;
			System.out.println(p[i].name+"님이 "+damage+"의 피해를 입었습니다. (남은 체력: "+
			(p[i].hp)+")");
		}
		
		
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 정신력: "+mana);
	}
	
	
}
