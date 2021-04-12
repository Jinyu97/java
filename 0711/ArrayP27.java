class ArrayP27{
	public static void main(String [] args){
		double [][] mat = new double[3][2];
		InitArr(mat);
		PrintArr(mat);
		System.out.printf("�迭 ������ ��: %.1f\n", SumArr(mat));
		System.out.printf("1�� ������ ��: %.1f\n", ColSum(mat)[0]);
		System.out.printf("2�� ������ ��: %.1f\n", ColSum(mat)[1]);
		//ColSum(mat) = �迭
		System.out.printf("������ ���� �ִ��� ��: %d\n", MaxRowIndex(mat));
	
		Shuffle(mat);
		System.out.println("���� ����: ");
		PrintArr(mat);
		int [] index = MaxEltIndex(mat);
		System.out.printf("�ִ��� �ε���: %d�� %d��\n", index[0], index[1]);
		
	}
	
	
	static void InitArr(double [][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = 10*Math.random();
			}
		}
		
	}
	
	static void PrintArr(double [][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%.1f\t", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	static double SumArr(double [][] arr){
		double sum = 0;
		for(double [] row: arr){
			for(double elt: row){
				sum+=elt;
			}
		}
		return sum;
	}
	
	
	static double [] ColSum(double [][] arr){ //���� ���� ��ȯ
		double [] sum = new double[arr[0].length]; // ���� ������ŭ ���� ������ �迭
		
		for(int j=0; j<sum.length; j++){
			for(int i=0; i<arr.length; i++){
				sum[j]+=arr[i][j];
			}
		}
		return sum;
		
	}
	
	static int MaxRowIndex(double [][] arr){
		double [] sum = new double[arr.length];
		int index=0;
		double max;
		for(int i=0; i<sum.length; i++){
			for(int j=0; j<arr[0].length; j++){
				sum[i] += arr[i][j];
				
			}
		}
		max = sum[0];
		for(int i=0; i<sum.length; i++){
			if(max<sum[i]){
				max=sum[i];
				index = i;
			}
		}
		
		return index;
	}
	
	static int [] MaxEltIndex(double [][] arr){
		double max=arr[0][0];
		int [] index = {0,0};
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				if(max<arr[i][j]){
					max=arr[i][j];
					index[0] = i;
					index[1] = j;
					//index = {i,j}; : �ʱ�ȭ�Ҷ��� ����
				}
			}
		}
		return index;
		
	}
	
	static void Shuffle(double [][] arr){ //arr[i][j] <-> arr[r][c]
		int r = (int)(Math.random()*arr.length);
		int c = (int)(Math.random()*arr[0].length);
		double tmp;
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				tmp= arr[i][j];
				arr[i][j]=arr[r][c];
				arr[r][c]=tmp;
			}
		}
	}
	
	
	
	// for-each������: �� ���� �Ѱ���
	/*
	static void PrintArr(double [][] arr){
		for(double [] row: arr){ //�� ���� �Ѱ��ֹǷ� 1�����迭 ������ ����
			for(double elt: row){
				System.out.printf("%.1f\t", elt);
			}
			System.out.println();
		}
	}
	*/
	
}