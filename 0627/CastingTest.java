
class CastingTest{
	public static void main(String [] args){
		//float f1 = (float)365.4; // 365.4�� double Ÿ���̹Ƿ� ĳ���� ����� ��
		float f1 = 365.4F;
		double d1 = 365.4F; // �ڷ��� �ս� �Ͼ�� ����
		
		System.out.printf("f1 : %.2f\n", f1);
		System.out.printf("d1 : %.2f\n", d1);
		
		// 0~5������ ������ ���� ���� 0~5���� ���� : 6�� ������
		System.out.printf("0 �̻� 5 ������ ������ ����: %d\n", (int)(6*Math.random()));
		//10~20������ ������ ���� ����
		System.out.printf("10 �̻� 20 ������ ������ ����: %d\n", (int)(10+11*Math.random()));
		//-10~10������ ������ ���� ����
		System.out.printf("-10 �̻� 10 ������ ������ ����: %d\n", (int)(21*Math.random()-10));
		
		
	}
}