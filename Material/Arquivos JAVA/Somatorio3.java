import java.util.Scanner; 
public class Somatorio3 {
   public static void main(String[] args) {
     int numero, soma = 0, cont = 0, rep; 
     double media;
     Scanner teclado = new Scanner(System.in);
     System.out.print("Quantos n�meros ser�o informados? ");
     rep = teclado.nextInt();
     for (int aux=1; aux<=rep; aux++) {
        System.out.print("Informe um n�mero inteiro: ");
        numero = teclado.nextInt();
        if (numero >= 1 && numero <= 100) {
           soma += numero;
           cont++;
        }
     }
     media = (float) soma / cont;
     System.out.println("A m�dia deu "+media);
     teclado.close();
   }
}

