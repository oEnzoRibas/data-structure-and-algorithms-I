package Etapa1.C06;

import javax.swing.*;
import java.util.Objects;

public class C06EX17 {
    public static void main(String[] args) {

        // Question�rio de admiss�o de um empresa
        // Autor: Enzo Rocha Leite Diniz Ribas

        String tecPro, supPro, menos3AnosXp, criativo, liderar, sozinho, autodidata, remuneracao, soBH;

        JOptionPane.showMessageDialog(null,"Responda as perguntas a seguir com V (VERDADEIRO) ou F (FALSO).");

        //Ler informa��es dadas pelo usu�rio
        tecPro = JOptionPane.showInputDialog(null,"Voc� tem curso t�cnico de programa��o? ", "Pergunta ", JOptionPane.QUESTION_MESSAGE);
        //Abortar o programa caso o usu�rio digite uma informa��o inv�lida.
        if (!((tecPro.equalsIgnoreCase("V")) || (tecPro.equalsIgnoreCase( "F") ) ) ) {
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR V�LIDO.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        }

        supPro = JOptionPane.showInputDialog(null,"Voc� tem curso superior de programa��o? ", "Pergunta ", JOptionPane.QUESTION_MESSAGE);
        if (!((supPro.equalsIgnoreCase("V")) || (supPro.equalsIgnoreCase( "F") ) ) ) {
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR V�LIDO.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        }

        menos3AnosXp = JOptionPane.showInputDialog(null,"Voc� tem menos de 3 anos de experi�ncia em programa��o? ", "Pergunta ", JOptionPane.QUESTION_MESSAGE);
        if (!((menos3AnosXp.equalsIgnoreCase("V")) || (menos3AnosXp.equalsIgnoreCase( "F") ) ) ) {
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR V�LIDO.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        }

        criativo = JOptionPane.showInputDialog(null,"Voc� se considera uma pessoa criativa? ", "Pergunta ", JOptionPane.QUESTION_MESSAGE);
        if (!((criativo.equalsIgnoreCase("V")) || (criativo.equalsIgnoreCase( "F") ) ) ) {
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR V�LIDO.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        }

        liderar = JOptionPane.showInputDialog(null,"Voc� prefere liderar a ser liderado? ", "Pergunta ", JOptionPane.QUESTION_MESSAGE);
        if (!((liderar.equalsIgnoreCase("V")) || (liderar.equalsIgnoreCase( "F") ) ) ) {
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR V�LIDO.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        }

        sozinho = JOptionPane.showInputDialog(null,"Voc� prefere trabalhar sozinho a trabalhar em equipe? ", "Pergunta ", JOptionPane.QUESTION_MESSAGE);
        if (!((sozinho.equalsIgnoreCase("V")) || (sozinho.equalsIgnoreCase( "F") ) ) ) {
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR V�LIDO.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        }

        autodidata = JOptionPane.showInputDialog(null,"Voc� � autodidata? ", "Pergunta ", JOptionPane.QUESTION_MESSAGE);
        if (!((autodidata.equalsIgnoreCase("V")) || (autodidata.equalsIgnoreCase( "F") ) ) ) {
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR V�LIDO.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        }

        remuneracao = JOptionPane.showInputDialog(null,"Voc� aceitaria uma remunera��o inicial de R$1500,00? ", "Pergunta ", JOptionPane.QUESTION_MESSAGE);
        if (!((remuneracao.equalsIgnoreCase("V")) || (remuneracao.equalsIgnoreCase( "F") ) ) ) {
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR V�LIDO.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        }

        soBH = JOptionPane.showInputDialog(null,"Voc� s� aceitaria trabalhar em escrit�rios da empresa dentro da granda BH? ", "Pergunta ", JOptionPane.QUESTION_MESSAGE);
        if (!((soBH.equalsIgnoreCase("V")) || (soBH.equalsIgnoreCase( "F") ) ) ) {
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR V�LIDO.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        }

        //Comparar Respostas para ver se a pessoa est� apta
        if (((soBH.equalsIgnoreCase("V"))) || (sozinho.equalsIgnoreCase("V")) || (autodidata.equalsIgnoreCase("F")) || (criativo.equalsIgnoreCase("F"))){
            JOptionPane.showMessageDialog(null,"Voc� N�O est� apto a trabalhar na empresa.", "Aptid�o", JOptionPane.WARNING_MESSAGE);
        }else if ( supPro.equalsIgnoreCase("F") ){
            //Se n�o tiver superior, por�m tiver tecnico E 3 anos ou mais de experiencia retona verdadeiro
            if (!((tecPro.equalsIgnoreCase("V")) && (menos3AnosXp.equalsIgnoreCase("F")))){

                JOptionPane.showMessageDialog(null,"Voc� N�O est� apto a trabalhar na empresa.", "Aptid�o", JOptionPane.WARNING_MESSAGE);

            }
        } if ( (liderar.equalsIgnoreCase("V")) && (remuneracao.equalsIgnoreCase("V")) ){
            JOptionPane.showMessageDialog(null,"Voc� N�O est� apto a trabalhar na empresa.", "Aptid�o", JOptionPane.WARNING_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null,"Voc� EST� apto a trabalhar na empresa.", "Aptid�o", JOptionPane.WARNING_MESSAGE);
        }
    }
}
