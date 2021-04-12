class Test2{
	public static void main(String [] args){
		if (args.length!=2){
			System.out.println("사용법 : 두 개의 실수를 입력하세요.");
			return;
		}
		
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double ans = a/b;
		if (ans%1==0) System.out.printf("%f / %f = %x", a, b, (int)ans);
		else System.out.printf("%f / %f = %+.3f", a, b, ans);
		
	}
}