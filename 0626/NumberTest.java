class NumberTest{
	public static void main(String [] args){
		int a = 0b10; // 0b+����: ���ڸ� �������� �ؼ� => ������ 2
		//int b = 0b73; // ������ �Ұ�: ������ 73�� ����
		int b = 073; // 0+����: ���ڸ� �������� �ؼ�
		int c = 0x1f; // 0x+����: ���ڸ� 16������ �ؼ�
		int d = 234_569_378; // _�� ������ ������. �� �ڸ� ������ ���� ǥ���ϰ� ���� �� ���(=234569378)
		
		// long type 365 = 365l
		// float type 0.2 = 0.2f�� ǥ��
		
		// b�� 8, 10, 16���� ���·� ���: ���������� ǥ���ؼ�
		
		System.out.format("%#o %d %#x\n", b, b, b);
		System.out.format("%#o %1$d %1$#x\n", b); // 1$: ù ��° ����(b)�� ���ڴٴ� �ǹ�
		System.out.format("%#8o %8d %#8x\n", b, b, b); // 8ĭ Ȯ�� �� 073, 8ĭ Ȯ�� �� 59, 8ĭ Ȯ�� �� 0x3b(������ ����)
		System.out.format("%#-8o %-8d %#-8x\n", b, b, b); // ���� ����

		// -: ���� ����
		// #: ���� ǥ��
		// ����: ĭ Ȯ��


		//System.out.format("%#o\n", b); // b�� 8������ ��� #:���������� ������
		//System.out.format("%#x\n", c); // c�� 16������ ���
		/* ������ ����������
		%d = decimal: 10���� ����
		%o = octal: 8���� ����
		%x(%h) = hexadecimal: 16���� ����
		*/
			
		/*
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		*/
		
	
	}
}