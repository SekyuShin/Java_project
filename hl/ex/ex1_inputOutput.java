package ex;

import java.util.Scanner;

public class ex1_inputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
		//���۰� ���ÿ� �Է��ϴ� args
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i);
		//�ڹ� �� �����߿� �Է¹ޱ�
		
		while(sc.hasNextInt()) { //�Է°� ����� ������ ���� ������Ŵ
			System.out.println(sc.nextInt()*10);
		}
		
	}

}