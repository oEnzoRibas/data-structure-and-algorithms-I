package Etapa1.C06;

import java.util.Scanner;

public class C06EX14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um n�mero inteiro de 4 d�gitos: ");
        int d1, d2, d3, d4, num = teclado.nextInt();
        if (num > 9999){
            System.out.println("N�MERO TEM QUE TER 4 D�GITOS");
        } else {
            d1 = num / 1000;
            d2 = num / 100 % 10;
            d3 = num / 10 % 10;
            d4 = num % 10;
            System.out.printf("%d%d%d%d", d4, d3, d2, d1);
        }
    }
}
