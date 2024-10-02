package TrabalhoCSharp;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva um número -> ");
        numero = teclado.nextInt();

        System.out.println("Os números pares até "+ numero + "são: ");

        for (int i = 0; i < numero; i+= 2){
            System.out.println(i);
        }
        teclado.close();
    }
}
