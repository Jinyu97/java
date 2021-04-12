class StringManipulate{
	
	String connect(String s1, String s2){
		return s1+s2;
	}
	
	void toUpper(String s1){
		for(int i=0; i<s1.length(); i++){
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z') System.out.print((char)(s1.charAt(i)-32));
			else System.out.print(s1.charAt(i));
		}
	}
	
	boolean equal(String s1, String s2){
		if(s1.length()!=s2.length()) return false;
		for(int i=0; i<s1.length(); i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	
}


class Hw7_3{
	public static void main(String [] args){
		StringManipulate st = new StringManipulate();
	
		String a = "abc";
		String b = "def";
		String c = "abCdE";
		String d = "abc";
		
		System.out.println(st.connect(a,b));
		st.toUpper(c);
		System.out.println(st.equal(a,d));
		System.out.println(st.equal(c,a));
		
		
	}
}