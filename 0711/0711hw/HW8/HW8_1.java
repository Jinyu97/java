class HW8_1{
	public static void main(String [] args){
		if(args.length==0){
			System.out.println("커맨드 라인 상에 문자열이 입력되지 않았습니다. ");
			return;
		}
		String tmp;
		
		for(int i=0; i<args.length-1; i++){
			for(int j=i+1; j<args.length; j++){
				if(args[i].compareToIgnoreCase(args[j])>0){
					tmp = args[i];
					args[i] = args[j];
					args[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<args.length; i++){
			System.out.print(args[i]+"\t");
		}
		System.out.println();
		
	}
}