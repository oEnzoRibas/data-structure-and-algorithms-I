import java.util.Scanner; 
public class TrimestreSwitch {
   public static void main(String[] args) {
      int mes;
      Scanner teclado = new Scanner(System.in);
      System.out.print("Entre com o n�mero do ano: ");
      mes = teclado.nextInt();
      switch (mes) {
          case 1: case 2: case 3:
             System.out.println("M�s pertence 1� trimestre");
             break;
          case 4: case 5: case 6:
             System.out.println("M�s pertence 2� trimestre");
             break;
          case 7: case 8: case 9:
             System.out.println("M�s pertence 3� trimestre");
             break;
          case 10: case 11: case 12:
             System.out.println("M�s pertence 4� trimestre");
             break;
          default: 
             System.out.println("C�digo do m�s inv�lido");
             break;
      }
      teclado.close();
   }
}