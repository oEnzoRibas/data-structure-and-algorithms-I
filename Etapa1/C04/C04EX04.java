package Etapa1.C04;

import javax.swing.*;

public class C04EX04 {
    public static void main(String[] args) {
        // Programa: Ficha do usu�rio com caixa de di�logo
        // Autor: Enzo Rocha Leite Diniz Ribas

        String sobrenome = JOptionPane.showInputDialog(null,
                "Qual � o seu sobrenome?:",
                "Pergunta 01",
                JOptionPane.QUESTION_MESSAGE);
        String nome = JOptionPane.showInputDialog(null,
                "Qual � o seu primeiro nome?:",
                "Pergunta 02",
                JOptionPane.QUESTION_MESSAGE);
        String segnome = JOptionPane.showInputDialog(null,
                "Qual � o seu segundo nome?:",
                "Pergunta 03",
                JOptionPane.QUESTION_MESSAGE);
        String idadeStr = JOptionPane.showInputDialog(null,
                "Qual � a sua idade:",
                "Pergunta 04",
                JOptionPane.QUESTION_MESSAGE);
        int idade = Integer.valueOf(idadeStr);

        JOptionPane.showMessageDialog(null,
                "\tSeu nome � "+sobrenome+", "+nome+" "+segnome+"\nSua idade � " +idade,
                "Ficha",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
