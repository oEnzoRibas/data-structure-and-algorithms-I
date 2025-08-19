import java.util.Scanner; 

public class CalculaJuros {

	public static void main(String[] args) {
	       Scanner teclado = new Scanner(System.in);
	       
	       String nome;
	       double emprestimo, juros, taxaJuros;
	       int meses;
	       
	       // Leitura dos dados de entrada
	       System.out.print("Informe nome da pessoa: ");
	       nome = teclado.nextLine();
	       System.out.print("Informa valor do empr�stimo: ");
	       emprestimo = teclado.nextDouble();
	       System.out.print("Informe quantidade de meses: ");
	       meses = teclado.nextInt();

	       // Determina��o da taxa de juros
	       if (emprestimo <= 5000)
	    	   taxaJuros = 3.5;
	       else
	    	   if (emprestimo <= 10000)
	    		   taxaJuros = 2.5;
	    	   else
	    		   taxaJuros = 1.5;
	       
	       // C�lculo dos juros
	       juros = (emprestimo * taxaJuros / 100) * meses;
	       
	       // Imprimir dados calculados
	       System.out.println("Juros = R$"+juros);
	       
	       teclado.close();          
	}

}
