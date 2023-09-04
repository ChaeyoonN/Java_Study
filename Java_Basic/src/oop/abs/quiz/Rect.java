package oop.abs.quiz;

public class Rect extends Shape {
	//필드
	private int side;
	private int width;
	private int height;
	
	//생성자
	public Rect(String name, int side) {
		super(name);
		this.side = side;
	}
	
	public Rect(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	//메서드
	@Override
	public double getArea() {
		if(side != 0) {
			return side * side;
		}else {
			return width * height;
		}
		
	}


	//필드가 private -> getter/setter 구현 (은닉)
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	

}
