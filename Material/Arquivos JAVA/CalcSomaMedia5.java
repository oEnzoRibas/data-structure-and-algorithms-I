import java.util.Scanner; 
public class CalcSomaMedia5 {
	public static void main(String[] args) {
	     int n1, n2, n3, n4, n5, soma;
	     float media;
	     Scanner teclado = new Scanner(System.in);
	     System.out.print("Digite o primeiro n�mero: ");
		  n1 = teclado.nextInt();
	     System.out.print("Digite o segundo n�mero: ");
	 	  n2 = teclado.nextInt();
	 	  System.out.print("Digite o terceiro n�mero: "); 	
		  n3 = teclado.nextInt();
	 	  System.out.print("Digite o quarto n�mero: ");	
		  n4 = teclado.nextInt();
	 	  System.out.print("Digite o quinto n�mero: ");  	
		  n5 = teclado.nextInt();
	  	  soma = n1 + n2 + n3 + n4 + n5;
	  	  media = (float)soma / 5;
	 	  System.out.println("Soma = "+soma);
	 	  System.out.println("M�dia = "+media);
	 	  teclado.close();
	}

}
