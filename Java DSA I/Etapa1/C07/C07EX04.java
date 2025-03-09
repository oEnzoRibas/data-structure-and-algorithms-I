package Etapa1.C07;

import javax.swing.*;
import java.util.Scanner;

public class C07EX04 {
    public static void main(String[] args) {
        String nome, estado;

        nome = JOptionPane.showInputDialog(null,"Informe o nome da equipe de futebol: ", "Pergunta", JOptionPane.QUESTION_MESSAGE);

        switch (nome){
            case "Am�rica", "Atl�tico", "Cruzeiro", "Villa Nova" ->
                estado = "Minas Gerais";
            case "Botafogo", "Flamengo","Fluminense", "Vasco" ->
                estado = "Rio de Janeiro";
            case "Corinthians", "Palmeiras", "Santos", "S�o Paulo" ->
                estado = "S�o Paulo";
            case "Gr�mio", "Internacional", "Juventudo" ->
                estado = "Rio Grande do Sul";
            case "N�utico", "Santa Cruz", "Sport" ->
                estado = "Pernambuco";
            default -> {
                    JOptionPane.showMessageDialog(null,"Insira um nome v�lido!","ERRO!",JOptionPane.WARNING_MESSAGE);
            return;
            }
        }
        JOptionPane.showMessageDialog(null,"O time pertence ao estado: "+estado, "Pergunta", JOptionPane.QUESTION_MESSAGE);
    }
}
