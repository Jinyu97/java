// 파일 복사 프로그램
// FileTest.java를 복사하는 프로그램 작성하기
// 복사본 파일명은 copy.java
// FileTest.java: println()---> HELLO로 바꿔서 copy.java에 저장

import java.io.*;
import java.util.Scanner;

class CopyTest{
	public static void main(String [] args){
		File copy = new File("copy.java");
		File original = new File("FileTest.java");
		
		if(!(original.exists())){
			System.out.println("원본 파일이 존재하지 않아 복사 프로그램을 종료합니다.");
			System.exit(0);
		}
		if(copy.exists()){
			System.out.println("복사본 파일이 이미 존재하여 복사 프로그램을 종료합니다.");
			System.exit(1);
		}
		
		//System.out.println("ABc ABCD ABCDE".replaceAll("ABC", "Z"));
		
		try{
			Scanner s = new Scanner(original);
			PrintWriter pw = new PrintWriter(copy);
		
			//replaceAll("구단어", "신단어")
			while(s.hasNext()){
				pw.println((s.nextLine()).replaceAll("println","HELLO"));
			}
			
			s.close();
			pw.close();
			
			System.out.println("파일 복사 완료! 폴더를 확인하세요.");
			

		}catch(Exception e){ //Exception: 모든 예외의 부모클래스
			e.printStackTrace(); //예외가 발생한 당시의 stack을 추적해서 출력해달라고 요청하기
			
		}
		
	}
	
}