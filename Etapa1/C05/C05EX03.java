package Etapa1.C05;

import java.util.Scanner;
// Calcular Valor Retido Imposto de Renda
// Autor: Enzo Rocha Leite Diniz Ribas
public class C05EX03 {
    public static void main(String[] args) {
        double salarioDoub, liquido, impostoderenda;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu sal�rio: ");
        String salarioStr = teclado.nextLine();
        salarioDoub = Double.valueOf(salarioStr);
        System.out.println("Digite o n�mero de dependentes: ");
        String numDepStr = teclado.nextLine();
        int numDep = Integer.valueOf(numDepStr);
        liquido = (salarioDoub-(numDep*60));
        impostoderenda = (liquido*(15/100.0));
        System.out.println("Valor retido de Imposto de Renda = "+impostoderenda);

    }
}
