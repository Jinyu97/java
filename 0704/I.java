import java.util.Scanner;
class I{ // �����Ϸ��� ���� Dog ���Ϻ��� �������ؼ� class ���� ������ ��
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		// ������ �� ���� ����
		Dog myDog = new Dog();
		
		myDog.eat("�ܹ���");
		myDog.eat("����", 5);
		//myDog.eat(5, "����"); �� �Ұ���. Dog Ŭ�������� ������ ������� �Ű����� ��� ��.
		
		myDog = null; // myDog ����
		
	}
	
	
}