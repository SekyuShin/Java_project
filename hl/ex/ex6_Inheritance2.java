package ex;


class MulCalculator extends Calculator4 {
	public void multiplication() {
		System.out.println(this.left*this.right);
	}
}

class DivCalculator extends MulCalculator {
	public void division () {
		System.out.println((double)this.left/this.right);
	}
}

public class ex6_Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivCalculator c1 = new DivCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
        c1.division();

	}

}



/*
 * ����� ����
 * 	�ڵ��ߺ� ���� , ��Ȱ�뼺 ����, ���� ������ �����ϴ� (���� ���� ��(�������̵� ��))
 *  �θ��� Ŭ������ ����� ������ ���� ��������.
 */