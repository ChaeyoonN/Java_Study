package oop.abs.good;

public class SeoulStore extends HeadStore {

	@Override
	public void orderApple() {
		System.out.println("사과 쥬스의 가격은 3000원입니다.");
		
	}

	@Override
	public void orderBanana() {
		System.out.println("바나나 쥬스의 가격은 3500원입니다.");
		
	}

	@Override
	public void orderGrape() {
		System.out.println("포도 쥬스의 가격은 2500원입니다.");
		
	}

}
