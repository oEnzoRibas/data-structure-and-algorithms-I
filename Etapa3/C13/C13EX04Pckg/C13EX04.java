package Etapa3.C13.C13EX04Pckg;

import java.util.Scanner;

public class C13EX04 {
    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        int numAl, numAdv, cont = 0;

        Scanner teclado = new Scanner(System.in);

        numAl = (int) Math.floor(Math.random()*100);
        do {
            System.out.println("Tente adivinhar um n�mero entre 0 e 100: ");
            numAdv = teclado.nextInt();

            if (numAdv < numAl) {
                System.out.println("O n�mero � maior!!!");
                cont++;
            } else if(numAdv > numAl){
                System.out.println("O n�mero � menor!!!");
                cont++;
            }
        }while (numAdv != (numAl));
        System.out.println("Voc� acertou o n�mero!!!");
    }
}
