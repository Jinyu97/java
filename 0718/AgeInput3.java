// Runtime ���ܴ� try-catch�� �ƴϴ��� �ڵ忡�� ������ ���ܰ� �߻��ϴ� ��츦 ó���� �� ����

import java.util.*; 
class AgeInput3{
	public static void main(String [] args) {
	
		try{
			ageInput();
		}catch(NegativeAgeException nae){
			//System.out.println("[���� �߻�] ���̸� ������ �Է��߽��ϴ�."); 
			//nae.printStackTrace();
			System.out.println(nae.getMessage()); //���� ���� ���� �޽��� ���
		}catch(TooMuchAgeException tmae){
			System.out.println(tmae.getMessage());
		}
	}
	
	static void ageInput() throws NegativeAgeException, TooMuchAgeException{
		int age;
		
		Scanner s = new Scanner(System.in);
	
		System.out.print("���̸� ���ڷ� �Է����ּ���: ");
		age = s.nextInt();
		
		if(age<0) throw new NegativeAgeException();
		if(age>=200) throw new TooMuchAgeException();
		
		System.out.format("����� ���̴� %d���Դϴ�.\n", age);
		
		
		
	}
}

// ����� ���� ����: ���� ���� ����: ����ڰ� ���̸� ������ �Է��� ��� �߻��Ǵ� ����
class NegativeAgeException extends Exception{
	NegativeAgeException(){
		super("���� ���� ����");
	}
	
}

class TooMuchAgeException extends Exception{
	TooMuchAgeException(){
		super("200�� �̻� ���� ����");
	}
}