/* �л� Ŭ����
 -���� �ʵ�
 
 -Comparable �������̽��� ����: �� �������̽��� �ִ� ��� �޼ҵ带 ����������� �Ѵٴ� ��
 -compareTo(Object o) �޼ҵ常 �������ָ� ��
	//ȣ�� ����: st1.compareTo(st2)
	: st1�� ���̰� st2�� ���̺��� �۴ٸ� -1, ũ�ٸ� 1, ���ٸ� 0 ��ȯ
 
*/

import java.util.Arrays;
class Student implements Comparable{
	int age;
	Student(){}
	Student(int age){
		this.age = age;
	}
	@Override
	public int compareTo(Object o){ // ����� ���ľ public �߰��ϱ�!
		if(o instanceof Student){
			if(this.age<((Student)o).age) return -1;
			else if(this.age == ((Student)o).age) return 0;
			else return 1; // else if~�� �ϸ� ������ �Ұ�
		}
		else{
			System.out.println("�� �Ұ�");
			return 9999;
		}
	}
}




class CompareTest{
	public static void main(String [] args){
		Student [] stds = {new Student(105), new Student(5), new Student(25), new Student(15), new Student(7)};
		
		
		System.out.println("�л�1, �л�2 ���� ��: "+stds[0].compareTo(stds[1]));
		System.out.println("�л�2, �л�3 ���� ��: "+stds[1].compareTo(stds[2]));
		System.out.println("�л�1, �л�3 ���� ��: "+stds[2].compareTo(stds[0]));
		
		Arrays.sort(stds); //Arrays Ŭ������ sort �޼ҵ带 ȣ���� ��, �Ű������� Comparable �������̽��� ������ Ŭ������ �迭�� �־��ָ� �ڵ������� �������� ���ĵ�
		
		for(Student st: stds){
			System.out.print(st.age+" ");
		}
		
		String [] strings = {"ZBC", "Abc", "zbc"}; // �������� ����. ZBC�� �Ǿ��̸� �빮�ڰ� �ҹ��ں��� ��
		
		for(String s: strings){
			System.out.print(s+" ");
		}
		
	}
}