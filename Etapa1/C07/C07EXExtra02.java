package Etapa1.C07;

import javax.swing.*;

public class C07EXExtra02 {
    public static void main(String[] args) {
        String tipo, cartao, tipoDePagamento, vlrDesc;
        double qnt, subtotal, valorKg = 0, conta;

        tipo = JOptionPane.showInputDialog(null,"Informe o tipo de carne que voc� est� comprando: \nFile Duplo\nAlcatra\nPicanha", "Pergunta", JOptionPane.QUESTION_MESSAGE);
        switch (tipo) {
            case "File Duplo", "Alcatra", "Picanha" ->{

            }default -> {
                JOptionPane.showMessageDialog(null,"INFORME UM VALOR V�LIDO!");
                return;
            }
        }


        qnt = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a quantidade de carne que voc� est� comprando em Kg: ", "Pergunta", JOptionPane.QUESTION_MESSAGE));
        if (qnt < 0){
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR V�LIDO!");
            return;
        }


        cartao = JOptionPane.showInputDialog(null,"Voc� vai comprar com o cart�o Tabajara?: ", "Pergunta", JOptionPane.QUESTION_MESSAGE);
        switch (cartao) {
            case String s when cartao.equalsIgnoreCase("n") || cartao.equalsIgnoreCase("nao")  -> {

            }
            case String s when cartao.equalsIgnoreCase("s") || cartao.equalsIgnoreCase("sim") -> {

            }

            default -> {
                JOptionPane.showMessageDialog(null,"INFORME UM VALOR V�LIDO!");
                return;
            }
        }



        switch (tipo){
            case "File Duplo" -> {
                if (qnt <= 5){
                    valorKg = 4.90;
                }else {
                    valorKg = 5.80;
                }
            }
            case  "Alcatra" -> {
            if (qnt <= 5){
                valorKg = 5.90;
            }else {
                valorKg = 6.80;
            }
            }
            case "Picanha" -> {
                if (qnt <= 5){
                    valorKg = 6.90;
                }else {
                    valorKg = 7.80;
                }
            }
        }
        subtotal = valorKg*qnt;
        switch (cartao) {
            case "Sim","S","sim","s" ->{
                conta = (valorKg*qnt)*(95.0 / 100);
                tipoDePagamento = "Cart�o Tabajara";
                vlrDesc = "5%";
            }default -> {
                conta = valorKg*qnt;
                tipoDePagamento = "Cart�o Tabajara";
                vlrDesc = "0";
            }
        }
        JOptionPane.showMessageDialog(null,"Tipo de carne: "+tipo+"\nQuantidade (Kg): "+qnt+
                "\nPre�o Total: "+subtotal+"\nTipo De Pagamento: "+tipoDePagamento+
                "\nValor do Desconto: "+vlrDesc+"\nValor a pagar: "+conta,"NOTA FISCAL", JOptionPane.INFORMATION_MESSAGE);
    }
}
