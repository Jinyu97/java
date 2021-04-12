class MethodTest{
	public static void main(String [] args){
		int x=2, y=7;
		System.out.printf("%d와 %d의 합은 %d입니다.\n", x, y, sum(x,y));
		//System.out.println(sum(2, 7));
		// 같은 클래스 안에 있으므로 MethodTest mt = new MethodTest(); mt.sum(2,5); 안 해도 됨
		
		tvWork("음악");
		System.out.println("내가 자판기에서 받은 것: "+vendingWork("포카리스웨트"));
		
		System.out.println(sum(4.4, 76.4, 90.1,4.4, 76.4, 90.1,4.4, 76.4, 90.1,4.4, 76.4, 90.1,4.4, 76.4, 90.1));
		
		
	}

	// 아래 두 개의 메소드는 중복정의(overload)가 불가능: 메소드 시그니처(메소드명 + 매개변수)가 똑같기 때문
	
	// sum() 메소드는 합만 구하고 메인에서 자유자재로 합을 이용하고 싶음
	static int sum(int a, int b){ // a=2, b=7
		return a+b;
	}
	
	
	/*
	// 메인이 static이므로 메소드도 static 붙여줌	
	static void sum(int a, int b){ //메소드 정의
		System.out.println(a+b);
		//return 없으므로 void
	}
		
	*/	
	
	static void tvWork(String channel){
		System.out.println(channel+" 프로그램을 재생합니다.");
	}
	
	static String vendingWork(String drink){
		return drink;
	} 
	
	
	// 매개변수는 실수 타입, 인자가 몇 개인지는 지정하지 않음, 합을 반환하는 sum() 메소드: 가변 길이 인수
		
		static double sum(double... d){ // sum(2,3,4) => d = 2, 3, 4 : 배열처럼 취급
			double sum = 0;
			for(double elt:d){ // d의 원소가 차례로 elt에 복사됨
				sum += elt;
			}
			return sum;
		}
		
	
	
	
	
}/* tvWork(){} //매개변수: 채널, 반환타입: void, 채널을 보여줌
	vendingWork(){} //매개변수: 음료수이름, 반환타입: 음료수, 음료수를 배출하는 일
	*/