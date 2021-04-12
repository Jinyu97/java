// Runtime 예외는 try-catch가 아니더라도 코드에서 적절히 예외가 발생하는 경우를 처리할 수 있음

import java.util.*; 
class AgeInput3{
	public static void main(String [] args) {
	
		try{
			ageInput();
		}catch(NegativeAgeException nae){
			//System.out.println("[예외 발생] 나이를 음수로 입력했습니다."); 
			//nae.printStackTrace();
			System.out.println(nae.getMessage()); //음수 나이 예외 메시지 출력
		}catch(TooMuchAgeException tmae){
			System.out.println(tmae.getMessage());
		}
	}
	
	static void ageInput() throws NegativeAgeException, TooMuchAgeException{
		int age;
		
		Scanner s = new Scanner(System.in);
	
		System.out.print("나이를 숫자로 입력해주세요: ");
		age = s.nextInt();
		
		if(age<0) throw new NegativeAgeException();
		if(age>=200) throw new TooMuchAgeException();
		
		System.out.format("당신의 나이는 %d세입니다.\n", age);
		
		
		
	}
}

// 사용자 정의 예외: 음수 나이 예외: 사용자가 나이를 음수로 입력할 경우 발생되는 예외
class NegativeAgeException extends Exception{
	NegativeAgeException(){
		super("음수 나이 예외");
	}
	
}

class TooMuchAgeException extends Exception{
	TooMuchAgeException(){
		super("200세 이상 나이 예외");
	}
}