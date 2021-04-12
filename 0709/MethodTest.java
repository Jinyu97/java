class MethodTest{
	public static void main(String [] args){
		int x=2, y=7;
		System.out.printf("%d�� %d�� ���� %d�Դϴ�.\n", x, y, sum(x,y));
		//System.out.println(sum(2, 7));
		// ���� Ŭ���� �ȿ� �����Ƿ� MethodTest mt = new MethodTest(); mt.sum(2,5); �� �ص� ��
		
		tvWork("����");
		System.out.println("���� ���Ǳ⿡�� ���� ��: "+vendingWork("��ī������Ʈ"));
		
		System.out.println(sum(4.4, 76.4, 90.1,4.4, 76.4, 90.1,4.4, 76.4, 90.1,4.4, 76.4, 90.1,4.4, 76.4, 90.1));
		
		
	}

	// �Ʒ� �� ���� �޼ҵ�� �ߺ�����(overload)�� �Ұ���: �޼ҵ� �ñ״�ó(�޼ҵ�� + �Ű�����)�� �Ȱ��� ����
	
	// sum() �޼ҵ�� �ո� ���ϰ� ���ο��� ��������� ���� �̿��ϰ� ����
	static int sum(int a, int b){ // a=2, b=7
		return a+b;
	}
	
	
	/*
	// ������ static�̹Ƿ� �޼ҵ嵵 static �ٿ���	
	static void sum(int a, int b){ //�޼ҵ� ����
		System.out.println(a+b);
		//return �����Ƿ� void
	}
		
	*/	
	
	static void tvWork(String channel){
		System.out.println(channel+" ���α׷��� ����մϴ�.");
	}
	
	static String vendingWork(String drink){
		return drink;
	} 
	
	
	// �Ű������� �Ǽ� Ÿ��, ���ڰ� �� �������� �������� ����, ���� ��ȯ�ϴ� sum() �޼ҵ�: ���� ���� �μ�
		
		static double sum(double... d){ // sum(2,3,4) => d = 2, 3, 4 : �迭ó�� ���
			double sum = 0;
			for(double elt:d){ // d�� ���Ұ� ���ʷ� elt�� �����
				sum += elt;
			}
			return sum;
		}
		
	
	
	
	
}/* tvWork(){} //�Ű�����: ä��, ��ȯŸ��: void, ä���� ������
	vendingWork(){} //�Ű�����: ������̸�, ��ȯŸ��: �����, ������� �����ϴ� ��
	*/