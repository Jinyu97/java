class ArrayTest1{
	public static void main(String [] args){
		int [] arr = {1, 2, 3, 4, 5};
		
		for(int a: arr){ // a�� 100���� ���̱� ������ �迭 ������ �״�� 1, 2, 3, 4, 5
			a *= 100;
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++){ // �迭 ������ ���� 100���ϹǷ� 100, 200, 300, 400, 500
			arr[i] *= 100;
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		
	}
}