import java.util.Scanner;
class ArrayP16{
	public static void main(String [] args){
		System.out.print("배열 원소 개수: ");
		Scanner s = new Scanner(System.in);
		int element = s.nextInt();
		double [] arr = new double[element];
		ArrInit(arr);
		ArrPrint(arr);
		System.out.println("모든 원소의 합: "+SumElement(arr));
		System.out.println("원소 중 최댓값: "+MaxElement(arr));
		System.out.println("최댓값 인덱스: "+MaxIndex(arr));
		
		
	}
	
	static void ArrInit(double [] array){
		for(int i=0; i<array.length; i++){
			array[i] = 10*Math.random();
			
		}
	}
	
	static void ArrPrint(double [] array){
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]+"\t");
		}
		System.out.println();
	}
	
	static double SumElement(double [] array){
		double sum = 0;
		for(int i=0; i<array.length; i++){
			sum+=array[i];
		}
		return sum;
	}
	
	static double MaxElement(double [] array){
		double max = array[0];
		for(int i=0; i<array.length; i++){
			if(max<=array[i]) max=array[i];
		}
		return max;
		
	}
	
	static int MaxIndex(double [] array){
		double max = array[0];
		int index = 0;
		for(int i=0; i<array.length; i++){
			if(max<=array[i]){
				if(max==array[i]) continue;
				max=array[i];
				index = i;
			}
		}
		return index;
		
	}
	
	
	
	
	
}