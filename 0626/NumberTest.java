class NumberTest{
	public static void main(String [] args){
		int a = 0b10; // 0b+숫자: 숫자를 이진수로 해석 => 십진수 2
		//int b = 0b73; // 컴파일 불가: 이진수 73은 없음
		int b = 073; // 0+숫자: 숫자를 팔진수로 해석
		int c = 0x1f; // 0x+숫자: 숫자를 16진수로 해석
		int d = 234_569_378; // _는 가독성 높여줌. 몇 자리 단위로 끊어 표현하고 싶을 때 사용(=234569378)
		
		// long type 365 = 365l
		// float type 0.2 = 0.2f로 표시
		
		// b를 8, 10, 16진수 형태로 출력: 몇진수인지 표현해서
		
		System.out.format("%#o %d %#x\n", b, b, b);
		System.out.format("%#o %1$d %1$#x\n", b); // 1$: 첫 번째 변수(b)를 쓰겠다는 의미
		System.out.format("%#8o %8d %#8x\n", b, b, b); // 8칸 확보 후 073, 8칸 확보 후 59, 8칸 확보 후 0x3b(오른쪽 정렬)
		System.out.format("%#-8o %-8d %#-8x\n", b, b, b); // 왼쪽 정렬

		// -: 왼쪽 정렬
		// #: 진수 표현
		// 숫자: 칸 확보


		//System.out.format("%#o\n", b); // b를 8진수로 출력 #:몇진수인지 보여줌
		//System.out.format("%#x\n", c); // c를 16진수로 출력
		/* 정수의 서식지정자
		%d = decimal: 10진수 형태
		%o = octal: 8진수 형태
		%x(%h) = hexadecimal: 16진수 형태
		*/
			
		/*
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		*/
		
	
	}
}