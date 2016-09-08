package praktikum2;

import lib.TextIO;

public class Grupp {
	public static void main(String[] args) {
		
		//muutujate deklareerimine
		
		System.out.println("Sisesta inimeste arv");
		int  inimesed = TextIO.getInt();
		
		System.out.println("Sisesta grupi suurus arv");
		int  grupiSuurus = TextIO.getInt();
		
		int gruppideArv = inimesed / grupiSuurus;
		System.out.println("saab moodustada " + gruppideArv + " grupp");
		
		int j22k = inimesed % grupiSuurus;
		System.out.println("Üle jääb " + j22k + "inimest");
		
		
	}
}

		
		