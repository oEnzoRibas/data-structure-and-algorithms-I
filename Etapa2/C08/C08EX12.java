package Etapa2.C08;

import javax.swing.*;
import java.util.Scanner;

public class C08EX12 {
    public static void main(String[] args) {

        // Calcular o total faturamento de uma loja em um período
        // Enzo Rocha Leite Diniz Ribas


        int rep, modelo;
        double somaTotal = 0, custo = 0;


        Object[] modeloBot = {"A2450","B2356","C3900","D4100","B6749"};

        try {
            rep = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de clientes que serão questionados", "Pergunta", JOptionPane.QUESTION_MESSAGE));
        }catch (NumberFormatException e){
            System.out.println("\nDigite um valor válido: " + e.getMessage());
            return;
        }

        for (int i = 1; i <= rep; i++) {
            modelo = JOptionPane.showOptionDialog(null,
                    "Informe o modelo que você comprou: ",
                    "Pergunta",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,modeloBot,modeloBot[0]);


            switch (modelo){
                case 0 -> custo = 1565;

                case 1 -> custo = 1890;

                case 2 -> custo = 2150;

                case 3 -> custo = 2963;

                case 4 -> custo = 3750;
            }
            somaTotal += custo;
        }

        JOptionPane.showMessageDialog(null,"Faturamento total do período: "+somaTotal);
    }
}
