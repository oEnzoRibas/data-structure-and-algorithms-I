import java.util.Scanner;

public class Exemplo3If {
	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		numero = teclado.nextInt();
		if (numero >= 10 && numero <= 100)
			System.out.println("N�mero est� entre 10 e 100");
		else
			System.out.println("N�mero est� FORA DA FAIXA");
		System.out.print("Fim do programa");
		teclado.close();
	}
}