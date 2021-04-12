
class CastingTest{
	public static void main(String [] args){
		//float f1 = (float)365.4; // 365.4는 double 타입이므로 캐스팅 해줘야 함
		float f1 = 365.4F;
		double d1 = 365.4F; // 자료형 손실 일어나지 않음
		
		System.out.printf("f1 : %.2f\n", f1);
		System.out.printf("d1 : %.2f\n", d1);
		
		// 0~5까지의 정수형 난수 생성 0~5까지 개수 : 6을 곱해줌
		System.out.printf("0 이상 5 이하의 정수형 난수: %d\n", (int)(6*Math.random()));
		//10~20까지의 정수형 난수 생성
		System.out.printf("10 이상 20 이하의 정수형 난수: %d\n", (int)(10+11*Math.random()));
		//-10~10까지의 정수형 난수 생성
		System.out.printf("-10 이상 10 이하의 정수형 난수: %d\n", (int)(21*Math.random()-10));
		
		
	}
}