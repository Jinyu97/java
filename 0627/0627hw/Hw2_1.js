class Hw2_1{
	public static void main(String [] args){
		int ran = (int)(21*Math.random())-10;
		
		int a = Integer.parseInt(args[0]);
		
		if (args.length<1) {
			System.out.println("-10 �̻� 10 ������ ������ �Է��ϼ���.");
			return;
		}
		
		if (ran == a) System.out.print("��ġ\n");
		else if (ran == -a) System.out.print("���񰪸� ��ġ(��ȣ�� �ٸ�)\n");
		else System.out.print("����ġ\n");
		
	}
}
		
		