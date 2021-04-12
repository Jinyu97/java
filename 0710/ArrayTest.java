import java.util.Scanner;
class ArrayTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		// int [] scores = {50, 10, 20, 70, 80}; //������ ������ ��Ȳ: {}�� �ʱ�ȭ
		
		int [] scores = new int[5];
		int sum=0;
		for(int i=0; i<scores.length; i++){
			System.out.print("�л� "+(i+1)+"�� ����: ");
			scores[i] = s.nextInt();
			sum += scores[i];
		}
		
		System.out.println("���: "+(double)sum/scores.length);
		System.out.println();
		
		
		
		
		// �ڵ����� �迭
		Car [] myCars = {new Car("���", 2013), new Car("�ƹݶ�", 2018),new Car("���", 2013), new Car("�ƹݶ�", 2018),new Car("����", 2018)};
		
		//�ڵ��� 5���� �̸� ���
		//for������
		for(int i=0; i<myCars.length; i++){
			System.out.print(myCars[i].name+"\t");
		}
		System.out.println();
		
		//for-each������ => for(�迭 ���Ҹ� �ϳ� ������ ���� ����:�迭��){�ݺ��ҳ���}
		for(Car myCar: myCars){ 
		// for-each��: ���� �ڷ��� �迭 ���� ���� �Ұ�, Car�� ���� �ڷ����̹Ƿ� �迭�� ����
		// ���� ����
			myCar.year = 2015;
		}
		
		for(Car myCar: myCars){
			System.out.print(myCar.year+"\t");
		}
		
		System.out.println();		
		
		
		// for��: �Ϻ� ���е鿡�Ը� ���� ��ų �� ����, �迭 ũ�⸦ �˾ƾ� ��
		// for-each��: ��� ���е鿡�� �� ���Ѿ߸� ��, �迭 ũ�⸦ ���� ��
		
		
		
		/*
		Car [] myCars = new Car[5]; //�ڵ��� 5�븦 ���� �� �ִ� ����. �ڵ����� ���� ����
		// myCars[0].year; ���� ��Ȳ���� �� ��
		myCars[0] = new Car("���", 2013);
		myCars[1] = new Car("�ƹݶ�", 2018);
		myCars[2] = new Car("���", 2013);
		myCars[3] = new Car("�ƹݶ�", 2018);
		myCars[4] = new Car("����", 2018);

		*/
	}
}


class Car{
	String name;
	int year;
	Car(){}
	Car(String name, int year){
		this.name = name;
		this.year = year;
	}
	
}