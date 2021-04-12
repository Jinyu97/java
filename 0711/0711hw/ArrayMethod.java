import java.util.Scanner;
class ArrayMethod{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("배열의 크기: ");
		int elt = s.nextInt();
		
		double [] array = new double[elt];
		
		InitArray(array);
		PrintArray(array);
		System.out.printf("배열 원소의 합: %.1f\n", SumArray(array));
		System.out.printf("원소 중 최댓값: %.1f\n", MaxElement(array));
		System.out.printf("최댓값의 인덱스: %d\n", IndexOfMax(array));
		Shuffle(array);
		System.out.println("랜덤 셔플: ");
		PrintArray(array);
		System.out.println("오른쪽으로 3칸 shift");
		Rotate(array, "right", 3);
		PrintArray(array);
		System.out.println("왼쪽으로 5칸 shift");
		Rotate(array, "left", 5);
		PrintArray(array);
		System.out.println("오름차순 정렬");
		ArrangeUp(array);
		PrintArray(array);
		System.out.println("내림차순 정렬");
		ArrangeDown(array);
		PrintArray(array);
		
		
	}
	
	static void InitArray(double [] arr){
		for(int i=0; i<arr.length; i++){
			
			arr[i] = Math.random()*10;
		}
		
	}
	
	static void PrintArray(double [] arr){
		for(int i=0; i<arr.length; i++){
			System.out.printf("%.1f\t", arr[i]);
		}
		System.out.println("\n");
	}
	
	static double SumArray(double [] arr){
		double sum=0;
		for(int i=0; i<arr.length; i++){
			sum+=arr[i];
		}
		
		return sum;
	}
	
	static double MaxElement(double [] arr){
		double max=arr[0];
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		return max;
		
	}
	
	static int IndexOfMax(double [] arr){
		int index=0;
		double max=arr[0];
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
				index = i;
			}
		}
		return index;
		
	}
	
	static void Shuffle(double [] arr){
		double tmp;
		for(int i=0; i<arr.length; i++){
			int j = (int)(Math.random()*5);
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
	}
	
	static void Rotate(double [] arr, String lr, int n){
		if(lr.equalsIgnoreCase("right")){
			for(int j=0; j<n; j++){
				double tmp = arr[arr.length-1];
				for(int i=arr.length-1; i>0; i--){
					arr[i]=arr[i-1];
				}
				arr[0]=tmp;
			}
		}
		else if(lr.equalsIgnoreCase("left")){
			for(int j=0; j<n; j++){
				double tmp=arr[0];
				for(int i=0; i<arr.length-1; i++){
					arr[i]=arr[i+1];
				}
				arr[arr.length-1] = tmp;
			}
		}
		
		else System.out.println("방향은 left 또는 right 입력");
		
	}
	
	static void ArrangeUp(double [] arr){
		double tmp;
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
	
	static void ArrangeDown(double [] arr){
		double tmp;
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]<arr[j]){
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
	
	
	
	
	
}