import java.util.Scanner;

public class SomaNumeros {
	public static void main(String[] args) {
		int numero, cont = 0, soma = 0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Informe um n�mero inteiro: ");
			numero = teclado.nextInt();
			cont++;
			soma += numero;
		} while (soma <= 1000);
		System.out.println("A soma dos n�meros ultrapassou 1000");
		System.out.println("Foram informados " + cont + " n�meros");
		teclado.close();
	}
}