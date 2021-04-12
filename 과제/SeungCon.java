import java.util.Scanner;
class SeungCon{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String ticket;
		char [][] seat = new char [10][10];
		
		initSeat(seat);
		printSeat(seat);
		do{
			System.out.print("������ �Ͻðڽ��ϱ�?(Y(y)/N(n)) ");
			ticket = s.next();
			if(ticket.equals("N")||ticket.equals("n")){
				System.out.println("���Ÿ� �����մϴ�.");
				return;
			}
			if(ticket.equals("Y")||ticket.equals("y")){
				bookSeat(seat);
			}
			
		}while(ticket.equals("Y")||ticket.equals("y"));
			
		
		
	}
	
	static void initSeat(char [][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				int r = (int)(Math.random()*2);
				if(r==0) arr[i][j]='X';
				else arr[i][j]=' ';
			}
		}
	}
	
	static void printSeat(char [][] arr){
		System.out.println("<<The Great Seungri Tour in Seoul - ����ü����>>");
		System.out.println("���� ���� ����");
		System.out.print("  ");
		for(int i=1; i<=10; i++){
			System.out.printf("%4d", i);
		}
		System.out.println();
		
		for(int j=0; j<10; j++){
			System.out.printf("%2c", 'a'+j);
			for(int i=0; i<10; i++){
				System.out.printf("%4c", arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	static void bookSeat(char [][] arr){
		String row;
		int col;
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.print("�¼��� ��: ");
			row = s.next();
			System.out.print("�¼��� ��: ");
			col = s.nextInt();
			if(arr[row.charAt(0)-'a'][col-1]=='X'){
				System.out.println("�̹� ������ �¼��Դϴ�.");
			}
			if(arr[row.charAt(0)-'a'][col-1]==' '){
				break;
			}
			
		}
		
		System.out.printf("%s�� %d�� ���� ����!\n", row, col);
		
	}
	
	
}