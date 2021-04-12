class MtxMethod{
	public static void main(String [] args){
		double [][] mtx = new double [3][2];
		
		InitMtx(mtx);
		PrintMtx(mtx);
		System.out.println();
		System.out.printf("모든 원소의 합: %.1f\n", SumMtx(mtx));
		System.out.printf("0열 원소의 합: %.1f\n", ColSum(mtx)[0]);
		System.out.printf("1열 원소의 합: %.1f\n", ColSum(mtx)[1]);
		System.out.printf("합이 최대인 행: %d\n", MaxSumRow(mtx));
		System.out.printf("최댓값의 인덱스: %d행 %d열\n", MaxIndex(mtx)[0], MaxIndex(mtx)[1]);
		System.out.println("랜덤 셔플");
		Shuffle(mtx);
		PrintMtx(mtx);
		
		
	}
	
	static void InitMtx(double [][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				arr[i][j] = Math.random()*10;
			}
		}
	}
	
	static void PrintMtx(double [][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				System.out.printf("%.1f\t", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	static double SumMtx(double [][] arr){
		double sum=0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				sum+=arr[i][j];
			}
		}
		return sum;
	}
	
	static double [] ColSum(double [][] arr){
		double [] sum = {0,0};
		for(int j=0; j<arr[0].length; j++){
			for(int i=0; i<arr.length; i++){
				sum[j]+=arr[i][j];
			}
		}
		return sum;
	}
	
	static int MaxSumRow(double [][] arr){
		double [] sum= {0,0,0};
		double max=sum[0];
		int row=0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				sum[i]+=arr[i][j];
				}
			}
		
		
		for(int i=0; i<sum.length; i++){
			if(max<sum[i]){
				max=sum[i];
				row=i;
			}
		}
		return row;
		
	}
	
	static int [] MaxIndex(double [][] arr){
		double max = arr[0][0];
		int [] index = {0,0};
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				if(max<arr[i][j]){
					max=arr[i][j];
					index[0]=i;
					index[1]=j;
				}
			}
		}
		
		return index;
		
	}
	
	static void Shuffle(double [][] arr){
		double tmp;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				int r = (int)(Math.random()*arr.length);
				int c = (int)(Math.random()*arr[0].length);
				tmp = arr[i][j];
				arr[i][j] = arr[r][c];
				arr[r][c] = tmp;
			}
		}
	}
	
	
	
	
	
}