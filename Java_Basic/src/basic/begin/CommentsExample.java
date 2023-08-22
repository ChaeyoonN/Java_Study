package basic.begin;

/**
 * 문서 생성용 주석입니다.
 * 배포용 문서에 설명을 달아놓을 때 사용합니다.
 * 문서에 대한 설명 뿐만 아니라, 함수(메서드)의 사용 방법 등을
 * 설명하는 데에도 사용합니다.
 * @author Nam
 * @version 1.0
 * @since 2023.08.22 ~
 * @param
*/
// 이 파일은 주석을 연습하는 파일입니다.
public class CommentsExample {
	// /+*+enter : 여러 줄 주석
	/*
	 # main 함수(메서드)는 프로그램 시행 시 자동으로 동작하는 함수이며,
	 반드시 필요한 함수입니다.
	 
	 # 자바코드를 해석하여 실행시키는 자바 가상 머신은(jvm)은
	 프로그램 실행 시 자동으로 main 함수를 불러서 내부의 코드를
	 실행시킵니다.
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//sysout + ctrl + space: 빠른 출력함수를 생성
		//ctrl+F11: 실행 단축키
		//원하는 위치에 커서 배치 후 ctrl+/: 빠른 주석 처리, 해제
		System.out.println("안녕하세요~");
		System.out.println("반갑습니다~");

	}

}
