package Etapa1.C06;

import java.util.Scanner;

public class C06EX12 {
    public static void main(String[] args) {
        //Cada CxPapelao comporta 10 Bolas
        //Cada Galp�o comporta at� 850 CxsPapelao
        Scanner teclado = new Scanner(System.in);

        int bolasProd, bolasDef, bolasAprov, mesesAteCopa;

        System.out.println("Informe a Quantidade de bolas que foram produzidas: ");
        bolasProd = teclado.nextInt();
        System.out.println("Informe a Quantidade de bolas que foram descartadas: ");
        bolasDef = teclado.nextInt();
        System.out.println("Informe a quantidade de meses restante at� a Copa: ");
        mesesAteCopa = teclado.nextInt();

        bolasAprov = bolasProd-bolasDef;

        double custoTotal, cxPapelao, precoCxPapelao, galpao, mesesAlugados, precoAluguel, custoCxPapelao, custoAluguel;
        System.out.println("Infome o pre�o unit�rio das caixas de papel�o: ");
        precoCxPapelao = teclado.nextDouble();
        System.out.println("Informe o valor mensal do aluguel: ");
        precoAluguel = teclado.nextDouble();

        cxPapelao = (double) bolasAprov /10;
        if (bolasAprov % 10 > 0) {
        cxPapelao++;
        }
        galpao = cxPapelao/850;
        if (galpao % 850 > 0) {
            galpao++;
        }
        mesesAlugados = mesesAteCopa * galpao;
        custoAluguel = mesesAlugados * precoAluguel;
        custoCxPapelao = cxPapelao*precoCxPapelao;
        custoTotal = custoAluguel+custoCxPapelao;
        System.out.printf("Custos \nAluguel: %1.3f \nCaixas de Papel�o %1.3f \nCusto Total %1.3f",custoAluguel,custoCxPapelao,custoTotal);
    }

}
