package ex;

public class ex4_possible_range {

	/*
	 * ��ȿ ����
	 * ������ �޼ҵ� ���� �͵��� ����Ҽ� �ִ� ���� �̸��� �ֱ� �����̴�.
	 * ���α׷��� Ŀ���� ���� ���� ������ �̸��� �浹�ϰ� �ȴ�. �̸� �ذ��ϱ� ���ؼ� ��ȵ� ���� ��ȿ������� �����̴�. ���� ������(Scope)��� �Ѵ�.
	 */
	static void a() {
		int i=0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =0;i<5;i++) {
			a(); //�޼ҵ带 ������ѵ� a�� i�� main �� i�ʹ� ���� �ٸ� �����̴�. �̰��� �ٷ� ��ȿ������ �����̴�.(�浹�� ����)
			System.out.println(i);
		}
	}

}
