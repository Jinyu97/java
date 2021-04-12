// 커맨드라인에서 사용자의 이름과 나이, 평점(실수: 3.7...) 입력받아, ***님의 10년 후 나이는 ***세, 평점은 **입니다. 출력
class CommandLineTest{
	public static void main(String [] args){
		// 사용자가 커맨드라인에 2개의 인자를 작성하지 않은 경우 조치 사항
		if(args.length<3){
			System.out.println("Usage: java CommandLineTest 이름 나이 평점");
			return; // 프로그램 종료
		}
		
		// 홍길동 5 : args[0]="홍길동", args[1]="5"
		// "5"+10
		// "5" -> 5
		int age = Integer.parseInt(args[1]); // java.lang 패키지에 Integer 클래스 존재
		// 랩퍼(wrapper) 클래스 : Integer, Double, Byte, ...
		double score = Double.parseDouble(args[2]);
		System.out.printf("%s님의 10년 후 나이는 %d세, 평점은 %.1f입니다.\n", args[0], 10+age, score);
		
	}
}