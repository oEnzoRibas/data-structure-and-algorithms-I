package Etapa3.C13.C13EX03Pckg;

import java.util.Scanner;

public class C13EX03_Main {
    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        long num;
        int index;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um n�mero positivo ou nulo de at� 9 d�gitos: ");
        num = teclado.nextLong();

        while ((num > 999999999 || num < -0) ){
            System.out.println("N�mero inv�lido!!!");
            System.out.println("Informe um n�mero de at� 9 d�gitos: ");
            num = teclado.nextLong();
        }

        System.out.println("Informe a posi��o que voc� deseja saber: ");
        index = teclado.nextInt();

        System.out.println(C13EX03_Decompositor.decomp(num,index));
    }
}
