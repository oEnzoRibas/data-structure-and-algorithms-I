package Etapa2.C09;

import java.util.Scanner;

public class C09EX05 {
    public static void main(String[] args) {

        // Fazer a serie matematica
        // Autor: Enzo Rocha Leite Diniz Ribas

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o n�mero de termos que voc� quer testar: ");

        int rep = teclado.nextInt(), passo = 1;
        double serie = 0, num , den;

        for (int aux = 1; aux <= rep; aux+=passo){
            num = ((aux-1)*2)+(aux*3);
            den = ((aux-1)*6)+7;
            serie += (num/den);
        }
        System.out.println(5*(serie));
    }
}
