//String str = "Hello, World!!": ���ڿ��� ����
//str�� "yello" �� �ٲٱ�: 
//������ ����
//Hello, World!!
class StringTest{
	public static void main(String [] args){
		String str = "Hello, World!!";//5: 0 1 2 3 4 
		System.out.println("���ڿ��� ����: "+str.length());
		//str.charAt(0)='y';//���ڿ��� ����̱� ������ �ѹ��ڸ� ���� �Ұ���
		//str = str.replace('H', 'y');//yello
		//str = "yello";
		System.out.println("������ str: "+str);
		
		int cnt=0;
		int lengthOfStr=0;
/*��� 1 : ���ڿ��� ����-����ĺ�-��������
		for(int i=0; i<str.length(); i++){
			if((str.charAt(i)>='a' && str.charAt(i)<='z')|| (str.charAt(i)>='A' && str.charAt(i)<='Z')){
				lengthOfStr++;//����ĺ��� ���ܵ�: ���ĺ��� ����
				switch(str.charAt(i)){
					case 'A': case 'E': case 'I': case 'O': case 'U': 
					case 'a': case 'e': case 'i': case 'o': case 'u': 
						cnt++;
						break;			
				}	
			}
		}
		System.out.println("���� ����: "+(lengthOfStr-cnt));//���ĺ��� ����-��������
		*/
		
		for(int i=0; i<str.length(); i++){
			if((str.charAt(i)>='a' && str.charAt(i)<='z')|| (str.charAt(i)>='A' && str.charAt(i)<='Z')){//���ĺ��̸� if�� ���
				
				switch(str.charAt(i)){
					case 'A': case 'E': case 'I': case 'O': case 'U': 
					case 'a': case 'e': case 'i': case 'o': case 'u': 
						break;			
					default: 
						cnt++;//�����̸� cnt �ϳ� ����
				}	
			}
		}
		
		System.out.println("���� ����: "+cnt);
		
		
	
	}
}

