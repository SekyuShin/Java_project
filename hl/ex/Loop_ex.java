package ex;

public class Loop_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(true) {
			i++;
			System.out.println(i);
			if(i==5) break;
		}
		for(int j =5;j>0;j--) {
			if(j==3) continue;
			System.out.println(j);
		}
	}

}
