package ex;
/*
 * ���� �޼ҵ� �̸������� �Ű������� ��ȭ�� ���� �ٸ� ����� �Ҽ� �ְԲ� ����� ���� �����ε�
 * 
 */
class cal_overloading {
	int a,b;
	int c;
	public void setOperands() {}
	public void setOperands(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.printf("a = %d, b = %d\n",a,b);
	}
	public void setOperands(int a,int b,int c) {
		this.setOperands(a,b);
		this.c = c;
		System.out.printf("a = %d, b = %d, c = %d\n",a,b,c);
	}
	
	
	
}

public class ex9_overloading1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
