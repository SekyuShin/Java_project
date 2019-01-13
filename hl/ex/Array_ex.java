package ex;

public class Array_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"±èÁ¤±Ù","±èÁ¤ÈÆ","ÀÌ´ë¿±","½Å¼¼±Ô"};
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		
		String[] str2 = new String[4];
		str2[0] = "±è¿©Áø";
		str2[1] = "±èÁ¤Çö";
		str2[2] = "ÀÓ¿¹Áö";
		str2[3] = "¶óÈñÃ¶";
		System.out.println(str2[0]);
		System.out.println(str2[1]);
		System.out.println(str2[2]);
		System.out.println(str2[3]);
		
		for(String e : str) {
			System.out.println(e+"´Ô ¾È³çÇÏ¼¼¿ä");
		}
		
		//¹è¿­ÀÇ ÇÑ°è -> ÄÃ·º¼ÇÀÇ container ±â´É
		
	}

}
