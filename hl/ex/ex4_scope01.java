package ex;

public class ex4_scope01 {
/*
 * �پ��� ��ȿ������
 * ���͸��� �����غ��ƶ�. ���͸� �������� ���ϸ� �ߺ��� �ȵ����� ���͸� ���� ���ϸ���� �ߺ��� �ŵ� ������ ����.
 * 
 */
	
	//���������� �߸� ����� ����, �ǵ�ġ ���� ���� ������ �ɸ���.
	static int i; //��������(global)
	static void a() {
		i=0; //�ذ�å int i; -> a() �޼ҵ� �������� ��ȿ�� ���� ����
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(i=0;i<5;i++) { //�ذ�å int i; -> ���������� ������ �� (for���� �ȿ����� ��ȿ�� ��������)  
			a();
			System.out.println(i);
		}
	}

}

