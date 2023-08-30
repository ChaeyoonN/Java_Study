package oop.this_super;

public class Mage extends Player {

	int mana;//필드
	
	//생성자
	Mage(String name){
		super(name);
		this.mana = 100;
	}
	
	
	//메서드
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 정신력: "+mana);
	}
	
	
}
