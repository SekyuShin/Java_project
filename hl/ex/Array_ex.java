package ex;

public class Array_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"������","������","�̴뿱","�ż���"};
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		
		String[] str2 = new String[4];
		str2[0] = "�迩��";
		str2[1] = "������";
		str2[2] = "�ӿ���";
		str2[3] = "����ö";
		System.out.println(str2[0]);
		System.out.println(str2[1]);
		System.out.println(str2[2]);
		System.out.println(str2[3]);
		
		for(String e : str) {
			System.out.println(e+"�� �ȳ��ϼ���");
		}
		
		//�迭�� �Ѱ� -> �÷����� container ���
		
	}

}
