// 유효한 나이가 입력될 때까지 반복해서 나이 입력받기
// 유효한 나이 : 0세 이상 200세 이하
// 즉, 0 미만 200 초과의 나이가 입력되면 나이 입력 반복하기

import java.util.Scanner;
class WhileTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int age;
		
		/*
		System.out.print("나이 : ");
		age = s.nextInt();
		while((age<0)||(age>200)){
			System.out.println("[입력 오류] 나이는 0세 이상 200세 이하로");
			System.out.print("나이 : ");
			age = s.nextInt();
			
		}
		System.out.printf("입력한 나이는 %d세입니다.",age);
	*/
		
	/*
		do{
			System.out.print("나이 : ");
			age = s.nextInt();
			if((age<0)||(age>200)) System.out.println("[입력 오류] 나이는 0세 이상 200세 이하로");
		}while((age<0)||(age>200));
		System.out.printf("입력한 나이는 %d세입니다.",age);
		
		*/
		
		/*
		while(true){
			System.out.print("나이 : ");
			age = s.nextInt();
			if((age>=0)&&(age<=200)) break;
			System.out.println("[입력 오류] 나이는 0세 이상 200세 이하로");
		}
		
		System.out.printf("입력한 나이는 %d세입니다.",age);
		
		*/
		
		System.out.print("나이 : ");
		age = s.nextInt();
		for( ; age<0||age>200; ){
			System.out.println("[입력 오류] 나이는 0세 이상 200세 이하로");
			System.out.print("나이 : ");
			age = s.nextInt();
		}
		System.out.printf("입력한 나이는 %d세입니다.",age);
		
		
		/*
		1. while(반복조건){
			반복할 내용
			}
			
		2. do{
			반복할 내용
			}while(반복조건);
			
		3. 무한반복(무한루프) 사용
			while(true){
				반복내용
				if() break;
			}
			
		4. for(;반복조건;){
			반복내용
			}
			
			*/
		
		
		
	}
}