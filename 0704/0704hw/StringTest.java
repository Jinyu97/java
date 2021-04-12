//String str = "Hello, World!!": 문자열의 길이
//str을 "yello" 로 바꾸기: 
//자음의 개수
//Hello, World!!
class StringTest{
	public static void main(String [] args){
		String str = "Hello, World!!";//5: 0 1 2 3 4 
		System.out.println("문자열의 길이: "+str.length());
		//str.charAt(0)='y';//문자열은 상수이기 때문에 한문자만 변경 불가능
		//str = str.replace('H', 'y');//yello
		//str = "yello";
		System.out.println("변경후 str: "+str);
		
		int cnt=0;
		int lengthOfStr=0;
/*방법 1 : 문자열의 길이-비알파벳-모음개수
		for(int i=0; i<str.length(); i++){
			if((str.charAt(i)>='a' && str.charAt(i)<='z')|| (str.charAt(i)>='A' && str.charAt(i)<='Z')){
				lengthOfStr++;//비알파벳은 제외됨: 알파벳의 개수
				switch(str.charAt(i)){
					case 'A': case 'E': case 'I': case 'O': case 'U': 
					case 'a': case 'e': case 'i': case 'o': case 'u': 
						cnt++;
						break;			
				}	
			}
		}
		System.out.println("자음 개수: "+(lengthOfStr-cnt));//알파벳의 개수-모음개수
		*/
		
		for(int i=0; i<str.length(); i++){
			if((str.charAt(i)>='a' && str.charAt(i)<='z')|| (str.charAt(i)>='A' && str.charAt(i)<='Z')){//알파벳이면 if문 통과
				
				switch(str.charAt(i)){
					case 'A': case 'E': case 'I': case 'O': case 'U': 
					case 'a': case 'e': case 'i': case 'o': case 'u': 
						break;			
					default: 
						cnt++;//자음이면 cnt 하나 증가
				}	
			}
		}
		
		System.out.println("자음 개수: "+cnt);
		
		
	
	}
}

