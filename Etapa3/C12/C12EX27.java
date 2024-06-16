package Etapa3.C12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX27 {
    public static void main(String[] args) {

        /*
        Pesquisa e atualiza��o de itens numa lista din�mica.
        Autor: Enzo Rocha Leite Diniz Ribas
         */

        Scanner teclado = new Scanner(System.in);

        List<String> enderecoArrLst = new ArrayList<>();
        List<Integer> CPFArrLst = new ArrayList<>();
        String endereco, resp;
        int CPF, CPFpes;


        System.out.println("Para encerrar o cadastro digite '0' no CPF");
        do {

            System.out.println("Informe o CPF: ");
            CPF = teclado.nextInt();
            teclado.nextLine();

            if (CPF != 0) {
                System.out.println("Informe o Endere�o: ");
                endereco = teclado.nextLine();


                CPFArrLst.add(CPF);
                enderecoArrLst.add(endereco);
            }

        } while (CPF != 0);

        System.out.println("Informe um CPF a ser pesquisado: ");
        CPFpes = teclado.nextInt();
        teclado.nextLine();


        if (CPFArrLst.contains(CPFpes)) {

            do {


                System.out.println("CPF encontrado.\nVoc� gostaria de atualiza-lo com um novo endere�o? (S/N)");
                resp = teclado.nextLine();
                if (resp.equalsIgnoreCase("S")) {
                    System.out.println("Informe o Endere�o: ");
                    endereco = teclado.nextLine();
                    enderecoArrLst.add(CPFArrLst.indexOf(CPFpes), endereco);
                } else if (resp.equalsIgnoreCase("N")) {
                } else {
                    System.out.println("Resposta Invalida!");
                }
            } while (!(resp.equalsIgnoreCase("N") || resp.equalsIgnoreCase("S")));


        } else {

            do {
                System.out.println("CPF n�o encontrado.\nVoc� gostaria de adiciona-lo � lista com um novo endere�o? (S/N)");
                resp = teclado.nextLine();
                if (resp.equalsIgnoreCase("S")) {
                    CPFArrLst.add(CPFpes);
                    System.out.println("Informe o Endere�o: ");
                    endereco = teclado.nextLine();
                    enderecoArrLst.add(endereco);
                } else if (resp.equalsIgnoreCase("N")) {
                } else {
                    System.out.println("Resposta Invalida!");
                }
            } while (!(resp.equalsIgnoreCase("N") || resp.equalsIgnoreCase("S")));

        }

        for (int i = 0; i < CPFArrLst.size(); i++) {
            System.out.printf("\nCPF: %d \nEndere�o : %s\n", CPFArrLst.get(i), enderecoArrLst.get(i));
        }
    }
}
