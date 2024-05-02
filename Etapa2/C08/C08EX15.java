package Etapa2.C08;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class C08EX15 {
    public static void main(String[] args) {

        // Ler arquivo txt e retornar dados sobre funcion�rios
        // Autor: Enzo Rocha Leite Diniz Ribas

        File file = new File( "src/Etapa2/C08/C08EX15.txt" );

        try {
            Scanner arquivo = new Scanner(file).useLocale(Locale.FRANCE);

            String nome, cargo, senior, nomeMaiorSalStr = null, cargoMaiorSalStr = null;
            int idade, rep, cont18Anos = 0;
            double salario, medSal18, somaSal18 = 0, maiorSal = 0;


            rep = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o n�mero de pessoas que ser�o lidas: "));

            for (int i = 1; i <= rep; i++) {

                nome = arquivo.nextLine();

                cargo = arquivo.nextLine();

                salario = Double.parseDouble(arquivo.nextLine().replace(',', '.'));

                idade = Integer.parseInt(arquivo.nextLine());

                if (salario > 10000 && idade > 50){
                    senior = "Sim";
                } else{
                    senior = "N�o";
                }

                JOptionPane.showMessageDialog(null,"� S�nior?: "+senior);

                if (i == 1 || maiorSal < salario){
                    maiorSal = salario;
                    nomeMaiorSalStr = nome;
                    cargoMaiorSalStr = cargo;
                }

                if (idade <= 18){
                    cont18Anos++;
                    somaSal18 += salario;

                }

            }

            medSal18 = somaSal18/cont18Anos;
            JOptionPane.showMessageDialog(null,"M�dia dos Sal�rios dos funcion�rios at� 18 anos: "+medSal18);
            JOptionPane.showMessageDialog(null,"Funcion�rio com o maior sal�rio: \nNome: "+nomeMaiorSalStr+"\nCargo: "+cargoMaiorSalStr);


        } catch (FileNotFoundException e) {
            System.out.println( "\nArquivo n�o encontrado: " + e.getMessage() );
    }
}
}

