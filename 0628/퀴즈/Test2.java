class Test2{
	public static void main(String [] args){
		if (args.length!=2){
			System.out.println("���� : �� ���� �Ǽ��� �Է��ϼ���.");
			return;
		}
		
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double ans = a/b;
		if (ans%1==0) System.out.printf("%f / %f = %x", a, b, (int)ans);
		else System.out.printf("%f / %f = %+.3f", a, b, ans);
		
	}
}