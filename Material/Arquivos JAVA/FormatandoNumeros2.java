import java.text.NumberFormat;

public class FormatandoNumeros2 {
	public static void main(String[] args) {
		double valor = 12005.867;
		String valorFormatado;
		valorFormatado = NumberFormat.getNumberInstance().format(valor);
		System.out.println(valorFormatado);
		// Imprimir�: 12.005,867
		valorFormatado = NumberFormat.getIntegerInstance().format(valor);
		System.out.println(valorFormatado);
		// Imprimir�: 12.006
		valorFormatado = NumberFormat.getCurrencyInstance().format(valor);
		System.out.println(valorFormatado);
		// Imprimir�: R$ 12.005,87

		valor = 0.5;
		valorFormatado = NumberFormat.getPercentInstance().format(valor);
		System.out.println(valorFormatado);
		// Imprimir�: 50%
	}
}
