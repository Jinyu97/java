//파일 읽기
/* 이름 학년 학점
  홍길동 4   4.3
  장발장 6   2.7
  둘리   3   4.0
  */
  
import java.io.*;
import java.util.Scanner; //입력 스트림

class ScannerTest{
	public static void main(String [] args){
		String name;
		int grade;
		double score;
		
		
		//읽을 파일 객체 생성
		File std = new File("std.txt");
		
		//내가 읽으려는 파일이 실제로 존재하는지 판단 후 처리
		if(std.exists()==false){
			System.out.println("해당 파일이 존재하지 않습니다.");
			System.exit(0); //매개변수로 임의의 정수 넣으면 됨. 또는 return;
		}
		
		
		try{ // 아래에서 예외발생
			//존재하는 경우에는 파일에서 자료 읽고 모니터에 출력
			Scanner s = new Scanner(std); //파일에 입력 스트림 연결
			//cf) System.in=키보드: 표준 입력
			System.out.println("파일 내용: ");
		
			//파일에서 자료 읽기: 파일에 자료가 존재하는 동안에는 계속해서 읽기 작업
			while(s.hasNext()){
				//hasNext(): 스캐너에서 더 읽어 올 것이 있다면 true, 없다면 false 반환
				name = s.next();
				grade = s.nextInt();
				score = s.nextDouble();
				System.out.printf("이름: %s, 학년: %d, 학점: %.1f", name, grade, score);
				System.out.println();
			}
			
		
			//스트림 닫기
			s.close();
			
		}catch(FileNotFoundException fnfe){
			System.err.println("FileNotFoundException 발생하여 프로그램을 종료합니다."); //System.out.println으로 해도 됨
		}
		
		
	}
}