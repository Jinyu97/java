import java.util.Scanner;

class HW5{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String type;
		int height = -1; //모든 도형 타입에서 높이
		int width = -1, repeat = -1; //사각형에서 가로와 반복횟수
		
		System.out.print("도형 타입: ");
		type = s.nextLine();
		
		switch(type){
		case "피라미드": //피라미드 높이는 10이하로 가정, 10이하로 제한하는 방법은 다음 수업에서 다루겠습니다. 
			while(true){
				System.out.print("높이: ");
				height = s.nextInt();
				if(height>0 && (height<=10)) break;//출력할 줄 수가 양수가 아닌 경우 양수가 입력될 때까지 반복해서 입력받음
				System.out.println("[입력오류]높이는 10이하의 양수로 입력해주세요. ");
			}
			
			for(int i=1; i<=height; i++){
				for(int j=0; j<height-i; j++) System.out.print(" ");
				for(int j=0; j<i; j++) System.out.format("%d", i-1-j);
				for(int j=1; j<i; j++) System.out.format("%d", j);
				System.out.println();
			}
			break;
		case "사각형":
			while(true){
				System.out.print("가로: ");
				width = s.nextInt();
				if(width>0) break; //가로가 양수가 아닌 경우 양수가 입력될 때까지 반복해서 입력받음
				System.out.println("[입력오류]가로 길이는 양수로 입력해주세요. ");
			}
			while(true){
				System.out.print("세로: ");
				height = s.nextInt();
				if(height>0) break; 
				System.out.println("[입력오류]세로 길이는 양수로 입력해주세요. ");
			}
			while(true){
				System.out.print("반복: ");
				repeat = s.nextInt();
				if(repeat>0) break;
				System.out.println("[입력오류]반복 횟수는 양수로 입력해주세요. ");
			}
			
			for(int i=0; i<height; i++){
				for(int j=0; j<repeat; j++){
					for(int k=0; k<width; k++)	System.out.print("*");
					System.out.print(" ");
				}
				System.out.println();
			}	
			break;
		case "다이아몬드": 
			while(true){
				System.out.print("높이: ");
				height = s.nextInt();
				if(height>0 && (height%2 != 0)) break;
				System.out.println("[입력오류]높이는 양의 홀수로 입력해주세요. ");
			}
			int half = height/2;
			
			for(int i=1; i<=half+1; i++){
				for(int j=0; j<half+1-i; j++) System.out.print(" ");
				for(int j=0; j<2*i-1; j++) System.out.print("*");
				System.out.println();
			}	//다이아몬드 상단
			for(int i=1; i<=half; i++){
				for(int j=0; j<i; j++) System.out.print(" ");
				for(int j=0; j<2*(half+1-i)-1; j++) System.out.print("*");
				System.out.println();
			}	//다이아몬드 하단
			break;
		default:
			System.out.println("[입력오류]도형 타입이 올바르지 않습니다");
		}
	}
}