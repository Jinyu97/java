class ArrayTest1{
	public static void main(String [] args){
		int [] arr = {1, 2, 3, 4, 5};
		
		for(int a: arr){ // a를 100배한 것이기 때문에 배열 성분은 그대로 1, 2, 3, 4, 5
			a *= 100;
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++){ // 배열 성분을 직접 100배하므로 100, 200, 300, 400, 500
			arr[i] *= 100;
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		
	}
}