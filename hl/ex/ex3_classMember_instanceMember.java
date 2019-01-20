package ex;

public class ex3_classMember_instanceMember {
	/*
	 * Ŭ����(���赵)-1�� -> �ν��Ͻ�(��ü) - ������
	 * ��� : ������(����, �޼ҵ�)
	 * ��, Ŭ���� ���(����� ����(��� �ν��Ͻ�����)), �ν��Ͻ� ���(������ �ν��Ͻ����� �ٸ� ���� ������)
	 */

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 c1 = new Calculator1();
		System.out.println(c1.PI);
		
		Calculator1 c2 = new Calculator1();
		System.out.println(c2.PI);
		
		System.out.println(Calculator1.PI); // Ŭ���� ������ ���� ���� ��� ����
		
		
		
		
		
		c1.setOperands(10,20);
		c1.sum();
		c2.setOperands(30,40);
		c2.sum();
		
		c1.base = 10; // static �̱� ������ �����ȴ�. ��, c1.base == c2.base == Calculator.base
		
		c1.sum();
		c2.sum();
		
		/*
		 * Ŭ���� ������ �뵵 ����
		 * 1. �ν��Ͻ��� ���� ������ �ʴ� ���� �ʿ��� ���( ���� �������� PI)
		 * 2. �ν��Ͻ��� ������ �ʿ䰡 ���� ���� Ŭ������ �����ϰ� ���� ��� (���� ��ü�� ������ �ʾƵ� ��� ����)
		 * 3. ���� ���� ������ ��� �ν��Ͻ��� �����ؾ� �ϴ� ���
		 */
		
		
		
		
		
	}

}

class Calculator1 {
	static double PI = 3.14; 	//Ŭ���� ���� (��� �ν��Ͻ��� �����ϴ� ����)
	static int base =0;
	int left,right;				// �ν��Ͻ� ���� (������ �ν��Ͻ��� ������ ����)- ���� �ٸ���.
	
	public void setOperands(int left,int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right+base);
	}
	public void avg() {
		System.out.println((this.left + this.right+base)/2);
	}
}
