package praktikum6;

public class Kysija {

	public static void main(String[] args) {

		System.out.println("Sisesta min ja max arv");
		int min = TextIO.getlnInt();
		int max = TextIO.getlnInt();

	
		
	}

	public static int kasutajaSisestus(int min, int max) {
		return kasutajaSisestus("Sisesta arv vahemikus " + min + " kuni " + max + ".", min, max);
	}

	public static int kasutajaSisestus(String kysimus, int min, int max) {
		// l6putu tsykkel
		while (true) {
			// trykime ekraanile kysimuse
			TextIO.putln(kysimus);

			// kysime kasutajalt sisestuse
			int sisestus = TextIO.getlnInt();

			// kui sisestus on sobilikus vahemikus, tagastame selle
			// return-k2sk tagastab v22rtuse ja l2heb yhtlasi ka meetodist v2lja
			if (sisestus >= min && sisestus <= max) {
				return sisestus;
			}
			TextIO.putln("Arv ei ole sobilikus vahemikus, sisesta uuesti.");
		}
	}
}