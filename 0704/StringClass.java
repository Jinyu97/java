// String str = "Hello, World!!" : 문자열의 길이
// str을 "yello"로 바꾸기
// 자음의 개수

class StringClass{
	public static void main(String [] args){
		String str = "Hello, World!!";
		
		System.out.println("문자열의 길이 : "+str.length());
		// str.charAt(0) = 'y'; // 문자열은 상수이기 때문에 한 문자만 변경 불가능
		str = str.replace('H', 'y') ; //yello, World!!
		// str = "yello";
		System.out.println("변경 후 str : "+str);
		
		
		// 문자열의 길이-비알파벳-모음개수
		
		/* 방법 1
		int cnt = 0;
		int lengthOfStr = 0;
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){
				lengthOfStr++; // 비알파벳은 제외됨
				switch(str.charAt(i)){
					case 'A': case 'E': case 'I': case 'O': case 'U': 
					case 'a': case 'e': case 'i': case 'o': case 'u':
						cnt++;
						break;
				}
			}
		}
		
		System.out.println("자음 개수 : "+(lengthOfStr-cnt));
		*/
		
		// 방법 2
		int cnt = 0;
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){ //알파벳만 걸러냄
				switch(str.charAt(i)){
					case 'A': case 'E': case 'I': case 'O': case 'U': 
					case 'a': case 'e': case 'i': case 'o': case 'u':
						break;
					default: cnt++; // 자음만 카운트
					}
				}
				
		}
		
		System.out.println("자음 개수 : "+cnt);
		
	}
}