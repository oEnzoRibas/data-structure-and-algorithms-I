package Etapa2.C10;

import java.util.Scanner;

public class C10EX03 {
  public static void main(String[] args) {

    // Calcular e a m�dia, raio total e quantidade de valores acima de 1000
    // Autor: Enzo Rocha Leite Diniz Ribas

    Scanner teclado = new Scanner(System.in);
    double raio, soma = 0, setor, alfa;
    int cont = 0, cont1000 = 0;

    System.out.println("Informe o raio do �ngulo alfa: ");
    alfa = teclado.nextDouble();

    do {

      System.out.println("Informe o raio do raio: \nPara finalizar o programa digite = '-1'");
      raio = teclado.nextDouble();

      if (raio != -1){

        setor = ( alfa*(Math.PI) * ( Math.pow(raio,2) ) ) / 360;

        System.out.println("R = "+raio+" -> �rea do setor: "+setor);
      } else {
        System.out.println("PROGRAMA FINALIZADO");
      }

    } while (raio != -1);

  }
}
