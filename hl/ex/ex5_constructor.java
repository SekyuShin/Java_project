package ex;


	/*
	 * �����ڴ� ��ü�� �ʱ�ȭ�� ��� +
	 * constructor
	 */

class Calculator2 {
    int left, right;
 
    public Calculator2(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
public class ex5_constructor {
 
    public static void main(String[] args) {
 
        Calculator2 c1 = new Calculator2(10, 20); // new������ �������� �������� ȣ���̴�. 
        c1.sum();
        c1.avg();
 
        Calculator2 c2 = new Calculator2(20, 40);
        c2.sum();
        c2.avg();
    }
 
}