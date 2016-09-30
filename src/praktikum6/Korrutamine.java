package praktikum6;

public class Korrutamine {
	public static void main(String [] args){
		
		System.out.println("Sisesta muutuja!");
		
		int arv = TextIO.getlnInt();
		int f = kuup(arv);
		System.out.println(f);
		
	}


	private static int kuup(int i) {
		int f=i*i*i;
		return f; 
	}
}


		
		
		
		
	
		
		



