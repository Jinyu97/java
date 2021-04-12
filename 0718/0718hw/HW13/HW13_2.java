import java.io.*;

class HW13_2{
	public static void main(String [] args){
		if(args.length !=2){
			System.out.println("java HW13_2 ������¹��ڿ� ���ϸ�");
			return;
		}
		String st = args[0];
		String tmp;
		int cnt=0;
		
		File f = new File(args[1]);
		if(f.exists()){
			System.out.println(args[1]+"������ �̹� �����մϴ�. ");
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