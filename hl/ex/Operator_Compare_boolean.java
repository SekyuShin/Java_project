package ex;

public class Operator_Compare_boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean ���� ������ �ǹ��ϴ� ������ Ÿ��
		System.out.println(1!=2);
		System.out.println(1==1);
		System.out.println("one"=="one");
		//�� ������
		// >,<,<=,>=
		String str1 = "Hello";
		String str2 = new String("Hello");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		int a = 2;
		
		if(a==1) {
			System.out.println("a = "+1);
			
		} else if (a==2) {
			System.out.println("a = "+2);
		} else {
			System.out.println("a != 1,2");
		}
		
	}

}
