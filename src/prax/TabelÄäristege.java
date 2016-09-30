package prax;

public class TabelÄäristege {


	public static void main(String args[]) {

		int tabelisuurus = 7;
		for (int i = 0; i < tabelisuurus; i++) {
			for (int j = 0; j < tabelisuurus; j++) {
				if (j == i || j+i == tabelisuurus - 1 )
						 {
					System.out.print("x ");
				} else {
					System.out.print("0 ");
				}

			}
			System.out.println(); // reavahetuseks
		}
	}
}