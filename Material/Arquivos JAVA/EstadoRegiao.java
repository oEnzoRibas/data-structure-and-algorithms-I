import java.util.Scanner; 
public class EstadoRegiao {
   public static void main(String[] args) {
      String estado;
      Scanner teclado = new Scanner(System.in);
      System.out.print("Entre com o nome de um estado do Brasil: ");
      estado = teclado.nextLine();
      switch (estado) {
          case "Amazonas": case "Par�": case "Acre": // completar com os demais estados
             System.out.println("Regi�o Norte");
             break;
          case "Piau�": case "Cear�": case "Recife": // completar com os demais estados
             System.out.println("Regi�o Nordeste");
             break;
          // completar com as demais regi�es
          default: 
             System.out.println("Estado inv�lido");
             break;
      }
      teclado.close();
   }
}

