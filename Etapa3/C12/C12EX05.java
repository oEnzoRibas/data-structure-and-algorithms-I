package Etapa3.C12;

import java.util.Scanner;

public class C12EX05 {
    public static void main(String[] args) {

        /*
        Procurar valor dentro de um vetor
        Autor: Enzo Rocha Leite Diniz Ribas
         */

        int[] vet = new int[100];
        int nunInf, pos = -1;

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i< vet.length; i++){
            System.out.println("Informe um n�mero inteiro: ");
            vet[i] = teclado.nextInt();
        }

        System.out.println("Informe um n�mero a ser pesquisado: ");
        nunInf = teclado.nextInt();

        for (int k = 0; k< vet.length; k++){
            if (vet[k] == nunInf){
                pos = k+1;
            }
        }
        if (pos == -1){
            System.out.println("Valor N�o Encontrado");
        }else {
            System.out.printf( "Numero '%d' encontado na posi��o '%d'",nunInf,pos );;
        }
    }
}
