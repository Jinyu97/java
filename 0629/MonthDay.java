// ���� �����ؼ� �⵵�� �� �Է��ϸ� ��ĥ���� �ִ��� ���

import java.util.Scanner;
class MonthDay{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("�� �� : ");
		int year = s.nextInt();
		System.out.print("�� �� : ");
		int month = s.nextInt();
		int day;
		
		
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31; break;
			case 4: case 6: case 9: case 11: day=30; break;
			case 2: if((year%4==0)&&(year%100!=0)||(year%400==0)) day=29;
					else day=28; break;
			default: System.out.print("��:1~12 �� �ϳ��� �Է��ϼ���."); return;
			}
			
			System.out.printf("%d�� %d���� %d�ϱ��� �ֽ��ϴ�.\n", year, month, day);
			
		}
	}
