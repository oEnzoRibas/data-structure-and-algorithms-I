package Etapa3.C13.C13EX08Pckg;

import java.util.Scanner;

public class C13EX08 {
    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        String nome, sobrenome;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu nome completo: ");
        nome = teclado.nextLine().trim();

        String [] nomeVet = nome.split(" ");

        // Transforma o �ltimo nome em mai�sculo
        sobrenome = nomeVet[nomeVet.length - 1].toUpperCase();

        // String builder cria uma string de uma maneira mais efici�nte para manipula��o
        StringBuilder iniciais = new StringBuilder();
        for (int i = 0; i < nomeVet.length - 1; i++) {
            /* Append adiciona a String iniciais uma substring que contem a posi��o 0 do nome (i) que est� no vetor nomeVet (Inicial do nome)
            concatenado de um ponto de abrevia��o
            */
            iniciais.append(nomeVet[i].charAt(0)).append(". ");
        }
        String iniciaisFormat = iniciais.toString().toUpperCase().trim();


        System.out.printf("""
                Nome no padr�o ABNT:
                %s, %s""",sobrenome,iniciaisFormat);
    }
}
