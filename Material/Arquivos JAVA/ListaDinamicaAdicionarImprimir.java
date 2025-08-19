import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDinamicaAdicionarImprimir {

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
		
		// IMPRIME O CONTE�DO DE UMA LISTA DIN�MICA
		for (int aux=0; aux < listaNomes.size(); aux++)
			System.out.println(listaNomes.get(aux));

		teclado.close();
	}
}
