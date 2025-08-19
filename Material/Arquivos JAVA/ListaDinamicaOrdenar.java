import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class ListaDinamicaOrdenar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;

		// DECLARA��O DE UMA LISTA DIN�MICA DE STRING
		List<String> listaNomes = new ArrayList<String>();

		do {
			System.out.print("Digite um nome (X para encerrar): ");
			nome = teclado.nextLine();
			if (!nome.equalsIgnoreCase("X"))
				// ADICIONA O NOME NA LISTA
				listaNomes.add(nome);
		} while (!nome.equalsIgnoreCase("X"));

		// ORDENA EM ORDEM CRESCENTE (ALFAB�TICA)
		listaNomes.sort(null);
		// ORDENA EM ORDEM CRESCENTE DESCONSIDERANDO MA�USCULO/MIN�SCULO
		listaNomes.sort(String.CASE_INSENSITIVE_ORDER);
		// ORDENA EM ORDEM DECRESCENTE (ALFAB�TICA INVERSA)
		listaNomes.sort(new Comparator<String>() {
			public int compare(String ordena1, String ordena2) {
				return ordena2.compareToIgnoreCase(ordena1);
			}
		});

		// IMPRIME O CONTE�DO DE UMA LISTA DIN�MICA
		for (String nomes : listaNomes)
			System.out.println(nomes);
		
		teclado.close();
	}
}
