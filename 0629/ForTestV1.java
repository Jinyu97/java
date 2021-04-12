
class ForTestV1{
	public static void main(String [] args){
		
		// 문제1: 1 2 3 4 ..10 출력
		for (int i=1; i<11; i++){
			System.out.printf("%d ", i);
		}
		System.out.println("\n");
		
		// 문제1-1: A B C...Z까지 출력
		char a = 65;
		for (int i=0; i<26; i++){
			System.out.printf("%c ", i+a);
		}
		System.out.println("\n");
		
		
		
		// 문제2: 문제1의 출력을 5줄 출력
		/* 1 2 3 ... 10
		   1 2 3 ... 10
		   ..
		   1 2 3 ... 10
		   */
		for (int j=0; j<5; j++){
			for (int i=1; i<11; i++){
				System.out.printf("%d ", i);
		}
			System.out.println();
		}	
		System.out.println();   
		   
		// 문제3: 
		/* 1 2 3 ... 10
		   11 12 13 ... 20
		   ..
		   41 42 43 ... 50
		   */
		for (int j=0; j<5; j++){
			for (int i=1; i<11; i++){
				System.out.printf("%d ", j*10+i);
			}
			System.out.println();
		} 
		   
		   
		   
	}
}