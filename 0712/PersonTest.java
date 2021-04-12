
class Animal{
	int age;
	String name;
	
	Animal(){ 
	//�� ����Ʈ�����ڸ� ���ָ� �Ʒ��� �����ڶ����� ����Ʈ�����ڰ� �ڵ����� �������� �����Ƿ� ���ָ� �� ��
		System.out.println("���� ����"); 
	}
	
	Animal(int age, String name){
		this.age = age;
		this.name = name;
		System.out.printf("%d���� ����(%s) ����\n", this.age, this.name);
	}
	
	// Animal a = new Animal();
	// Animal b = new Animal();
	// a.equals(b); => a: this, b: o
	@Override //equals()�޼ҵ� ������
	public boolean equals(Object o){ //� ������ ���� ������?
	// �̸��� ���̰� ������ ���� ������ ����
		if(this.age==((Animal)o).age && (this.name).equals(((Animal)o).name)) return true; //o�� �ʵ尡 �����Ƿ� o�� Animal�� ĳ����
		else return false;
		
	}
	
	@Override //toString() �޼ҵ� ������
	public String toString(){
		return String.format("�� ������ ���̴� %d��, �̸��� %s�Դϴ�.\n", this.age, this.name); // this ���� ��
	}
	
	
	void eat(){
		System.out.println("���� �Դ� ��");
	}
	
	void move(){
		System.out.println("�����̴� ��");
	}

}

class Person extends Animal{ // Person Ŭ���� �ʵ� 3��, �޼ҵ� 3��
	String job;
	
	Person(){
		// Animal(); //�θ�Ŭ������ ����Ʈ�����ڰ� �ڵ������� ȣ���
		System.out.println("��� ����"); //����� ���� ��ӹ����Ƿ� ���� ���� ���� -> ��� ����
	}
	
	Person(int age, String name, String job){
		/* ���� ����
		this.age = age;
		this.name = name;
		// �θ�Ŭ������ �ʵ�� �θ�Ŭ������ �ʱ�ȭ�ϵ��� �� ��.
		*/
		super(age, name); //�ǹ�: Animal(age, name);
		this.job = job;
		System.out.printf("������ %s�� ��� ����\n", this.job); 
	}
	
	
	// ������������ ������ ����ؼ� override�� ���� ����. ��, Ȯ���ϴ� ���� ����.
	// ex) �θ� public void move()-> �ڽ� public void move()�� �ؾ� ��
	// ex) �θ� void move() -> �ڽ� public void move() ����
	// ex) �θ� private void move() -> override ��ü�� �Ұ���
	
	// �޼ҵ� ������ �� ����� �Ϻ��ϰ� ��ġ�ؾ� �Ѵ� : X(���� �����ڴ� �޶� �ǰ� �ñ״�ó�� ��ġ�ϸ� ��)
	@Override
	// ������(override): �ñ״�ó�� �θ�Ŭ������ �޼ҵ�� �Ϻ��ϰ� ��ġ(�θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ������ �°� �ٽ� ��)
	// cf) �ߺ�����(overload): �޼ҵ� �̸��� ������ �ñ״�ó�� �޶�� ��
	// �ñ״�ó = �޼ҵ��+�Ű�������
	void move(){
		System.out.println("�ȴ� ��");
	}
	
	void work(){
		System.out.println("���ϴ� ��");
	}
	
}


// �׻� �ڽ�Ŭ����
class PersonTest{
	public static void main(String [] args){
		Animal a = new Animal(5,"��");
		System.out.println(a.toString());
		Animal b = new Animal(5, "��");
		System.out.println(b); // �ڵ������� toString() �޼ҵ� ȣ��
		Animal c = new Animal(5, "��");
		System.out.println(c);
		
		System.out.println(a.getClass());
		System.out.println(a.getClass().getName());

		System.out.println();
		
		System.out.println("a, b ��ġ? "+b.equals(a));
		System.out.println("b, c ��ġ? "+b.equals(c));
		
		System.out.println();
		
		Person p = new Person(22, "������", "�л�");
		System.out.printf("����: %d, �̸�: %s, ����: %s\n", p.age, p.name, p.job);
		System.out.println(p.toString());
		p.eat();
		p.move();
		p.work();

		
		
	}
}