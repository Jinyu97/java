import java.util.Scanner;

class I{
	public static void main(String [] args){
		Scanner myScanner = new Scanner(System.in); //키보드로부터 값을 읽어오는 스캐너 생성
		//System.in = 표준 입력: 키보드
		
		/*
		String name; //사용자가 입력한 이름을 저장할 변수(메모리 공간)
		

		System.out.print("이름: "); //개행 없음
		name = myScanner.nextLine(); //커맨드라인에서 한 라인 읽어옴
		
		//사용자에게 키, 나이 입력받고 그대로 출력하기
		double height; // 키를 저장할 변수(메모리 공간) 확보
		int age; //나이를 저장할 변수 확보
		
		System.out.print("키: ");
		height = myScanner.nextDouble(); //실수 하나 읽어옴
		System.out.print("나이: ");
		age = myScanner.nextInt(); //정수 하나 읽어옴
		
		
		System.out.printf("당신의 이름은 %s, 키는 %f, 나이는 %d입니다.\n", name, height, age);
 		*/
		
		
		
		//전화번호(String 타입), 학년, 학점
		String phone;
		int grade;
		double score;
		System.out.print("전화번호: ");
		phone = myScanner.nextLine();
		System.out.print("학년: ");
		grade = myScanner.nextInt();
		System.out.print("학점: ");
		score = myScanner.nextDouble();
		System.out.printf("당신의 전화번호는 %s, 학년은 %d, 학점은 %f입니다.\n", phone, grade, score);
		
		/*
		System.out.printf("나는 전자공학부 수석 문효진입니다."); //printf: 개행 없음
		System.out.println("나는 전자공학부 수석 문효진입니다."); //println: 개행
		System.out.format("나는 전자공학부 수석 문효진입니다."); //printf와 유사(개행 없음)
		System.out.println(3875242+4541344); //형식 지정 안 함
		System.out.printf("%d\n", 3875242+4541344); //printf에서 f는 format(형식)을 지정하겠다는 의미
		//3875242+4541344
		//System.out = 표준 출력:모니터
		//이름(문자열), 키(실수), 나이(정수)를 서식 지정하여 출력
		System.out.printf("이름: %s, 키: %f, 나이: %d\n", "이유진", 180.5, 152); */
	}
} //파일명.java