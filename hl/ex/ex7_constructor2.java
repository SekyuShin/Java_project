package ex;

class cal {
	int left,right;
	//��ӵ� Ŭ������ �����ڸ� ����� ���ؼ� �⺻ �����ڸ� ��������� �������Ѵ�.
	public cal() {}
	public cal(int left,int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void insert(int left,int right) {
		this.left = left;
		this.right = right;
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class subCal extends cal {
	/*public subCal(int left, int right) {
		//�ߺ��� ������
		this.left = left;
		this.right = right;
	}*/
	//�ذ�å
	public subCal(int left,int right) {
		super(left,right);
		//���� Ŭ������ ������
		
		//���� Ŭ������ ���� Ŭ������ �����Ҽ� �ִ� Ű���� super
		//���� Ŭ������ �ν��Ͻ��� ���� Ŭ������ �ν��Ͻ��Ŀ� ����Ǳ� ������ �����ڸ� �߰��ϰ� ������ super������ ����Ѵ�.
	}
}


public class ex7_constructor2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ڹٴ� �����ڸ� �����, default�����ڸ� ����� ���� �ʴ´�.
		// ��� ���� Ŭ������ �����ڸ� �����Ҷ�, superŬ������ �⺻ �����ڸ� ȣ���Ѵ�. �̶�, �⺻ �����ڰ� ������ ������ �߻��Ѵ�.
		
		
		
	}

}
