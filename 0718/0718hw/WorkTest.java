import java.util.Scanner;
import java.util.InputMismatchException;
class WorkTest{
	public static void main(String [] args){
	
		try{
			TaskInput();
		
		}catch(InputMismatchException ime){
			System.out.println("숫자로 입력하세요.");
		}catch(NegativeTaskException nte){
			System.out.println(nte.getMessage());
		}
		
		System.out.println("프로그램 종료!");
		
	}
	
	static void TaskInput() throws NegativeTaskException{
	int task;
	int max;
	Scanner s = new Scanner(System.in);		
	System.out.print("총 업무 개수: ");
	task = s.nextInt();
		
	if(task<0) throw new NegativeTaskException();
	
	if(task%10==0) max = task/10;
	else max = task/10+1;

	System.out.println("한 사원의 최대 업무 수: "+max);
	
	}
	
	
}




class NegativeTaskException extends Exception{
	NegativeTaskException(){
		super("업무 수는 음수일 수 없습니다.");
	}
}