import java.util.Scanner;


class StringManipulate{
	
	static String connect(String a, String b){
		return a+b;
		
	}
	
	static void toUpper(String a){
		for(int i=0; i<a.length(); i++){
			if(a.charAt(i)>='a' && a.charAt(i)<='z')	System.out.print((char)(a.charAt(i)-32)); 
			else System.out.print(a.charAt(i));
		}
		System.out.println();
	}
	
	static boolean check(String a, String b){
		int cnt=0;
		if (a.length()!=b.length()) return false;
		for(int i=0; i<a.length(); i++){
			if(a.charAt(i)==b.charAt(i)) cnt++;
			else break;
		}
		if(cnt==a.length()) return true;
		else return false;
		
	}
	
	
}


class Hw7_3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장1: ");
		String x = sc.nextLine();
		System.out.print("문장2: ");
		String y = sc.nextLine();
		
		StringManipulate s = new StringManipulate();
		
		System.out.print("문장1 문장2 연결: ");
		System.out.println(s.connect(x,y));
		
		System.out.print("문장1 대문자 변환: ");
		s.toUpper(x);
		
		System.out.print("문장1, 문장2 일치여부: ");
		System.out.print(s.check(x,y));
		
		
		
	}
}