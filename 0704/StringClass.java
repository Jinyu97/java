// String str = "Hello, World!!" : ���ڿ��� ����
// str�� "yello"�� �ٲٱ�
// ������ ����

class StringClass{
	public static void main(String [] args){
		String str = "Hello, World!!";
		
		System.out.println("���ڿ��� ���� : "+str.length());
		// str.charAt(0) = 'y'; // ���ڿ��� ����̱� ������ �� ���ڸ� ���� �Ұ���
		str = str.replace('H', 'y') ; //yello, World!!
		// str = "yello";
		System.out.println("���� �� str : "+str);
		
		
		// ���ڿ��� ����-����ĺ�-��������
		
		/* ��� 1
		int cnt = 0;
		int lengthOfStr = 0;
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){
				lengthOfStr++; // ����ĺ��� ���ܵ�
				switch(str.charAt(i)){
					case 'A': case 'E': case 'I': case 'O': case 'U': 
					case 'a': case 'e': case 'i': case 'o': case 'u':
						cnt++;
						break;
				}
			}
		}
		
		System.out.println("���� ���� : "+(lengthOfStr-cnt));
		*/
		
		// ��� 2
		int cnt = 0;
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){ //���ĺ��� �ɷ���
				switch(str.charAt(i)){
					case 'A': case 'E': case 'I': case 'O': case 'U': 
					case 'a': case 'e': case 'i': case 'o': case 'u':
						break;
					default: cnt++; // ������ ī��Ʈ
					}
				}
				
		}
		
		System.out.println("���� ���� : "+cnt);
		
	}
}