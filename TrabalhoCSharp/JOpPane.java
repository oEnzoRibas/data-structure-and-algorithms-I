package TrabalhoCSharp;

import javax.swing.*;

public class JOpPane {
    public static void main(String[] args) {


        // Exemplo de janela de di�logo em Java.
        // @Autores: Enzo R. L. D. Ribas && Ana Luiza

        Object[] resp = {"Sim", "N�o"};
        int resposta;

        JOptionPane.showMessageDialog(null, "Ol�, Mundo!");

        resposta = JOptionPane.showOptionDialog(null,
                "Voc� Gostaria de Continuar?",
                "Pergunta",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, resp, resp[0]);

        switch (resposta) {
            case 1 -> System.out.println("O Usu�rio escolheu N�o");
            case 0 -> System.out.println("O Usu�rio escolheu Sim");
        }

    }
}