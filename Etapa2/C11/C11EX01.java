package Etapa2.C11;

import javax.swing.*;

public class C11EX01 {
  public static void main(String[] args) {

    // Calcular classifica��o de clientes de uma financeira
    // Autor: Enzo Rocha Leite Diniz Ribas

    int x, rep;
    double soma = 0, cont = 0, funcao;

    rep = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o �ltimo valor de X: "));


    for (x = 1; x <= rep; x+=2, cont++){

      funcao = Math.pow(x,2) + (double) ((4 * x) - 2) / 5 ;
      soma += funcao;
      JOptionPane.showMessageDialog(null,"Para X = "+x+"\n Y = "+funcao," F(X)",JOptionPane.INFORMATION_MESSAGE);

    }

    double media = soma / cont;
    JOptionPane.showMessageDialog(null,"M�dia dos valores de f(x) = "+media+" ("+soma+" / "+cont+")","Resposta",JOptionPane.INFORMATION_MESSAGE);


  }
}
