package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirth my = new MyBirth();
//		my.year = 1992;
		
		my.setYear(1992);
		my.setMonth(10);
		my.setDay(13);
		
		
		
		my.birthInfo();
		
		
		
	}

	
}
