import java.util.Scanner;
class Hw5{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String type;
		int line, hor, ver, rep;
		System.out.print("������ Ÿ�� : ");
		type = s.nextLine();
		
		if(type.equals("�Ƕ�̵�")){
			System.out.print("���� �� : ");
			line = s.nextInt();
			while((line<1)||(line>10)){
				System.out.println("���� ���� �� 10 ���ϸ� �Է��ϼ���.");
				System.out.print("���� �� : ");
				line = s.nextInt();	
			}
			for(int i=1; i<=line; i++){
				for(int blank=0; blank<line-i; blank++){
					System.out.print(" ");
				}
				for(int j=i-1; j>=0; j--){
					System.out.printf("%d", j);
				}
				for(int j=1; j<=i-1; j++){
					if(i==1) continue;
					System.out.printf("%d", j);
				}
				System.out.println();
			}
		}
		else if(type.equals("�簢��")){
			System.out.print("���� : ");
			hor = s.nextInt();
			System.out.print("���� : ");
			ver = s.nextInt();
			System.out.print("�ݺ� : ");
			rep = s.nextInt();
			
			for(int i=1; i<=ver; i++){
				for(int j=1; j<=rep; j++){
					for(int k=1; k<=hor; k++){
						System.out.print("*");
					}
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		
		else if(type.equals("���̾Ƹ��")){
			System.out.print("���� �� : ");
			line = s.nextInt();
			while((line<1)||(line%2==0)){
				System.out.println("���� ���� �� Ȧ���� �Է��ϼ���.");
				System.out.print("���� �� : ");
				line = s.nextInt();	
			}
			for(int i=1; i<=line/2+1; i++){
				for(int blank=1; blank<=line/2+1-i; blank++){
					System.out.print(" ");
				}
				for(int j=1; j<=2*i-1; j++){
					System.out.printf("*");
				}
				System.out.println();
			}
			
			for(int i=1; i<=line/2; i++){
				for(int blank=1; blank<=i; blank++){
					System.out.print(" ");
				}
				for(int j=1; j<=-2*i+line; j++){
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
	}
}