package Etapa2.C08;

import javax.swing.*;

public class C08EX09 {
    public static void main(String[] args) {

        // Calcular m�dia das idades dos homens e mulheres de uma amostra
        // Enzo Rocha Leite Diniz Ribas

        int contH = 0, contM = 0, idade, somaIdadeM = 0,somaIdadeF = 0, rep, genero;
        String nome;
        double mediaH, mediaM;

        // definir o nome das op��es
        Object[] options = {"Homem", "Mulher"};


        // definir o n�mero de repeti��es
        rep = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe a quantidade de pessoas que ser�o testadas: ",
                "PERGUNTA", JOptionPane.QUESTION_MESSAGE));

        for (int i = 1; i <= rep; i++){
            nome = JOptionPane.showInputDialog(null,"Informe Seu Nome: ","Pergunta",JOptionPane.QUESTION_MESSAGE);

            idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe sua Idade: "));

            genero = JOptionPane.showOptionDialog(null, "Voc� � Homem (H) ou Mulher (M)",
                    "Pergunta",JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,options,options[0]);

            String sexo;

            if (genero == 0){
                contH++;
                somaIdadeM += idade;
                sexo = "Masculino";
            }else {
                contM++;
                somaIdadeF += idade;
                sexo = "Feminino";
            }
            JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nSexo: "+sexo);
        }

        mediaH = (double) somaIdadeM / contH;
        mediaM = (double) somaIdadeF / contM;

        JOptionPane.showMessageDialog(null,
                "M�dia das idades dos Homens :"+mediaH+"\nM�dia das idades das Mulheres: "+mediaM,
                "M�DIAS", JOptionPane.INFORMATION_MESSAGE);

    }
}



