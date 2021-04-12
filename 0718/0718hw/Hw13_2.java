import java.io.*;

class Hw13_2{
	public static void main(String [] args){
		if(args.length==0){
			System.out.println("사용법: java Hw8_2 문자열 파일명");
			return;
		}
		
		File output = new File(args[1]);
		if(output.exists()){
			System.out.println("해당 파일은 이미 존재합니다.");
			return;
		}
		String tmp;
		int count = 0;
		for(int i=0; i<args[0].length()-4; i++){
			tmp = args[0].substring(i,i+4);
			if(tmp.equals("java")) count++;
			
		}
		
		try{
			PrintWriter pw = new PrintWriter(output);
			pw.println("입력받은 문자열에서 \"java\"가 나온 횟수: "+count);
		
			pw.close();
		}catch(FileNotFoundException fnfe){
			System.out.println("FileNotFoundException 예외 발생");
			return;
		}
		
	}
}