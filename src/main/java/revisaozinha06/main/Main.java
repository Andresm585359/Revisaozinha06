package revisaozinha06.main;

public class Main {

	public static void main(String[] args) {
		Main uau = new Main();
		uau.comecando();

	}

	/*
	 * wowowowwowoooo
	 * 
	 */
	private void comecando() {
		String[] camaradas = { "Lindomar", "Sub-Zero", "Creuza", "Pericles" };

		for (int i = 0; i < 2; i++) {
			if (i == 1) {
				camaradas[i] = "Outro nome Feliz";
			}

			for (int y = 0; y < camaradas.length; y++) {
				System.out.println(camaradas[y]);
			}
			System.out.println("-------------");
		}
		int novoArray = camaradas.length + 1;
		String[] camaradas2 = new String[novoArray];
		
		for (int y = 0; y < camaradas.length; y++) {
			camaradas2[y] = camaradas[y];
		}
		camaradas2[4] = "maizum nome";
		for (int y = 0; y < camaradas2.length; y++) {
			System.out.println(camaradas2[y]);
		}
	}

}
