import java.util.Scanner; 
public class TrimestreIf {
   public static void main(String[] args) {
      int mes;
      Scanner teclado = new Scanner(System.in);
      System.out.print("Entre com o n�mero do ano: ");
      mes = teclado.nextInt();
      if (mes < 1 || mes > 12)
         System.out.println("C�digo do m�s inv�lido");
      else if (mes <= 3)
              System.out.println("M�s pertence 1� trimestre");
           else if (mes <= 6)
                   System.out.println("M�s pertence 2� trimestre");
                else if (mes <= 9)
                        System.out.println("M�s pertence 3� trimestre");
                     else
                        System.out.println("M�s pertence 4� trimestre");
      teclado.close();
   }
}