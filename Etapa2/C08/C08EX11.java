package Etapa2.C08;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C08EX11 {
    public static void main(String[] args) {

        // Procurar por um loira padr�o
        // Autor: Enzo Rocha Leite Diniz Ribas


        Object[] genero = {"F - Feminino","M - Masculino"}, estadoC = {"S - Solteiro","C - Casado", "O - Outro"};
        Object[] olhos = {"A - Azuis","O - Outro", "C - Castanhos"}, cabelos = {"L - Loiro","P - Preto","C - Castanho", "R - Ruivos"};
        Object[] escolaridade = {"1 - Analfabeto", "2 - Ensino Fundamental", "3 - Ensino M�dio", "4 - Superior"};

        double salario, maiorSalH = 0, menorSalH = 0, maiorSal = 0, difSalH;

        int rep, idade, contLoiraPadrao = 0, generoInt, estadoCInt, olhosInt, cabelosInt, escolaridadeInt;

        String nome, nomeMaiorSal = null;

        try { // tenta declarar o dado inserido no JOptionPane dentro da var rep, tipo int
            rep = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Informe o n�mero de pessoas que ser�o testadas",
                    "Pergunta", JOptionPane.QUESTION_MESSAGE));
        } catch (NumberFormatException e) { // Caso o usuario nao informe um numero ele imprimir� uma mensagem sinalizando o erro

            System.out.println("\nDigite um valor v�lido: " + e.getMessage());
            return;
        }

        for (int i = 1; i <= rep; i++){

            // declarar as op��es por botoes

            nome = JOptionPane.showInputDialog(null,
                    "Informe o seu nome: ",
                    "Pergunta", JOptionPane.QUESTION_MESSAGE);

            idade = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Informe sua idade: ",
                    "Pergunta", JOptionPane.QUESTION_MESSAGE));

        generoInt = JOptionPane.showOptionDialog(null,
                "Qual � o Seu G�NERO?",
                "Pergunta",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,genero,genero[0]);

            estadoCInt = JOptionPane.showOptionDialog(null,
                    "Qual � o Seu Estado Civil?",
                    "Pergunta",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,estadoC,estadoC);

            olhosInt = JOptionPane.showOptionDialog(null,
                    "Qual � o a cor dos seus OLHOS?",
                    "Pergunta",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,olhos,olhos[0]);

            cabelosInt = JOptionPane.showOptionDialog(null,
                    "Qual � o a cor dos seus CABELOS?",
                    "Pergunta",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,cabelos,cabelos[0]);

            escolaridadeInt = JOptionPane.showOptionDialog(null,
                    "Qual � a sua escolaridade?",
                    "Pergunta",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,escolaridade, escolaridade[0]);

            salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe seu sal�rio","Pergunta",JOptionPane.QUESTION_MESSAGE));

            if (generoInt == 1) { // testar qual salario � maior e menor entre os homens
                if (i == 1 || maiorSalH < salario) {
                    maiorSalH = salario;
                }

                if (i == 1 || menorSalH > salario) {
                    menorSalH = salario;
                }
            }

            if ( generoInt == 0 && salario > 10000 && idade >= 18 && idade <= 25 && olhosInt == 0 && cabelosInt == 0 && escolaridadeInt == 3 && estadoCInt == 0){ // testar se � loira padrao

                contLoiraPadrao++;

            }

            if (i == 1 || maiorSal < salario) { //declarar a pessoa com maior salario
                maiorSal = salario;
                nomeMaiorSal = nome;
            }
        }

        difSalH = maiorSalH - menorSalH;

        JOptionPane.showMessageDialog(null,"Quantidade de mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, sal�rio maior que R$10.000,00 e curso superior completo: "+contLoiraPadrao+
                "\nNome da pessoa com maior sal�rio: "+nomeMaiorSal+
                "\nDiferente�a entre o maior e menor sal�rio dos homens: "+difSalH,
                "FICHA", JOptionPane.INFORMATION_MESSAGE);
    }

    }
