/* //������ �׽�Ʈ1

//1. ����� Ȱ���Ͽ� �Ʒ� Ŭ���� �ۼ�

���� Ŭ����
 - �ʵ�: ����
 
 //��� Ŭ����
  - �ʵ�: �̸�, ����
  
 //�л� Ŭ����
  - �ʵ�: �г�, �̸�, ����
  
  // 2. ���ο��� ĳ���� ����
  
  */
  
  
 class Animal{
	 int age;
	 Animal(){}
	 /*
	 Animal(int age){
		 this.age = age;
	 }
	 */
	 
 }
 
 class Person extends Animal{
	 String name;
	 
	 Person(){}
	 /*
	 Person(int age, String name){
		super(age);
		this.name = name;
	 }*/
 }
 
 class Student extends Person{
	 int grade;
	 
	 Student(){}
	 /*
	 Student(int age, String name, int grade){
		 super(age, name);
		 this.grade = grade;
	 }*/
 }
 
 class PolymorphismTest1{
	 public static void main(String [] args){
		 Animal a1 = new Animal(); //���� ����
		 
		 //Person a2 = new Person(); //��� ����
		 Animal a2 = new Person(); //��� ���� ����!! ĳ����(����ȯ)�� �߻��ߴµ�, �̷� ������ ĳ������ ��ĳ�����̶�� ��
		
		//Student a3 = new Student(); //�л� ����
		 Animal a3 = new Student(); //�л� ���� ����! (��ĳ����)
		 Person a4 = new Student(); //��ĳ����
		 //������: polymorphism: �ϳ��� ��ü�� �������� Ÿ������ ������ �� �ִ� ����
		 
		 Student s1 = (Student)a4; 
		 //�ٿ�ĳ���� ����. a4�� ���� �л��ε� �ӽ÷� ������� �����ߴٰ� �ٽ� �л����� ĳ�����ϹǷ� 
		 
		 //�Ұ���(�ٿ�ĳ����): ������ ����
		 //Student s = new Person();
		 
		 
		 //��ĳ������ �Ѱ�
		 //System.out.println(a2.name); //�Ұ���
		 System.out.println(((Person)a2).name); //����
		 System.out.println(((Student)a3).grade); //����
		 System.out.println(((Person)a3).name); //����, Student���� ĳ�����ص� ��
		 System.out.println(a3.age); // ĳ���þ��̵� ����
		 
		 
		 //�ٿ�ĳ������ �Ѱ�: ����� ������ ���� ����()
		 System.out.println("����: "+((Person)a2).name); 
		 //System.out.println("���� �Ұ���: "+((Student)a2).grade); //�������� ����
		 
		 //������ �Ұ���: �ٿ� ĳ����
		 // Student s = new Person();
		 
		 /*
		 Animal a = new Animal(5);
		 System.out.println("��������: "+a.age);
		 Person p = new Person(10, "ȫ�浿");
		 System.out.println("�������: "+p.age+", �̸�: "+p.name);
		 Student s = new Student(22, "������", 3);
		 System.out.println("�л�����: "+s.age+", �̸�: "+s.name+", �г�: "+s.grade);
		 */
	 }
 }