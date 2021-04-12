import java.io.*;

class Hw13_2{
	public static void main(String [] args){
		if(args.length==0){
			System.out.println("����: java Hw8_2 ���ڿ� ���ϸ�");
			return;
		}
		
		File output = new File(args[1]);
		if(output.exists()){
			System.out.println("�ش� ������ �̹� �����մϴ�.");
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
			pw.println("�Է¹��� ���ڿ����� \"java\"�� ���� Ƚ��: "+count);
		
			pw.close();
		}catch(FileNotFoundException fnfe){
			System.out.println("FileNotFoundException ���� �߻�");
			return;
		}
		
	}
}