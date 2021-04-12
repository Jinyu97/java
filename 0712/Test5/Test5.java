class Test5{
	public static void main(String [] args){
		if(args.length==0){
			System.out.println("커맨드라인에서 문자열 입력");
			return;
		}
		String tmp;
		for(int i=0; i<args.length-1; i++){
			for(int j=i; j<args.length; j++){
				if(args[i].length()>args[j].length()){
					tmp = args[i];
					args[i] = args[j];
					args[j] = tmp;
				}
				else if(args[i].length()==args[j].length()){
					if(args[i].compareToIgnoreCase(args[j])>0){
						tmp = args[i];
						args[i] = args[j];
						args[j] = tmp;
					}
					
				}
			}
		}
		
		for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
		
	}
}