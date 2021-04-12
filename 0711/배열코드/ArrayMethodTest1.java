import java.util.Scanner;

class ArrayMethodTest1{
	public static void main(String [] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.print("배열 성분 개수: ");
		int len = s.nextInt();
		
		double [] arr = new double[len];
		printArr(arr);
		initArr(arr);
		printArr(arr);
		System.out.printf("배열 성분의 합: %.1f\n", sumArr(arr));
		System.out.printf("배열 성분의 최댓값: %.1f\n", maxElt(arr));
		System.out.printf("최댓값의 인덱스: %d\n", indexOfMaxElt(arr));
		shuffle(arr);
		printArr(arr);
		rotateR1(arr);
		printArr(arr);
		rotateRI(arr, 104);
		printArr(arr);
		order(arr);
		printArr(arr);
	}
	static void order(double [] arr){
		double tmp;
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	static void rotateRI(double [] arr, int rot){
		int remRot = rot%arr.length;	
		for(int i=0; i<remRot; i++) rotateR1(arr);
	}
	static void rotateR1(double [] arr){
		double tmp = arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)	arr[i] = arr[i-1];
		arr[0] = tmp;
	}
	static void shuffle(double [] arr){
		double tmp;
		int r;
		for(int i=0; i<arr.length; i++){
			r = (int)(Math.random()*arr.length); //(int)0이상 5미만의 실수=0,1,2,3,4
			tmp = arr[i];
			arr[i] = arr[r];
			arr[r] = tmp;
		}
	}
	
	static int indexOfMaxElt(double [] arr){
		double max = arr[0];
		int index = 0;
		
		for(int i=1; i<arr.length; i++){
			if(max<arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		return index;
	}
	static double maxElt(double [] arr){
		double max = arr[0];//배열의 첫원소를 최댓값으로 가정
		
		for(int i=1; i<arr.length; i++)
			if(max<arr[i]) max = arr[i];
		
		return max;
	}
	static double sumArr(double [] arr){
		double sum =0;
		for(double d:arr){
			sum += d;
		}
		return sum;
	}
	
	static void printArr(double [] dArr){
		for(double elt:dArr){
			System.out.printf("%.1f\t", elt);
		}
		System.out.println();
	}
	static void initArr(double [] dArr){
		for(int i=0; i<dArr.length;i++)	
			dArr[i] = Math.random()*10;
	}
}







