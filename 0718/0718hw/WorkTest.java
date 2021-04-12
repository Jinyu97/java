import java.util.Scanner;
import java.util.InputMismatchException;
class WorkTest{
	public static void main(String [] args){
	
		try{
			TaskInput();
		
		}catch(InputMismatchException ime){
			System.out.println("���ڷ� �Է��ϼ���.");
		}catch(NegativeTaskException nte){
			System.out.println(nte.getMessage());
		}
		
		System.out.println("���α׷� ����!");
		
	}
	
	static void TaskInput() throws NegativeTaskException{
	int task;
	int max;
	Scanner s = new Scanner(System.in);		
	System.out.print("�� ���� ����: ");
	task = s.nextInt();
		
	if(task<0) throw new NegativeTaskException();
	
	if(task%10==0) max = task/10;
	else max = task/10+1;

	System.out.println("�� ����� �ִ� ���� ��: "+max);
	
	}
	
	
}




class NegativeTaskException extends Exception{
	NegativeTaskException(){
		super("���� ���� ������ �� �����ϴ�.");
	}
}