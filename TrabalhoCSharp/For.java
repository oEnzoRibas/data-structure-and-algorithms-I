package TrabalhoCSharp;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {


        // Exemplo de um for loop em Java.
        // @Autores: Enzo R. L. D. Ribas && Ana Luiza

        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva um n�mero -> ");
        numero = teclado.nextInt();

        System.out.println("Os n�meros pares at� "+ numero + "s�o: ");

        for (int i = 0; i < numero; i+= 2){
            System.out.println(i);
        }
        teclado.close();
    }
}
