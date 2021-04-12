class Member{
	
	String name;
	int age;
	static int members; // static �ʵ�: �� Ŭ�����κ��� ������ ��ü���� ��� ������
	// Ŭ������ �ϳ� �����ϱ� ������ "��ü.�ʵ�"�� �������� �ʰ�, "Ŭ����.�ʵ�"�� ����
	
	Member(){
		members++;
	}
	Member(String name, int age){
		this(); //Member();�� �ǹ� ����, �ٸ� ������ ȣ�� �� �ڵ� ���� �տ� �;� ��.
		this.name = name;
		this.age = age;
	}
		
	// �� ��ȣȸ������ �˷��ִ� �޼ҵ�
	static void printMembers(){
		System.out.println("�� ��ȣȸ������ "+members+"���Դϴ�.");
	}
	
	/*
	static void printName(){ 
	// static�� ��� ��ü�� ���� ��� �����Ƿ� ��ü���� �ٸ� name�� ����� �� ����.
	// static������ non-static�� �� �� ����.
		System.out.println("�̸�: "+name);
	}
*/
	
}


class MemberTest{
	public static void main(String [] args){
		
		// m1.age : ���� ��ü �����Ƿ� ���� �Ұ���
		
		System.out.println("�� ��ȣȸ����: "+Member.members); 
		//static�� ��ü�� �ϳ��� �������� ���� ��Ȳ������ ���� ����
		//static �޼ҵ忡���� non-static ���(�ʵ�, �޼ҵ�)�� ���� �Ұ�
		//non-static�� ��ü�� �ϳ��� �����Ǿ������ ���� ���� 
		
		//Member.printName();
		Member m1 = new Member();
		Member m2 = new Member("ȫ�浿", 22);
		Member m3 = new Member();
		Member m4 = new Member("�����", 45);
		
		System.out.println("�� ��ȣȸ����: "+Member.members);
		Member.printMembers();
		
		
	}
}