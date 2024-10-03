package Etapa2.C11;

import javax.swing.*;

public class C11EX02c {
    public static void main(String[] args) {

        // Calcular classifica��o de clientes de uma financeira com n�mero de repeti��es indefinido e flag ficticio
        // Autor: Enzo Rocha Leite Diniz Ribas

        String clas, nome, nomeMnrApl = null;
        double vlrApl, somaVlrAplBro = 0, vlmTotalApl = 0, mnrApl = 0, mediaBro = 0;
        int qntCliPra = 0, qntCliOur = 0, qntCliBro = 0, i = 1;

        JOptionPane.showMessageDialog(null,
                "Informe seu 'X' para encerrar o programa","AVISO",JOptionPane.WARNING_MESSAGE);
        
        nome = JOptionPane.showInputDialog(null,
                "Informe seu NOME: ","Pergunta",JOptionPane.QUESTION_MESSAGE);
        
        while (!(nome.equalsIgnoreCase("X"))){

            vlrApl = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Informe o VALOR APLICADO: ","Pergunta",JOptionPane.QUESTION_MESSAGE));

            // Atribui��o das classes ao cliente
            if (vlrApl <= 1000){
                clas = "Bronze";
                qntCliBro++;
                somaVlrAplBro += vlrApl;
            } else if (vlrApl > 1000 && vlrApl <= 5000) {
                clas = "Prata";
                qntCliPra++;
            } else {
                clas = "Ouro";
                qntCliOur++;
            }

            vlmTotalApl += vlrApl;
            mediaBro = somaVlrAplBro / qntCliBro;

            //Calculo da menor aplica��o, ocorrendo apenas quando o valor atual for menor ou for a primeira repeti��o
            if ( i == 1 || mnrApl > vlrApl ){
                mnrApl = vlrApl;
                nomeMnrApl = nome;
            }

            //Comando para impedir que a vari�vel i some mais de uma vez, por n�o ser necess�rio.
            if (i == 1){
                i++;
            }

            JOptionPane.showMessageDialog(null,
                    "Nome: "+nome+"\nClassifica��o: "+clas);

            nome = JOptionPane.showInputDialog(null,
                    "Informe seu NOME: ","Pergunta",JOptionPane.QUESTION_MESSAGE);
        }

        JOptionPane.showMessageDialog(null,
                "Quantidade de clientes Classifica��o: Bronze: "+qntCliBro+
                        "\nQuantidade de clientes Classifica��o: Prata: "+qntCliPra+
                        "\nQuantidade de clientes Classifica��o: Ouro: "+qntCliOur,"Ficha",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "M�dia dos valores Aplicados em Bronze: "+mediaBro,"Ficha",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "Volume total de aplica��es: "+vlmTotalApl,"Ficha",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "Cliente com a menor aplica��o: "+nomeMnrApl,"Ficha",JOptionPane.INFORMATION_MESSAGE);

    }
}
