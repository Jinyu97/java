import java.util.Scanner;
class I{ // �����Ϸ��� ���� Dog ���Ϻ��� �������ؼ� class ���� ������ ��
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		// ������ �� ���� ����
		Dog myDog = new Dog();
		int foood=0;
		while(true){
			System.out.println("������: "+myDog.full);
			
			if(myDog.full>6){
				 myDog.play(); 
				 break;
			}
			else{
				System.out.println("������ �󸶳� �ֽðڽ��ϱ�? ");
				foood = s.nextInt();
				myDog.eat(foood);
		}
		}
			
		
		/*
		System.out.println("���� ���� ������: "+myDog.full);
		System.out.println("���� ���� �̸�: "+myDog.name);
		myDog.play();
		myDog.eat(5);
		
		Dog yourDog = new Dog(10, "�۸���");
		System.out.println("�۸��� ���� ���� ������: "+yourDog.full);
		System.out.println("�۸��� ���� ���� �̸�: "+yourDog.name);
		*/
	}
	
	
}