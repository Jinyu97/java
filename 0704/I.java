import java.util.Scanner;
class I{ // 실행하려면 먼저 Dog 파일부터 컴파일해서 class 파일 만들어야 함
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		// 강아지 한 마리 생성
		Dog myDog = new Dog();
		
		myDog.eat("햄버거");
		myDog.eat("피자", 5);
		//myDog.eat(5, "피자"); 는 불가능. Dog 클래스에서 지정한 순서대로 매개변수 줘야 함.
		
		myDog = null; // myDog 삭제
		
	}
	
	
}