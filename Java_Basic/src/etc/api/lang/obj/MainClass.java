package etc.api.lang.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Person park = new Person("박영희", 25);
		Person hong = new Person("홍길동", 25);
		
//		park.personInfo();
//		hong.personInfo();
			
		//객체 타입의 변수를 출력하거나 값을 얻을 때는
		//뒤에 자동으로 toString()이 붙어서 진행됩니다.
		System.out.println(park.toString());
		System.out.println(hong.toString());
		System.out.println(park);
		System.out.println(hong);
		//원래는 주소값 나오도록 Object에서 정의됨. -> toString()을 오버라이딩해서 사용 가능.
		
		if(hong.equals(park)) {
			System.out.println("이름과 나이가 같네요!");
		}else {
			System.out.println("이름이 다를 수도, 나이가 다를 수도, 둘 다 다를 수도...");
		}

		//finalize()는 gc가 호출되는 순서가 보장되지 않기 때문에 
		//사용이 권장되지 않습니다. (deprecated)
//		hong = null;
//		park = null;
//		System.gc(); //가비지 컬렉터를 호출. (부른다고 바로 안 올 수도 있습니다.)
		
		Person kim = new Person("김복제인간", 100);
		try {
			Person clonePerson = (Person) kim.clone();
			System.out.println("복사된 객체 정보: "+clonePerson);//toString()생략된거
			System.out.println("kim의 주소: "+kim.hashCode());
			System.out.println("복사된 객체 주소: "+clonePerson.hashCode());
			//hashCode() 오버라이딩 해서 같은 주소값 됨.
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
