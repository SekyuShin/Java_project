package ex;

class C {
	int v =10;
	void m() {
		int v =20;
		System.out.println(v);
		System.out.println(this.v);
	}
}



public class ex4_scope04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C();
		c1.m();
		
	}

}
/*
 * ��ȿ������ ��������, �������� ������ �� �� �����ϱ� �����ϵ��� �� ���̴�.
 * ���� ���� ���α׷��ֿ����� ��� �޼ҵ忡�� ������ ������ ������ ����� �˾ǽ� �ϴ� ������ �ִ�. -> ���� �߻� Ȯ�� ����
 * ��ü���� ���α׷������� �ݱ�� ������ �ʴ´�.���������� ������ ���� �Ҽ� �ֱ� ������
 */