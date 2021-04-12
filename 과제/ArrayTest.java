import java.util.Scanner;
class ArrayTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int length;
		System.out.print("�迭�� ũ��: ");
		length = s.nextInt();
		double [] arr = new double[length];
		
		
		initArr(arr);
		printArr(arr);
		System.out.println();
		System.out.printf("��� ���� ��: %.1f",sumArr(arr));
		System.out.printf("�ִ�: %.1f",maxElt(arr));
		System.out.println("�ִ��� �ּ� �ε���: "+maxEltIndex(arr));
		System.out.println("���� ���ø�");
		shuffling(arr);
		printArr(arr);
		System.out.println();
		
		System.out.println("���������� 2ĭ: ");
		shiftRight(arr, 2);
		printArr(arr);
		
		System.out.println("\n�������� 3ĭ: ");
		shiftLeft(arr, 3);
		printArr(arr);
		
		
	}
	
	static void initArr(double [] arr){
		for(int i=0; i<arr.length; i++){
			arr[i] = Math.random()*10;
		}
	}
	
	static void printArr(double [] arr){
		for(int i=0; i<arr.length; i++){
			System.out.printf("%.1f\t",arr[i]);
		}
	}
	
	static double sumArr(double [] arr){
		double sum=0;
		for(int i=0; i<arr.length; i++){
			sum+=arr[i];
		}
		
		return sum;
	}
	
	static double maxElt(double [] arr){
		double max = arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}
	
	static int maxEltIndex(double [] arr){
		double max = arr[0];
		int index=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
				index = i;
			}
		}
		return index;
	}
	
	static void shuffling(double [] arr){
		double tmp;
		for(int i=0; i<arr.length; i++){
			int r = (int)(Math.random()*arr.length);
			tmp = arr[i];
			arr[i] = arr[r];
			arr[r] = tmp;
			
		}
	}
	
	static void shiftRight(double [] arr, int n){
		for(int j=0; j<n; j++){
			double tmp = arr[arr.length-1];
			for(int i=arr.length-1; i>0; i--){
				arr[i] = arr[i-1];
			}
			arr[0] = tmp;
		}
	}
	
	static void shiftLeft(double [] arr, int n){
		for(int j=0; j<n; j++){
			double tmp = arr[0];
			for(int i=0; i<arr.length-1; i++){
				arr[i] = arr[i+1];
			} 
			arr[arr.length-1] = tmp;
		}
	}
	
	
}