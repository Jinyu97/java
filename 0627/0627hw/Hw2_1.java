//-10이상 10이하의 임의의 정수형 난수를 생성하고, 사용자가 입력한 값이 난수와 일치한다면 A, 난수와 절댓값은 같지만 부호는 다르다면 B, 그 외의 경우는 C를 출력하는 프로그램을 작성하시오. 
//단, 사용자는 command line에 정수를 입력한다. 
//사용자가 command line에 하나의 정수를 입력하지 않은 경우 사용법을 알려주고, 프로그램을 종료시킬 것. 
class Hw2_1{
	public static void main(String [] args){
		if(args.length != 1){
			System.out.println("사용법: java HW2_1 -10이상 10이하의 임의의 정수");
			return;
		}
		int usr = Integer.parseInt(args[0]);//사용자가 입력한 값 정수로 변환
		int r = (int)(Math.random()*21-10);//-10이상 10이하의 임의의 정수형 난수를 생성
		
		if(r==usr)	System.out.println("난수와 일치!");
		else if(r==-1*usr)	System.out.println("난수와 부호는 다르나, 절댓값은 같음!");
		else System.out.println("난수와 불일치!");
				
	}
}

		
		