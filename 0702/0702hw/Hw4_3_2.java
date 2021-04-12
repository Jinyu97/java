class Hw4_3_2{
	public static void main(String [] args){
	for(int i=2; i<=100; i++){
		int cnt=0;
		for(int j=1; j<i; j++){
			if(i%j==0) cnt++;
			if(cnt>1) break;
		}
		if(cnt==1) System.out.printf("%3d ", i);
	}
		
		
		
	}
}