package Etapa3.C12;

import java.util.Scanner;

public class C12EX16 {
    public static void main(String[] args) {

    /*
    Ler cidades e as suas respetivas popula��es e orden�-las num ranking decrescente das 10 maiores cidades
    Autor: Enzo Rocha Leite Diniz Ribas
    */

        Scanner teclado = new Scanner(System.in);

        int qnt = 5, qntTop = 5;

        // cria��o das variaveis temp para ordena��o
        String cid[] = new String[qnt];
        String cidTemp;
        String est[] = new String[qnt];
        String estTemp;
        int pop[] = new int[qnt];
        int popTemp;

        //La�o de repeti��o de preenchimento dos vetores
        for (int i = 0; i < qnt; i++){

            System.out.println("Informe o nome da cidade: ");
            cid[i] = teclado.nextLine();
            System.out.println("Informe o nome da Estado: ");
            est[i] = teclado.nextLine();
            System.out.println("Informe a quantidade de habitantes da cidade: ");
            pop[i] = teclado.nextInt();
            teclado.nextLine();

        }

        // La�o de repeti��o de ordena��o dos vetores
        for (int k = 0; k < qntTop-1; k++){

            for (int j = 0; j < qnt-1; j++){
                if (pop[j] > pop[j+1]){

                    // ordena��o da popula��o
                    popTemp = pop[j];
                    pop[j] = pop[j+1];
                    pop[j+1] = popTemp;

                    // ordena��o da cidade
                    cidTemp = cid[j];
                    cid[j] = cid[j+1];
                    cid[j+1] = cidTemp;

                    // ordena��o do estado
                    estTemp = est[j];
                    est[j] = est[j+1];
                    est[j+1] = estTemp;

                }
            }
        }

        System.out.printf("Ranking das %d Maiores cidades: ",qntTop);

        //La�o de repeti��o para imprimir o Top selecionado do ranking:
        for (int h = (qnt-qntTop); h < qnt; h++){ // ordem decrecente
            System.out.printf("""
                    
                    Cidade: %s
                    Estado: %s
                    Popula��o: %d
                    
                    """,cid[h],est[h],pop[h]);
        }

    }
}
