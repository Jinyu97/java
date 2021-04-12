import java.util.Scanner;
class Hw8_2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		char [][] seat = new char [10][10];
		
		initSeat(seat);
		printSeat(seat);
		
		System.out.print("예약을 하시겠습니까?(Y(y)/N(n)) ");
		String book;
		book = s.next();
		while(book.equals("Y") || book.equals("y")){
			bookSeat(seat);
			System.out.print("예약을 하시겠습니까?(Y(y)/N(n)) ");
			book = s.next();
		}
		if(book.equals("N")||book.equals("n")){
			System.out.println("예약 시스템을 종료합니다.");
			return;
		}
		
	}
	
	static void initSeat(char [][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				int ran = (int)(Math.random()*2);
				if(ran==1) arr[i][j]='X';
				else arr[i][j]=' ';
				
			}
		}
		
	}
	
	static void printSeat(char [][] arr){
		System.out.print("현재 예약 상태\n ");
		for(int k=0; k<arr.length; k++){
			System.out.printf("%4d", k+1);
		}
		System.out.println();
		for(int i=0; i<arr.length; i++){
			System.out.printf("%c", (char)('a'+i));
			for(int j=0; j<arr[0].length; j++){
				System.out.printf("%4c", arr[i][j]);
				
			}
			System.out.println();
		}

	}
	

	static void bookSeat(char [][] arr){
		Scanner s = new Scanner(System.in);
		String row;
		int col;
		System.out.print("좌석의 행: ");
		row = s.next();
		System.out.print("좌석의 열: ");
		col = s.nextInt();
		
		while (arr[(int)(row.charAt(0)-'a')][col-1]==' '){
			System.out.println("이미 예약된 좌석입니다. 좌석을 다시 선택하세요.");
			System.out.print("좌석의 행: ");
			row = s.next();
			System.out.print("좌석의 열: ");
			col = s.nextInt();
		}
		
		System.out.printf("%s행 %d열 예약 성공!\n", row, col);
		arr[(int)(row.charAt(0)-'a')][col-1] = 'X';
		printSeat(arr);
		
	}
	
	
}