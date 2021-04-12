import java.util.Scanner;

class HW5{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String type;
		int height = -1; //��� ���� Ÿ�Կ��� ����
		int width = -1, repeat = -1; //�簢������ ���ο� �ݺ�Ƚ��
		
		System.out.print("���� Ÿ��: ");
		type = s.nextLine();
		
		switch(type){
		case "�Ƕ�̵�": //�Ƕ�̵� ���̴� 10���Ϸ� ����, 10���Ϸ� �����ϴ� ����� ���� �������� �ٷ�ڽ��ϴ�. 
			while(true){
				System.out.print("����: ");
				height = s.nextInt();
				if(height>0 && (height<=10)) break;//����� �� ���� ����� �ƴ� ��� ����� �Էµ� ������ �ݺ��ؼ� �Է¹���
				System.out.println("[�Է¿���]���̴� 10������ ����� �Է����ּ���. ");
			}
			
			for(int i=1; i<=height; i++){
				for(int j=0; j<height-i; j++) System.out.print(" ");
				for(int j=0; j<i; j++) System.out.format("%d", i-1-j);
				for(int j=1; j<i; j++) System.out.format("%d", j);
				System.out.println();
			}
			break;
		case "�簢��":
			while(true){
				System.out.print("����: ");
				width = s.nextInt();
				if(width>0) break; //���ΰ� ����� �ƴ� ��� ����� �Էµ� ������ �ݺ��ؼ� �Է¹���
				System.out.println("[�Է¿���]���� ���̴� ����� �Է����ּ���. ");
			}
			while(true){
				System.out.print("����: ");
				height = s.nextInt();
				if(height>0) break; 
				System.out.println("[�Է¿���]���� ���̴� ����� �Է����ּ���. ");
			}
			while(true){
				System.out.print("�ݺ�: ");
				repeat = s.nextInt();
				if(repeat>0) break;
				System.out.println("[�Է¿���]�ݺ� Ƚ���� ����� �Է����ּ���. ");
			}
			
			for(int i=0; i<height; i++){
				for(int j=0; j<repeat; j++){
					for(int k=0; k<width; k++)	System.out.print("*");
					System.out.print(" ");
				}
				System.out.println();
			}	
			break;
		case "���̾Ƹ��": 
			while(true){
				System.out.print("����: ");
				height = s.nextInt();
				if(height>0 && (height%2 != 0)) break;
				System.out.println("[�Է¿���]���̴� ���� Ȧ���� �Է����ּ���. ");
			}
			int half = height/2;
			
			for(int i=1; i<=half+1; i++){
				for(int j=0; j<half+1-i; j++) System.out.print(" ");
				for(int j=0; j<2*i-1; j++) System.out.print("*");
				System.out.println();
			}	//���̾Ƹ�� ���
			for(int i=1; i<=half; i++){
				for(int j=0; j<i; j++) System.out.print(" ");
				for(int j=0; j<2*(half+1-i)-1; j++) System.out.print("*");
				System.out.println();
			}	//���̾Ƹ�� �ϴ�
			break;
		default:
			System.out.println("[�Է¿���]���� Ÿ���� �ùٸ��� �ʽ��ϴ�");
		}
	}
}