// Ŀ�ǵ���ο��� ������� �̸��� ����, ����(�Ǽ�: 3.7...) �Է¹޾�, ***���� 10�� �� ���̴� ***��, ������ **�Դϴ�. ���
class CommandLineTest{
	public static void main(String [] args){
		// ����ڰ� Ŀ�ǵ���ο� 2���� ���ڸ� �ۼ����� ���� ��� ��ġ ����
		if(args.length<3){
			System.out.println("Usage: java CommandLineTest �̸� ���� ����");
			return; // ���α׷� ����
		}
		
		// ȫ�浿 5 : args[0]="ȫ�浿", args[1]="5"
		// "5"+10
		// "5" -> 5
		int age = Integer.parseInt(args[1]); // java.lang ��Ű���� Integer Ŭ���� ����
		// ����(wrapper) Ŭ���� : Integer, Double, Byte, ...
		double score = Double.parseDouble(args[2]);
		System.out.printf("%s���� 10�� �� ���̴� %d��, ������ %.1f�Դϴ�.\n", args[0], 10+age, score);
		
	}
}