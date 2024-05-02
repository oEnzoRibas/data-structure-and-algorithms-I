package Etapa2.C08;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C08EX13 {
    public static void main(String[] args) {

        // MENSAGEM PARA O PROFESSOR RICARDO: Os dados foram inputados na ordem que o primeiro slide pedia, mulheres e depois homens.
        // No seu exemplo no segundo slide, os dados est�o invertidos, ent�o a quantidade de cidades com mais mulheres que homens ser� 2 e n�o 3

        // Ler uma tabela de uma cidade com dados sobre uma elei��o
        // Enzo Rocha Leite Diniz Ribas


        File file = new File("src/Etapa2/C08/C08EX13.txt");

        try {
            Scanner arquivo = new Scanner(file);

            String somaDifMsg, cidadeMenorPopStr = null;
            int rep, populacao, eleitores, mulheres, homens, contCid1M = 0, contMaisMul = 0, cidadeMenorPop = 0;
            double soma, porcEleitores;

            rep = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantas Cidades ser�o testadas: "));

            String cidade;
            for (int i = 1; i <= rep; i++) {
                cidade = arquivo.nextLine();
                populacao = arquivo.nextInt();
                eleitores = arquivo.nextInt();
                mulheres = arquivo.nextInt();
                homens = arquivo.nextInt();
                arquivo.nextLine();

                soma = homens + mulheres;

                if (soma != populacao) {
                    somaDifMsg = "SIM";
                } else
                    somaDifMsg = "N�O";

                porcEleitores = ((double) (eleitores * 100) / populacao);

                if (mulheres > homens){
                    contMaisMul++;
                }
                if (populacao > 1000000){
                    contCid1M++;
                }

                if (i == 1 || cidadeMenorPop > populacao){
                    cidadeMenorPop = populacao;
                    cidadeMenorPopStr = cidade;
                }

                JOptionPane.showMessageDialog(null,
                        "\nCidade: "+cidade+"\nSoma dos homens e mulheres � diferente da popula��o da cidade: "+somaDifMsg+
                                "\nPercentual de eleitores em rela��o a popula��o: "+porcEleitores+"%");
            }

            JOptionPane.showMessageDialog(null, "\nQuantidade Total de cidades com Popula��o acima de 1 Milh�o de habitantes: "+contCid1M+"\n"+
                            "Quantidade total de cidades cuja popula��o tem mais mulheres: "+contMaisMul+"\n"+
                            "A Cidade com menor popula��o �: "+cidadeMenorPopStr+" com um total de: "+cidadeMenorPop+" habitantes");

        } catch (
                FileNotFoundException e) {
            System.out.println("\nArquivo n�o encontrado: " + e.getMessage());
        }
    }
}
