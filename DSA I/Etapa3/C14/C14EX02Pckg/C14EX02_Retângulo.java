package C14EX02Pckg;

import java.util.Scanner;

public class C14EX02_Ret�ngulo {

    static double lado1, lado2;
    public static double area() {

        System.out.println("Informe o lado 1 do ret�ngulo: ");
        lado1 = C14EX02_Main.teclado.nextDouble();

        System.out.println("Informe o lado 2 do ret�ngulo: ");
        lado2 = C14EX02_Main.teclado.nextDouble();
        return lado1*lado2;
    }
}
