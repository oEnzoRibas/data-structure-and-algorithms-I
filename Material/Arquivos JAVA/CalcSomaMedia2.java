import java.util.Scanner;

public class CalcSomaMedia2 {
	public static void main(String[] args) {
		int n1, n2, soma;
		double media;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		n1 = teclado.nextInt();
		System.out.print("Digite outro n�mero: ");
		n2 = teclado.nextInt();
		soma = n1 + n2;
		media = (float) soma / 2;
		System.out.println("Soma: " + soma);
		System.out.println("M�dia: " + media);
		teclado.close();
	}
}
