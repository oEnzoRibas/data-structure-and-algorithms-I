package C14EX02Pckg;

public class C14EX02_Tri�nguloRet�ngulo {

    static double altura, base;
    public static double area() {

        System.out.println("Informe a altura do tri�ngulo ret�ngulo: ");
        altura = C14EX02_Main.teclado.nextDouble();

        System.out.println("Informe a base do tri�ngulo ret�ngulo: ");
        base = C14EX02_Main.teclado.nextDouble();
        return (altura * base)/2;
    }

}
