package ex;
/*	Ŭ����		: ���赵 (����)
 * 	�ν��Ͻ�		: ��ǰ   (ȣ��)
 * 	��ü			: 
 */


public class ex2_class_instance_object {

	public static void sum (int a, int b) {
		System.out.println(a+b);
	}
	public static void avg (int a, int b) {
		System.out.println((a+b)/2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���α׷��� �߿��� : �ߺ��� ���� (��Ȱ�뼺 Ȱ��) -> �޼ҵ� ���
		// refactoring : ���� �ϰ� ����������, �ڵ��� ������ �����Ͽ� ȿ�������� �����ϴ� ����
		sum(10,20); //System.out.println(10+20);
		sum(30,40); //System.out.println(30+40);
		// ������ ����, ȿ������ ������ ���� ���� ��
		
		//������
		int left, right;
		//1�� �׷�
		left = 10;
		right = 20;
		//�߰� ����
		sum(left,right);
		avg(left,right);
		//2���׷�
		left = 30;
		right = 40;
		//�߰� ����
		sum(left,right);
		avg(left,right);
		//-> �����߻� : ��������� ���� �����ϱ� ������ �߰� ���������� ��ȯ�� ����� �ִ�.
		// -> ������ ���λ� �߰� ���� ����
		// -> �����Ǿ� �ִ� �����Ϳ� ������ �׷��� �Ҽ� ������? -> ��ü���� ����� ��� (���������� ��뵵 ����)
		
		
		// �ذ�å ��ü�� ����
		
		ex2_Cal c1 = new ex2_Cal(); //�ν��Ͻ�
		c1.setOperands(10,20);
		c1.sum();
		
		ex2_Cal c2 = new ex2_Cal();
		c2.setOperands(30,40);
		c2.sum();
		c2.avg();
		
		// �׷�ȭ ���Ѽ� ������ �ִ� �����鳢�� ���� -> ���������� ������ �˼� ������, ������ ������ ������
		
		
		
	}

}