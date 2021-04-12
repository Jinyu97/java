import java.util.Scanner;
class Hw2_2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		double a, b;
		String c;
		System.out.print("식을 입력하세요(ex. 7 + 4): ");
		a = s.nextDouble();
		c = s.next();
		b = s.nextDouble();
		double ans;
		
		switch(c){
			case "+" : 	ans = a+b;
						if (ans%1==0) System.out.printf("%d",(int)ans);
						else System.out.printf("%.2f\n",ans);
						break;
			case "-" :	ans = a-b;
						if (ans%1==0) System.out.printf("%d",(int)ans);
						else System.out.printf("%.2f\n",ans);
						break;
			case "*" : ans = a*b;
						if (ans%1==0) System.out.printf("%d",(int)ans);
						else System.out.printf("%.2f\n",ans);
						break;
			case "/" :	if(b==0){
							System.out.println("0으로 나눌 수 없습니다.");
							return;
						}	
						ans = a/b;
						if (ans%1==0) System.out.printf("%d",(int)ans);
						else System.out.printf("%.2f\n",ans);
						break;
			case "%" : if(b==0){
							System.out.println("0으로 나눌 수 없습니다.");
							return;
						}	
						ans = a%b;
						if (ans%1==0) System.out.printf("%d",(int)ans);
						else System.out.printf("%.2f\n",ans);
						break;
						
			default : System.out.println("+, -, *, /, % 연산만 지원합니다.");
		}
	}
}
		