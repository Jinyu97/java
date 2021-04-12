class Hw7_1{
	public static void main(String [] args){
		setCoord(6,3);
		setCoord(3,6,2);
	}
	
	
	static void setCoord(int x, int y){
		System.out.printf("x, y coordinates: (%d, %d)\n",x,y);
	}
	
	static void setCoord(int x, int y, int z){
		System.out.printf("x, y, z coordinates: (%d, %d, %d)\n", x, y, z);
	}
}