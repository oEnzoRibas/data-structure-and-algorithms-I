package Etapa3.C12;

import java.util.Scanner;

public class C12EX15 {
    public static void main(String[] args) {

        /*
    Imprimir dados de um vetor em ordem alfabetica
    Autor: Enzo Rocha Leite Diniz Ribas
    */

        Scanner teclado = new Scanner(System.in);

        String temp;
        String[] mes = {"Janeiro","Fevereiro","Mar�o","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

        int cont = mes.length-1;

        /* M�todo da Bolha
        Esse m�todo ordena os valores num vetor comparando dupla por dupla
        O maior n�mero sempre � deixado mais a direita quando comparando qual � menor
        Repetir pela quantidade de posi��es do vetor -1;
         */
        for (int i = 0; i < mes.length-1; i++){
            for (int x = 0; x < cont; x++){

                /* este m�todo retorna um valor negativo caso seja alfabeticamente manor,
                se mantem 0 caso seja igual, e positivo caso seja alfabeticamente maior */
                if (mes[x].compareToIgnoreCase(mes[x+1]) > 0){

                    temp = mes[x];
                    mes[x] = mes [x+1];
                    mes[x+1] = temp;
                }
            }
            cont--;
        }
        // imprime o vetor em ordem alfab�tica
        for (int j = 0; j < mes.length; j++){
            System.out.println(mes[j]);
        }
    }
}
