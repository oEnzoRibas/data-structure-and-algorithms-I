package Etapa2.C10;

import java.util.Scanner;

public class C10EX01 {
  public static void main(String[] args) {

    // Fazer Calcula m�dia das multas
    // Autor: Enzo Rocha Leite Diniz Ribas

    Scanner teclado = new Scanner(System.in);
    int num, cont = 0;
    double multa, soma = 0, media;


    do {

      System.out.println("Informe um n�mero: \nPara finalizar a execu��o digite : -1");
      num = teclado.nextInt();
      if (num != -1) {
        multa = (num * (0.1));
        System.out.println(multa);
        soma += multa;
        cont++;
      }
    } while (num != -1);
    media = soma/cont;
    System.out.println("M�dia das multas = "+media);
  }

}