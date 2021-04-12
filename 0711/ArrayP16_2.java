import java.util.Scanner;
class ArrayP16_2{
	public static void main(String [] args){
		System.out.print("배열 원소 개수: ");
		Scanner s = new Scanner(System.in);
		int element = s.nextInt();
		double [] arr = new double[element];
		ArrInit(arr);
		ArrPrint(arr);
		System.out.println();
		System.out.printf("모든 원소의 합: %.1f\n", SumElement(arr));
		System.out.printf("원소 중 최댓값: %.1f\n", MaxElement(arr));
		System.out.printf("최댓값 인덱스: %d\n", MaxIndex(arr));
		Shuffle(arr);
		System.out.println("랜덤셔플: ");
		ArrPrint(arr);
		Rotate(arr, "left", 4);
		System.out.println("왼쪽으로 4칸 쉬프트: ");
		ArrPrint(arr);
		Rotate(arr, "right", 3);
		System.out.println("오른쪽으로 3칸 쉬프트: ");
		ArrPrint(arr);
		System.out.println("오름차순: ");
		arrange(arr);
		ArrPrint(arr);
		System.out.println("내림차순: ");
		arrange2(arr);
		ArrPrint(arr);
		
		
	}
	
	static void ArrInit(double [] array){
		for(int i=0; i<array.length; i++){
			array[i] = 10*Math.random();
			
		}
	}
	
	static void ArrPrint(double [] array){
		for(double d: array){
			System.out.printf("%.1f\t", d);
		}
		System.out.println();
	}
	
	static double SumElement(double [] array){
		double sum = 0;
		for(double d: array){
			sum+=d;
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
		for(int i=1; i<array.length; i++){
			if(max<array[i]){
				max=array[i];
				index = i;
			}
		}
		return index;
		
	}
	
	static void Shuffle(double [] array){ // index를 랜덤으로 받아 그 index의 값과 서로 교체
		double tmp;
		for(int i=0; i<array.length; i++){
			tmp = array[i];
			int j = (int)(array.length*Math.random());
			array[i]=array[j];
			array[j] = tmp;
		}
		
	}
	
	
	static void Rotate(double [] array, String lr, int n){
		if(lr.equals("right")){
			for(int j=0; j<n; j++){
			double tmp = array[array.length-1];
				for(int i=array.length-1; i>0; i--){
					array[i]=array[i-1];
				}
				array[0] = tmp;
			}				
		}
		
		else if(lr.equals("left")){
			for(int j=0; j<n; j++){
			double tmp = array[0];
				for(int i=0; i<array.length-1; i++){
					array[i]=array[i+1];
				}
				array[array.length-1] = tmp;
			}
			
		}
		
		else System.out.println("오른쪽/왼쪽으로 입력하세요.");
		
		
	}
	
	static void arrange(double [] array){ //오름차순 정렬
		double tmp;
		for(int i=0; i<array.length-1; i++){
			for(int j=i+1; j<array.length; j++){
				if(array[i]>array[j]){
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		
	}
	
	static void arrange2(double [] array){ // 내림차순 정렬
		double tmp;
		for(int i=array.length; i>0; i--){
			for(int j=i-1; j>=0; j--){
				if(array[i]<array[j]){
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
				
			}
		}
	}
	
	
	
	
	
	
	
	/*
	static void rotateRI(double [] array, int n){ //I번 rotate
		int remRot = rot%arr.length;
		for(int i=0; i<remRot; i++) rotateR1(arr); // 1칸 rotate를 반복
	}
	*/
	
	
	
	
	/*
	static void rotateRight(double [] array, int n){
		for(int j=0; j<n; j++){
			double tmp = array[array.length-1];
				for(int i=array.length-1; i>0; i--){
					array[i]=array[i-1];
				}
				array[0] = tmp;
		}				
		
	}
	
	static void rotateLeft(double [] array, int n){
		for(int j=0; j<n; j++){
			double tmp = array[0];
				for(int i=0; i<array.length-1; i++){
					array[i]=array[i+1];
				}
				array[array.length-1] = tmp;
		}				
		
	}
	*/
	
	
	
	/*
	//1번 오른쪽 rotate
	static void rotateR1(double [] array){
		double tmp = array[array.length-1];
			for(int i=array.length-1; i>0; i--){
				array[i]=array[i-1];
			}
			array[0] = tmp;			
		
	}
	
	//1번 왼쪽 rotate
	static void rotateL1(double [] array){
		double tmp = array[0];
				for(int i=0; i<array.length-1; i++){
					array[i]=array[i+1];
				}
				array[array.length-1] = tmp;
		
		
	}
	
	*/
	
	// 여러 칸 rotate : 1칸을 n번 반복하기
	// 또는 tmp배열에 끝 n개를 저장해두고 남은 원소들은 n칸 shift 후 빈칸에 tmp배열원소 넣기
	
	
}
	
	
