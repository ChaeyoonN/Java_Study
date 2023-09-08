package etc.api.io.bufferd;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BufferedQuiz {

	public static void main(String[] args) {

		/*
        1. LocalDate클래스를 이용해서 file폴더 내에 하위 경로로
         오늘 날짜 20230908file 이라는 이름으로 폴더를 생성하세요.
        2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
        3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
         파일을 작성합니다. 
         (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
          연결해 주시면 됩니다.)
               각 문장은 줄 개행을 포함합니다.
        4. '그만'으로 파일이 작성되었다면, 아무 방법으로나 
         파일을 읽어서 콘솔에 출력해 보세요.
        */
		Scanner sc = new Scanner(System.in);
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		//날짜 포맷 변경하기
		DateTimeFormatter dtf 
		= DateTimeFormatter.ofPattern("yyyyMMdd");
		System.out.println(now.format(dtf));
		
		File file = new File("C:/Mywork/"+now.format(dtf)+"file");
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
	
		
		if(!file.exists()) {
			file.mkdir();
			
			System.out.print("생성할 파일명 입력:");
			String name = sc.next();
			sc.nextLine();
			try {
				fos = new FileOutputStream(file+"/"+name+".txt");
				bos = new BufferedOutputStream(fos);
			
				StringBuilder text = new StringBuilder();
				System.out.print("파일내용 입력 (\"그만\" 입력 시 종료): ");
				
				for(;;) {
					
					String content = sc.nextLine();
					
					if(content.equals("그만")) {
						break;
					}
					
					text.append(content+"\r\n");//내용 추가
				}
				
				
				byte[] data = new String(text).getBytes();
				for(byte b : data) {
					bos.write(b);
				}
				System.out.println("작성 완료!");
				
				//파일을 읽어서 콘솔에 출력
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {				
					bos.close();
					fos.close(); //파일 작성 후 close()까지 진행해야 읽기가 가능!
					sc.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			FileReader fr = null;
			BufferedReader br = null;
							
			try {
				fr = new FileReader(file+"/"+name+".txt");
				br = new BufferedReader(fr);
				
				String str;
				while((str = br.readLine())!= null) {
					System.out.println(str);
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
			
		}else {
			System.out.println("해당 폴더가 존재합니다.");
		}
		
		

		
		

	}

}
