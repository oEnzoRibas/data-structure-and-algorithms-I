package Etapa1.C06;

import javax.swing.*;
import java.util.Scanner;
// Calcular sal�rio comissionado
// Autor: Enzo Rocha Leite Diniz Ribas
public class C06EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double vendas, salario, salarioBase= 240, comissao = 0;
        System.out.println("Digite o valor das vendas feitas nesse m�s: ");
        vendas = teclado.nextDouble();
        if (vendas <= 1000){
            comissao = 0;
        }else if (vendas > 1000 && vendas < 10000){
            comissao = vendas*0.1;
        }else if (vendas > 10000){
            comissao = 1000;
        }
        salario = (salarioBase+comissao);

        JOptionPane.showMessageDialog(null, "\nSal�rio Base: R$"+salarioBase+"\nComiss�o de Vendas: R$"+comissao+"\nSal�rio Total: "+salario,
                "Sal�rio",
                JOptionPane.INFORMATION_MESSAGE);

        System.out.printf("\nSal�rio Base: R$"+salarioBase+"\nComiss�o de Vendas: R$"+comissao+"\nSal�rio Total: "+salario);


    }
}
