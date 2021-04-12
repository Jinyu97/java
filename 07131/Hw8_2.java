class Hw8_2{
	public static void main(String [] args){
		char [][] seat = new char [10][10];
		
		initSeat(seat);
		printSeat(seat);
		
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
			System.out.printf("%3d", k+1);
		}
		System.out.println();
		for(int i=0; i<arr.length; i++){
			System.out.printf("%c", (char)('a'+i));
			for(int j=0; j<arr[0].length; j++){
				System.out.printf("%3c", arr[i][j]);
				
			}
			System.out.println();
		}

	}
	
	
}