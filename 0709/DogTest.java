/* ������ Ŭ����
	- �ʵ�
		�̸�, ����, ������(����)
	- ������
		����Ʈ ������: �⺻���� ������ ������
						�̸��� ������, ���̴� 3��, �������� 5�� ������
		�̸�, ����, �������� �Ű������� �޴� ������:
						�Ű������� ���� ���� �ʵ尪���� �ʱ�ȭ��
					* ����: 
						���̴� 0�� �̻� 100�� �̸�(�̿��� ������ �ʱ�ȭ�� ��� 3���� ������ ��), 
						�������� 0 �̻� 10 ������ ������(�̿��� ������ �ʱ�ȭ�� ��� 5�� ������ ��)
*/


class Dog{
	String name; 
	private int age; //���� ������: public, protected, private(�ܺο��� ������ �� ����)
	private int full;
	
	// setter: ��ȯŸ�� void, private �ʵ� ���� ��ȿ�� �����Ͽ� ������ �� �ְ� �ϱ� ����
	void setAge(int age){ // ���̸� �����ϰ� ����
		if(age>=0 && age<100) this.age = age;
		else this.age=3;
	}
	
	// getter: 
	String getName(){ //�̸��� �˷���: �̸��� ��ȯ�ϴ� �޼ҵ�
		return name;
	}
	
	int getAge(){ 
		return age;
	}
	
	int getFull(){ 
		return full;
	}
	
	
	Dog(){ // ����Ʈ ������
		this("������", 3, 5); // �ǹ� : Dog("������", 3, 5);
		
		/* //�̷��� �ص� ��
		name = "������";
		age = 3;
		full = 5;
		*/
	}
	Dog(String name, int age, int full){ // ������ // �Ű����� age�� �߰�ȣ �ȿ����� ��� ����
		this.name = name; // this = �� ��ü��~
		
		if(age>=0 && age<100) this.age = age;
		else this.age=3;
		
		if(full>=0 && full<=10) this.full = full;
		else this.full=5;
	}
	
	
	public String toString(){ // ��ü ������ ���ڿ��� ��ȯ
		// �� �������� ��� �ʵ� ������ ��ȯ: �� �������� �̸��� **�̸�, ���̴� **��, �������� **�Դϴ�.
		// return "�� �������� �̸��� "+name+"�̸�, ���̴� "+age+"��, �������� "+full+"�Դϴ�.";
		return String.format("�� �������� �̸��� %s�̸�, ���̴� %d��, �������� %d�Դϴ�.", name, age, full); // ���ڿ��� format�� �����ϴ� �޼ҵ� = String.format();
		
	}
	
}

//��ü�� ������ �Ŀ� �ʵ� ������ �ٲٰ� ���� ��, ������(setter)��� �޼ҵ带 Ȱ��: ��) setAge(), setName(), ...
//������ �� ���� ���� ��, ������ ���� ����ϱ�
class DogTest{
	public static void main(String [] args){
		Dog myDog = new Dog();
		System.out.println(myDog.toString());
		System.out.println(myDog); // ��ü ��ü�� ��� = ��ü�� ���� ������ ���ڿ� Ÿ������ ��ȯ�ϴ� �޼ҵ带 �ڵ����� ����(toString ȣ���� ����� ����)
		myDog.name = "�۸���";
		// myDog.age = -5; : private �ʵ��̹Ƿ� �ٲ� �� ����		
		System.out.println(myDog);
		
		myDog.setAge(18); // private �ʵ��̹Ƿ� setter�� �� ����
		//System.out.println("�� �������� ����: "+myDog.age); // age�� private �ʵ��̹Ƿ� ���� �Ұ�
		System.out.println("�� �������� ����: "+myDog.getAge()); // getter�� ����
		
	}
	
}