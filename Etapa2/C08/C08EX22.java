package Etapa2.C08;

import java.util.Scanner;

public class C08EX22 {
    public static void main(String[] args) {

        // Calcular se um n�mero � primo ou n�o
        // Autor: Enzo Rocha Leite Diniz Ribas

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um n�mero inteiro maior que zero: ");
        int contDiv = 0, num = teclado.nextInt();


        for (int i = 1; i <= num; i++){
            if (num%i == 0){
                contDiv++;
            }
        }
        if (contDiv <= 2){
            System.out.println("O n�mero "+num+" � primo.");
        }else System.out.println("O n�mero "+num+" n�o � primo.");
    }
}
