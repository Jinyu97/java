class Hw8_1{
	public static void main(String [] args){
		if(args.length==0) return;
		
		System.out.println("������ ����:");
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
			System.out.println(args[i]);
		}
		
	}
}