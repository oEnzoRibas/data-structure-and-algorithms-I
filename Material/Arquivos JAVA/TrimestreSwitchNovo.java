import java.util.Scanner;

public class TrimestreSwitchNovo {

	public static void main(String[] args) {
	      int mes;
	      Scanner teclado = new Scanner(System.in);
	      System.out.print("Entre com o n�mero do ano: ");
	      mes = teclado.nextInt();
	      switch (mes) {
	          case 1,2,3 ->
	             System.out.println("M�s pertence 1� trimestre");
	          case 4,5,6 ->
	             System.out.println("M�s pertence 2� trimestre");
	          case 7,8,9 ->
	             System.out.println("M�s pertence 3� trimestre");
	          case 10,11,12 ->
	             System.out.println("M�s pertence 4� trimestre");
	          default -> 
	             System.out.println("C�digo do m�s inv�lido");
	      }
	      teclado.close();
	}

}
