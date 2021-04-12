import java.util.Scanner;

class ArrayMethodTest2{
	public static void main(String [] args){
		double [][] mat = new double[3][2];
		initArr(mat);
		printArr(mat);
		
		System.out.printf("배열 성분의 합: %.1f\n", sumArr(mat));
		System.out.printf("1열 성분의 합: %.1f\n", colSum(mat)[0]);
		System.out.printf("2열 성분의 합: %.1f\n", colSum(mat)[1]);
		//colSum(mat) = 배열
		
		/*System.out.printf("배열 성분의 최댓값: %.1f\n", maxElt(arr));
		System.out.printf("최댓값의 인덱스: %d\n", indexOfMaxElt(arr));
		*/
		shuffle(mat);
		printArr(mat);
		int [] index = indexOfMaxElt(mat);//index = {i, j}
		System.out.printf("최댓값은 %d행 %d열에 존재\n", index[0]+1, index[1]+1);
	}
	static void shuffle(double [][] arr){
		double tmp;
		
		for(int i=0; i<arr.length; i++){
		//arr[i][j]<->arr[r][c]
			for(int j=0; j<arr[0].length; j++){
				int r = (int)(Math.random()*arr.length);
				int c = (int)(Math.random()*arr[0].length);
				tmp = arr[i][j];
				arr[i][j] = arr[r][c];
				arr[r][c] = tmp;
			}
		}
		
	}
	
	static int [] indexOfMaxElt(double [][] arr){
		//int [] index = new int[2];//
		double max = arr[0][0];
		int [] index = {0,0};
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length;j++){
				if(max < arr[i][j]){
					max = arr[i][j];
					index[0] = i;
					index[1] = j;
				}
			}
		}
		
		return index;
	}
	
	
	
	static double [] colSum(double [][] arr){// 열별 합을 반환
		double [] sum = new double[arr[0].length];
		for(int j=0; j<sum.length; j++)
			for(int i=0; i<arr.length;i++)
				sum[j] += arr[i][j];
		return sum;
	}
	static double sumArr(double [][] arr){
		double sum = 0;
		
		for(double [] row:arr){
			for(double elt:row){
				sum += elt;
			}
		}
		return sum;
	}
	static void printArr(double [][] arr){
		for(double [] row:arr){
			for(double elt:row){
				System.out.printf("%.1f\t", elt);
			}
			System.out.println();
		}
	}
	static void initArr(double [][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length;j++)
				arr[i][j] = Math.random()*10;
		}
	}
	
	
}







