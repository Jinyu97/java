import java.util.Scanner;

class ForPattern{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		// 1. �����ﰢ��
		System.out.print("���� �ﰢ���� ����մϴ�.\n�� : ");
		int dan = s.nextInt();
		for(int i=1; i<=dan; i++){ // ������ �����
		// �� ���� �󿡼��� ��Ģ
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();	
		}
		System.out.println();
		
		// 2. �����ﰢ��
		System.out.print("���� �ﰢ���� ����մϴ�.\n�� : ");
		int dan2 = s.nextInt();
		for(int i=1; i<=dan2; i++){
			for(int blank=0; blank<dan2-i; blank++){
				System.out.print(" ");
			}
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 3. �����ﰢ��
		System.out.print("���� �ﰢ���� ����մϴ�.\n�� : ");
		int dan3 = s.nextInt();
		for(int i=1; i<=dan3; i++){
			for(int j=0; j<dan3-i+1; j++){
				System.out.print("*");
			}
			for(int blank=0; blank<dan3-i+1; blank++){
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 4. �Ƕ�̵�
		System.out.print("���� �ﰢ���� ����մϴ�.\n�� : ");
		int dan4 = s.nextInt();
		for(int i=1; i<dan4; i++){
			for(int blank=0; blank<dan4-i; blank++){
				System.out.print(" ");
			}
			for(int j=0; j<2*i-1; j++){
				System.out.print("*");
			}
			for(int blank=0; blank<dan4-i; blank++){
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 5. �����ﰢ��
		System.out.print("���� �ﰢ���� ����մϴ�.\n�� : ");
		int dan5 = s.nextInt();
		for(int i=1; i<=dan5; i++){
			for(int blank=0; blank<i-1; blank++){
				System.out.print(" ");
			}
			for(int j=0; j<dan5-i+1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
	}
	
}