package ex;

public class ex4_scope02 {
	
	static void a() {
		String title = "coding everybody";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
		//System.out.println(title); //���� �߻� title�� a() �޼ҵ忡���� ��ȣ�� ��������
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		//System.out.println(i); //i�� ��ȿ������ for���� �������� ��ȿ�ϴ�.

	}

}
