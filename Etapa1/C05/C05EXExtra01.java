package Etapa1.C05;

import java.util.Scanner;
        //calcular se um n�mero � um palindromo
        // N�o funciona com num�ros com zeros � esquerda
        // Autor Enzo Rocha Leite Diniz Riabs
public class C05EXExtra01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um n�mero de 4 digitos: ");
        String numeroInformadoStr = teclado.nextLine();

        if (numeroInformadoStr.length() != 4) {
            System.out.println("N�mero inv�lido. Digite um n�mero de 4 d�gitos");
            return;
        }

        int d1, d2, d3, d4, numeroInvertido, numeroInformado = Integer.parseInt(numeroInformadoStr);
        d1 = numeroInformado / 1000;
        d2 = numeroInformado / 100 % 10;
        d3 = numeroInformado / 10 % 10;
        d4 = numeroInformado % 10;

        numeroInvertido = d4 * 1000 + d3 * 100 + d2 * 10 + d1;

        System.out.println("N�mero Informado: "+numeroInformado+"\nN�mero Invertido: "+numeroInvertido+"\n");

        if (numeroInformado == numeroInvertido) {
            System.out.printf("%d � um Pal�ndromo", numeroInformado);
        } else {
            System.out.printf("%d n�o � um pal�ndromo.", numeroInformado);
        }
    }
}
