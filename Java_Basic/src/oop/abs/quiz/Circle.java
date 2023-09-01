package oop.abs.quiz;

public class Circle extends Shape {

	//필드
	int radius;
	
	
	
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
	

}
