package ex;


/* 
 * �������̵��� ����
 * 1. �޼ҵ� �̸�
 * 2. �޼ҵ� �Ű������� ���ڿ� ������ Ÿ�� �׸��� ����
 * 3. �޼ҵ��� ���� Ÿ��
 * 	-> �޼ҵ��� ���¸� �����ϴ� ���׵��� ���о �޼ҵ��� ����(signature)��� �ϳ�.
 */


class SubCal2 extends cal {
	public void sum() { //overriding sum() method
		System.out.println("���� ����� :"+(super.left+super.right));
	}
	public void sub() {
		System.out.println(super.left-super.right);
	}
	/*public double avg() { //�θ� �޼ҵ��� Ÿ���� �ٸ��� ������ ���� �߻�
		return (super.left+super.right)/2;
	}*/
	//-> �ذ� ��� : �θ��� �޼ҵ��� return Ÿ���� �ٲپ� �ش�.
	// �ߺ� ���ϱ�(�θ��� �޼ҵ�� �ڽ��� �޼ҵ��� �ߺ� ���ϱ� -> ���� ������ ����� ������)
	// super.avg();
	//-> �׷��� ���°��� overloading
	
	
}

public class ex8_overriding1 {
	/*
	 * �������̵� ��Ӱ� ���� ������ �ִ�.
	 * ����� �θ�Ŭ������ ������ �޼ҵ带 �ڽ�Ŭ������ ����Ҽ� �ְ�, �ڽ�Ŭ������ ������ �޼ҵ带 �߰��Ҽ� �ִ�.
	 * �̶�, �θ� Ŭ������ �޼ҵ带 �ٲ� �ʿ䰡 ������, �����Ǹ� �Ҽ� �ִ�.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubCal2 c = new SubCal2();
		c.insert(3,5);
		c.sum();
		c.sub();
	}

}