
class ForTestV2{
	public static void main(String [] args){

		// 문제1-1: A B C...Z까지 출력
		for (int i='A'; i<='Z'; i++){
			System.out.printf("%c ", i);
		}
		System.out.println("\n");
		
		for (int i='a'; i<='z'; i++){
			System.out.printf("%c ", i);
		}
		System.out.println("\n");
		  
		// 문제3: 
		/* 1 2 3 ... 10
		   11 12 13 ... 20
		   ..
		   41 42 43 ... 50
		   */
		for (int j=0; j<5; j++){
			for (int i=1; i<11; i++){
				System.out.printf("%2d ", j*10+i);
			}
			System.out.println();
		} 
		
		System.out.println();
		   
		for (int i=1; i<=50; i++){
			System.out.printf("%2d ", i);
			if(i%10==0) System.out.println();
		}
		
		
			
	}   
		   
		   
}
