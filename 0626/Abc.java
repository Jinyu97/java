import java.util.Scanner;
// Scanner Ŭ������ �ڹٿ��� �⺻������ ����: ��ĵ �뵵
// java.util�̶�� ��Ű�� �ȿ� Scanner Ŭ������ ����
// ��Ű��=����
// �ĺ��� ���� : ��Ŭ�������� �빮�ڷ� ����, �޼ҵ�, �������� �ҹ��ڷ� ����
// ��nextInt: next�� int�� ���� <= ���� ������ �������� �ĺ��ڸ� ���� ���, �� �ܾ��� ù ���ڴ� �빮�ڷ�(�޼ҵ�-ù���� �ҹ���, Ŭ����-ù���ڵ� �빮��)
// Day1 �����ڷ� p33 ����

class Abc{
	public static void main(String [] args){
		// �ڷ��� ������ = ��; = ���� ����+�ʱ�ȭ(���� ó������ ����)
		char c = '��'; // c: 2����Ʈ�� ���� �������� �����
		
		boolean b = true;
		boolean b1 = 2>3; // b1=false
		
		Scanner S = new Scanner(System.in); // �����ڷ���: �޸𸮿� �ּҰ��� ����(S��� ��ĳ�ʰ� heap�� �����ǰ�, �޸� �� 4����Ʈ�� ��ĳ���� �ּҰ� �Ǹ�)
		
		// �ڷ��� �����̸�(�ĺ���); = ���� ����
		int jeongsu; // �޸𸮻� ������ ������ �� �ִ� ������ 4����Ʈ Ȯ���ǰ� �� �޸� ������ �̸��� jeongsu��� �ٿ���: ���Ŀ� ����� ���� ������ �ؼ�!
		String moonjayeol;
		double silsu; // 8����Ʈ Ȯ��
		
		
		/* ���� �ڷ���: �޸𸮿� ���� ���� �����(���� ���ϴ� �ڷ���)
		 -������: int(4����Ʈ), byte(1����Ʈ), short(2����Ʈ), long(4����Ʈ �̻�): ǥ�� ������ ���� ������ �޶���
		 -�Ǽ���: double(8����Ʈ, ��ȿ���� �Ҽ��� �Ʒ� 15~16�ڸ� ǥ������), float(4����Ʈ, 7~8�ڸ�): ���е�
		 -������: char ���� �ϳ� ���� ����('a', '��', 'ة'...) : 2����Ʈ
		 -����: boolean(true, false) : 1����Ʈ
		 */
		
		//byte overflow = -300; // byte Ÿ���� -128~127���� ǥ�� �����ϰ� �� ������ �Ѿ�� ���� ����� ǥ�� �Ұ�: overflow(������ ����)
		
		//underflow: �Ǽ������� ���е��� ���
		
		
		System.out.println(b+"\t"+b1);
		
		System.out.print("����: ");
		jeongsu = S.nextInt(); // ��ĳ�ʿ��� ���� �ϳ� �о�޶�� ��û
	
		System.out.print("�Ǽ�: "); // ���� �Է��ϰ� ���� ���ʹ� ����
		silsu = S.nextDouble(); // ���Ͱ� �޸𸮻� ���� ����
		S.nextLine(); // ���� ������(�� �������� �Ʒ��� nextLine�� ���͸� �о ���� �Է� ����)
	
		System.out.print("���ڿ�: ");
		moonjayeol = S.nextLine(); // ��ĳ�ʿ��� �� ���� �о�޶�� ��û
		//moonjayeol = S.next();
	
		//System.out.printf("�Է� ����: %d\n�Է� ���ڿ�: %s\n�Է� �Ǽ�: %f\n",jeongsu, moonjayeol, silsu);
		System.out.println("�Է� ����: "+jeongsu+", �Է� ���ڿ�: "+moonjayeol+", �Է� �Ǽ�: "+silsu); // ���������ڴ� printf, format������ ��밡���ϹǷ� println������ +�� ����
		System.out.format("�Է� ����: %d\n�Է� ���ڿ�: %s\n�Է� �Ǽ�: %.3f\n",jeongsu, moonjayeol, silsu); // �Ǽ� �Ҽ��� �Ʒ� �ڸ� �� ���� -> %.3f
		System.out.print("abc\b"+"def\t"+"ghi\n"); //-> abcdef ���ڿ� ����
		/* �����: ��� ��¸޼ҵ忡�� ��밡��
		\n: ����
		\t: �Ǹ�ŭ ���� ���
		\b: Ŀ�� �� ĭ ������ �̵� 
		\r: Ŀ�� �� �� ĭ���� �̵� */
		System.out.print("���\b��\n"); // ���: �� �ڸ��� Ŀ���� ���� �븦 �Է��ϹǷ� ���� �����
		System.out.print("���\b\n"); // ���
		System.out.print("���\r��\n"); // ���
	
	}
}