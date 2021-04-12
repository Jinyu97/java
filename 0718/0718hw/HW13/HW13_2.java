import java.io.*;

class HW13_2{
	public static void main(String [] args){
		if(args.length !=2){
			System.out.println("java HW13_2 공백없는문자열 파일명");
			return;
		}
		String st = args[0];
		String tmp;
		int cnt=0;
		
		File f = new File(args[1]);
		if(f.exists()){
			System.out.println(args[1]+"파일이 이미 존재합니다. ");
			return;
		}
		
		for(int i=0; i<=st.length()-4; i++){
			tmp = st.substring(i, i+4);
			if(tmp.equals("java")) cnt++;
		}
		
		
		try{
			PrintWriter pw = new PrintWriter(f);
			pw.println(cnt);
			pw.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}