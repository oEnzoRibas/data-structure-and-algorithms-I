package Etapa3.C13.C13EXExtra03Pckg;

import java.util.Scanner;

public class C13EXExtra03_Main {
    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        Scanner teclado = new Scanner(System.in);

        double salario;
        int qntDep;
        String nome = null;

        int resp;
        do {
            System.out.printf("""
                    
                    Bem vindo à tabela de IRPF
                    
                    Escolha uma opção:
                    
                    1 - Cadastrar novo nome
                    2 - Imprimir tabela
                    
                    
                    Digite -1 para sair;
                    """);
            resp = teclado.nextInt();
            teclado.nextLine();

            switch (resp){

                case 1 -> {
                    System.out.println("Informe o nome:");
                    nome = teclado.nextLine();

                    System.out.println("Informe seu salário: ");
                    salario = teclado.nextDouble();
                    teclado.nextLine();

                    System.out.println("Informe a quantidade de dependetes: ");
                    qntDep = teclado.nextInt();
                    teclado.nextLine();
                    C13EXExtra03_IRPFFicha.addFicha(nome, salario, qntDep);
                }
                case 2 -> {
                    C13EXExtra03_IRPFFicha.printFichaAlfBt();
                }
            }
        }while (resp != -1);

        teclado.close();
    }
}
