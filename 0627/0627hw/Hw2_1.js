class Hw2_1{
	public static void main(String [] args){
		int ran = (int)(21*Math.random())-10;
		
		int a = Integer.parseInt(args[0]);
		
		if (args.length<1) {
			System.out.println("-10 이상 10 이하의 정수를 입력하세요.");
			return;
		}
		
		if (ran == a) System.out.print("일치\n");
		else if (ran == -a) System.out.print("절댓값만 일치(부호는 다름)\n");
		else System.out.print("불일치\n");
		
	}
}
		
		