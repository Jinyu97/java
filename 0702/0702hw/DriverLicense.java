import java.util.Scanner;

class DriverLicense{
	public static void main(String [] args){	
		Scanner s = new Scanner(System.in);
		String type, pass;
		int score;
		
		System.out.print("�� ��?");
		type = s.nextLine();
		
		System.out.print("�� ��?");
		score = s.nextInt();
		//if ����
		//if(type == "1��")�� ���� �ۼ��ϸ� �ּ� �񱳰� �ǹǷ� �ȵ�! �Ʒ��� ���� �ۼ��ؾ� ��. 
		if(type.equals("1��")){
			if(score>=70) pass = "�հ�";
			else  pass = "���հ�";
		}else if(type.equals("2��")){
			if(score>=60) pass = "�հ�";
			else  pass = "���հ�";
		}else{
			System.out.println("[�Է¿���]1��/2���� �Է����ּ���.");
			return; //�Է��� �߸��� ���� ���� �޽��� ����� ����!
		}
		
		System.out.println(pass);
		
		
		//switch����
		/*
		
		switch(type){
			case "1��":
				if(score>=70) pass = "�հ�";
				else  pass = "���հ�";
				break;
			case "2��":
				if(score>=60) pass = "�հ�";
				else  pass = "���հ�";
				break;
			default: 
				System.out.println("[�Է¿���]1��/2���� �Է����ּ���.");
				return; 
		}
		
		System.out.println(pass);
		
		
		*/
	
	}
}