package prax;

public class SuurRuut {
	public static void main(String args[]) {

		int tabelisuurus = 7;
		for (int i = 0; i < tabelisuurus; i++) {
			for (int j = 0; j < tabelisuurus; j++) {
				if (j == i)
						 {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}

			}
			System.out.println(); // reavahetuseks
		}
	}
}