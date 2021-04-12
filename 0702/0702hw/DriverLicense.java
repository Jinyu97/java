import java.util.Scanner;

class DriverLicense{
	public static void main(String [] args){	
		Scanner s = new Scanner(System.in);
		String type, pass;
		int score;
		
		System.out.print("몇 종?");
		type = s.nextLine();
		
		System.out.print("몇 점?");
		score = s.nextInt();
		//if 버전
		//if(type == "1종")과 같이 작성하면 주소 비교가 되므로 안됨! 아래와 같이 작성해야 함. 
		if(type.equals("1종")){
			if(score>=70) pass = "합격";
			else  pass = "불합격";
		}else if(type.equals("2종")){
			if(score>=60) pass = "합격";
			else  pass = "불합격";
		}else{
			System.out.println("[입력오류]1종/2종만 입력해주세요.");
			return; //입력이 잘못된 경우는 오류 메시지 출력후 종료!
		}
		
		System.out.println(pass);
		
		
		//switch버전
		/*
		
		switch(type){
			case "1종":
				if(score>=70) pass = "합격";
				else  pass = "불합격";
				break;
			case "2종":
				if(score>=60) pass = "합격";
				else  pass = "불합격";
				break;
			default: 
				System.out.println("[입력오류]1종/2종만 입력해주세요.");
				return; 
		}
		
		System.out.println(pass);
		
		
		*/
	
	}
}