import java.util.Scanner;

class Hw8_1{
	public static void main(String [] args){
		if(args.length==0){
			System.out.println("커맨드 라인 상에 문자열이 입력되지 않았습니다.");
			return;
		}
		
		String [] arr = new String[args.length];
		
	
	
		
		String tmp;
		for(int i=0; i<args.length-1; i++){
			for(int j=i+1; j<args.length; j++){
				if(args[i].compareToIgnoreCase(args[j])>0){ 
					tmp=args[i];
					args[i]=args[j];
					args[j]=tmp;
				}
			}
		}
			
		System.out.println("사전식 정렬");	
		for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
		
		
		
	}
}