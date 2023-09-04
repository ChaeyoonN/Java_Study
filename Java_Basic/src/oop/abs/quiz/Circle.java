package oop.abs.quiz;

public class Circle extends Shape {

	//필드
	private int radius;
	
	
	
	//생성자
//	public Circle() {
//		// TODO Auto-generated constructor stub
//	}
	public Circle(String name, int r) {
		super(name);
		this.radius = r;
	}

	
	//메서드
	@Override
	public double getArea() {
		
		return radius * radius * Math.PI;
	}


	//필드 private -> getter/setter 구현 (은닉)
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	

}
