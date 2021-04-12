//파일에 쓰기

import java.io.*;

//abc.txt 파일에 Hello, World! 출력하기

class PrintWriterTest{ //파일 출력
	public static void main(String [] args){ 
	
		//현재 폴더 안에 abc.txt가 생성됨(있으면 그 파일 사용)
		//파일에 출력 스트림(정보가 이동하는 경로)을 연결
		//PrintWriter=출력 스트림을 abc 객체에 연결
		//파일에 쓰기
		//모니터(System.out)에 쓰기
		//스트림 닫기: 안 닫으면 다른 것들이 이 파일에 접근할 수 없음
		
		try{
		File abc = new File("abc.txt"); 
		PrintWriter pw = new PrintWriter(abc, "abcs"); //이 생성자를 쓸 때는 두 가지 예외가 발생할 수 있으므로
		pw.println("Hello, World!");
		System.out.println("파일 출력 완료");
		pw.close();
		}catch(FileNotFoundException e){
			return;
		}catch(UnsupportedEncodingException ue){
			return;
		} //두 예외 모두 잡아줘야 함
	
	}
}