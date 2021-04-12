// 윤년 포함해서 년도와 월 입력하면 며칠까지 있는지 출력

import java.util.Scanner;
class MonthDay{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("몇 년 : ");
		int year = s.nextInt();
		System.out.print("몇 월 : ");
		int month = s.nextInt();
		int day;
		
		
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31; break;
			case 4: case 6: case 9: case 11: day=30; break;
			case 2: if((year%4==0)&&(year%100!=0)||(year%400==0)) day=29;
					else day=28; break;
			default: System.out.print("월:1~12 중 하나로 입력하세요."); return;
			}
			
			System.out.printf("%d년 %d월은 %d일까지 있습니다.\n", year, month, day);
			
		}
	}
