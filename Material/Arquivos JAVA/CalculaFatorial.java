import java.util.Scanner; 
public class CalculaFatorial {
// Fun��o : calcular o fatorial de um n�mero 
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      System.out.print("Informe um n�mero: ");
      long numero = teclado.nextLong();
      long fatorial = 1L;
      for(long contador = 2; contador <= numero; contador++) {
         fatorial = fatorial * contador;
      }
      System.out.println("Fatorial = " + fatorial);
      teclado.close();
   }
}