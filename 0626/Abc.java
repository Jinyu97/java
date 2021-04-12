import java.util.Scanner;
// Scanner 클래스는 자바에서 기본적으로 제공: 스캔 용도
// java.util이라는 패키지 안에 Scanner 클래스가 존재
// 패키지=폴더
// 식별자 관례 : ⓐ클래스명은 대문자로 시작, 메소드, 변수명은 소문자로 시작
// ⓑnextInt: next와 int의 조합 <= 여러 문자의 조합으로 식별자를 만들 경우, 각 단어의 첫 문자는 대문자로(메소드-첫글자 소문자, 클래스-첫글자도 대문자)
// Day1 강의자료 p33 참고

class Abc{
	public static void main(String [] args){
		// 자료형 변수명 = 값; = 변수 선언+초기화(값을 처음으로 대입)
		char c = '밥'; // c: 2바이트에 밥이 이진수로 저장됨
		
		boolean b = true;
		boolean b1 = 2>3; // b1=false
		
		Scanner S = new Scanner(System.in); // 참조자료형: 메모리에 주소값이 저장(S라는 스캐너가 heap에 생성되고, 메모리 상 4바이트에 스캐너의 주소가 실림)
		
		// 자료형 변수이름(식별자); = 변수 선언
		int jeongsu; // 메모리상에 정수를 저장할 수 있는 공간이 4바이트 확보되고 그 메모리 공간의 이름을 jeongsu라고 붙여줌: 추후에 저장된 값은 정수로 해석!
		String moonjayeol;
		double silsu; // 8바이트 확보
		
		
		/* 기초 자료형: 메모리에 값이 직접 저장됨(색깔 변하는 자료형)
		 -정수형: int(4바이트), byte(1바이트), short(2바이트), long(4바이트 이상): 표현 가능한 수의 범위가 달라짐
		 -실수형: double(8바이트, 유효숫자 소수점 아래 15~16자리 표현가능), float(4바이트, 7~8자리): 정밀도
		 -문자형: char 문자 하나 저장 가능('a', '가', '馬'...) : 2바이트
		 -논리형: boolean(true, false) : 1바이트
		 */
		
		//byte overflow = -300; // byte 타입은 -128~127까지 표현 가능하고 이 범위를 넘어서는 값은 제대로 표현 불가: overflow(컴파일 에러)
		
		//underflow: 실수형에서 정밀도를 상실
		
		
		System.out.println(b+"\t"+b1);
		
		System.out.print("정수: ");
		jeongsu = S.nextInt(); // 스캐너에게 정수 하나 읽어달라고 요청
	
		System.out.print("실수: "); // 정수 입력하고 남은 엔터는 무시
		silsu = S.nextDouble(); // 엔터가 메모리상에 남아 있음
		S.nextLine(); // 엔터 가져감(안 가져가면 아래의 nextLine이 엔터를 읽어서 강제 입력 종료)
	
		System.out.print("문자열: ");
		moonjayeol = S.nextLine(); // 스캐너에게 한 라인 읽어달라고 요청
		//moonjayeol = S.next();
	
		//System.out.printf("입력 정수: %d\n입력 문자열: %s\n입력 실수: %f\n",jeongsu, moonjayeol, silsu);
		System.out.println("입력 정수: "+jeongsu+", 입력 문자열: "+moonjayeol+", 입력 실수: "+silsu); // 서식지정자는 printf, format에서만 사용가능하므로 println에서는 +로 연결
		System.out.format("입력 정수: %d\n입력 문자열: %s\n입력 실수: %.3f\n",jeongsu, moonjayeol, silsu); // 실수 소숫점 아래 자리 수 결정 -> %.3f
		System.out.print("abc\b"+"def\t"+"ghi\n"); //-> abcdef 문자열 연결
		/* 제어문자: 모든 출력메소드에서 사용가능
		\n: 개행
		\t: 탭만큼 간격 띄움
		\b: 커서 한 칸 앞으로 이동 
		\r: 커서 맨 앞 칸으로 이동 */
		System.out.print("경북\b대\n"); // 경대: 북 자리에 커서가 오고 대를 입력하므로 북이 사라짐
		System.out.print("경북\b\n"); // 경북
		System.out.print("경북\r대\n"); // 대북
	
	}
}