package ex;

public class TypeConversion_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dv = 3.14;
		float fv = 1.23F;
		//�ڵ�������
		int a = 3;
		float b = 1.0F;
		double c = a+b; //�ι��� ������ int-> float->double
		dv = fv; //������ Ÿ���� double ũ�� ������ ����
		//fv = dv; ������ Ÿ���� float�� �� �۱� ������ �Ұ�
		//��, �ڵ��������� ���� ������-> ���� ������ Ÿ���� ������ ����
		//byte < short,char < int < long < float < double
		
		
		//���� ������(����� ������)
		fv = (float)dv;
	
	}

}
