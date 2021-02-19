package recursividade;

public class TesteCalculadora {

	public static void main(String[] args) {

		
		int fatorialNR = Tabuada.fatorialNaoRecursivo(5);
		System.out.println(fatorialNR);
		
		int fatorialR = Tabuada.fatorialNaoRecursivo(5);
		System.out.println(fatorialR);
	}

}
