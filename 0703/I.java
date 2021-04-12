import java.util.Scanner;
class I{ // 실행하려면 먼저 Dog 파일부터 컴파일해서 class 파일 만들어야 함
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		// 강아지 한 마리 생성
		Dog myDog = new Dog();
		int foood=0;
		while(true){
			System.out.println("포만감: "+myDog.full);
			
			if(myDog.full>6){
				 myDog.play(); 
				 break;
			}
			else{
				System.out.println("음식을 얼마나 주시겠습니까? ");
				foood = s.nextInt();
				myDog.eat(foood);
		}
		}
			
		
		/*
		System.out.println("생성 직후 포만감: "+myDog.full);
		System.out.println("생성 직후 이름: "+myDog.name);
		myDog.play();
		myDog.eat(5);
		
		Dog yourDog = new Dog(10, "멍멍이");
		System.out.println("멍멍이 생성 직후 포만감: "+yourDog.full);
		System.out.println("멍멍이 생성 직후 이름: "+yourDog.name);
		*/
	}
	
	
}