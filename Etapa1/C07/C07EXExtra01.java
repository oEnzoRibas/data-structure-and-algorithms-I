package Etapa1.C07;

import javax.swing.*;

public class C07EXExtra01 {
    public static void main(String[] args) {
        // Interrogat�rio sobre um assassinato
        // Autor: Enzo Rocha Leite Diniz Ribas

        String telefonou, local, mora, devia, trabalhou, classificacao;
        int cont = 0;

        JOptionPane.showMessageDialog(null,"RESPONDA AS PERGUNTAS APENAS COM S (SIM) OU N (N�O)");

        telefonou = JOptionPane.showInputDialog(null,"Voc� telefonou para a v�tima?", "Pergunta", JOptionPane.QUESTION_MESSAGE);
        if ( !(telefonou.equalsIgnoreCase("S") || telefonou.equalsIgnoreCase("N")) ){
         JOptionPane.showMessageDialog(null,"RESPONDA AS PERGUNTAS APENAS COM S (SIM) OU N (N�O)");
        return;
        }
        local = JOptionPane.showInputDialog(null,"Voc� esteve no local do crime?", "Pergunta", JOptionPane.QUESTION_MESSAGE);
        if ( !(local.equalsIgnoreCase("S") || local.equalsIgnoreCase("N")) ){
            JOptionPane.showMessageDialog(null,"RESPONDA AS PERGUNTAS APENAS COM S (SIM) OU N (N�O)");
            return;
        }
        mora = JOptionPane.showInputDialog(null,"Voc� mora perto da v�tima?", "Pergunta", JOptionPane.QUESTION_MESSAGE);
        if ( !(mora.equalsIgnoreCase("S") || mora.equalsIgnoreCase("N")) ){
            JOptionPane.showMessageDialog(null,"RESPONDA AS PERGUNTAS APENAS COM S (SIM) OU N (N�O)");
            return;
        }
        devia = JOptionPane.showInputDialog(null,"Voc� Devia para a v�tima?", "Pergunta", JOptionPane.QUESTION_MESSAGE);
        if ( !(devia.equalsIgnoreCase("S") || devia.equalsIgnoreCase("N")) ){
            JOptionPane.showMessageDialog(null,"RESPONDA AS PERGUNTAS APENAS COM S (SIM) OU N (N�O)");
            return;
        }
        trabalhou = JOptionPane.showInputDialog(null,"Voc� j� trabalhou com a v�tima?", "Pergunta", JOptionPane.QUESTION_MESSAGE);
        if ( !(trabalhou.equalsIgnoreCase("S") || trabalhou.equalsIgnoreCase("N")) ){
            JOptionPane.showMessageDialog(null,"RESPONDA AS PERGUNTAS APENAS COM S (SIM) OU N (N�O)");
            return;
        }
        if (telefonou.equalsIgnoreCase("S")){
            cont++;
        }
        if (local.equalsIgnoreCase("S")){
            cont++;
        }
        if (mora.equalsIgnoreCase("S")){
            cont++;
        }
        if (devia.equalsIgnoreCase("S")){
            cont++;
        }
        if (trabalhou.equalsIgnoreCase("S")){
            cont++;
        }
        switch (cont){
            case 2 ->
                classificacao = "SUSPEITO";
            case 3, 4 ->
                classificacao = "C�MPLICE";
            case 5 ->
                classificacao = "ASSASSINO";
            default ->
                classificacao = "INOCENTE";
        }
        JOptionPane.showMessageDialog(null, "VOC� EST� CLASSIFICADO COMO: "+classificacao, "RESULTADO",JOptionPane.WARNING_MESSAGE);
    }
}
