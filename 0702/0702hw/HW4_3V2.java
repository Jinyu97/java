
class HW4_3V2{
	public static void main(String [] args){
	
	int cnt=0;
	for(int i=1; i<=100; i++){
		if((i%2==0)||(i%3==0)||(i%5==0)||(i%7==0)) continue;
		System.out.printf("%3d ", i);
		cnt++;
		if(cnt%5==0) System.out.println();
		
	}
	
		
		
		
		
		
	}
	
}
		