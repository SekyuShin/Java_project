package ex;

import java.util.Scanner;

public class ex1_inputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
		//시작과 동시에 입력하는 args
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i);
		//자바 앱 실행중에 입력받기
		
		while(sc.hasNextInt()) { //입력값 생기기 전까지 실행 유보시킴
			System.out.println(sc.nextInt()*10);
		}
		
	}

}
