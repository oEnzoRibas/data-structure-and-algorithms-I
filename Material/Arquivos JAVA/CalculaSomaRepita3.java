import java.util.Scanner;

public class CalculaSomaRepita3 {
	public static void main(String[] args) {
     int numero, soma = 0, cont = 0, pares = 0;
     double media;
     Scanner teclado = new Scanner(System.in);
     System.out.println("Para finalizar digite -1");           
     do {
       System.out.print("Informe um n�mero: ");
       numero = teclado.nextInt();
       if (numero != -1) {
          soma += numero;
          cont++;
          if (numero % 2 == 0)
             pares++;
       }
     } while (numero != -1); 
     media = (float) soma / cont;
     System.out.println("M�dia = "+media);
     System.out.println("Quant. de n�meros pares = "+pares);
     teclado.close();
   }
}