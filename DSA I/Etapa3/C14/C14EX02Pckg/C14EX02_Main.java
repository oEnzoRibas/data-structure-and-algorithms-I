package C14EX02Pckg;

import java.util.Scanner;

public class C14EX02_Main {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        Sistema de Classes com Menu em POO
        Autor: Enzo Rocha Leite Diniz Ribas
         */

        int resp;

        System.out.println("""
                Selecione uma figura geom�trica:
                
                1 - Quadrado
                2 - Ret�ngulo
                3 - Tri�ngulo Ret�ngulo
                4 - C�rculo
                
                """);
        resp = teclado.nextInt();

        switch (resp){
            case 1: System.out.println("�rea = "+C14EX02_Quadrado.area()); break;
            case 2: System.out.println("�rea = "+C14EX02_Ret�ngulo.area()); break;
            case 3: System.out.println("�rea = "+C14EX02_Tri�nguloRet�ngulo.area()); break;
            case 4: System.out.println("�rea = "+C14EX02_C�rculo.area()); break;
        }
    }
}
