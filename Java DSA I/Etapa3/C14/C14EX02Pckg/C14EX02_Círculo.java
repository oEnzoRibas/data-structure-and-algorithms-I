package C14EX02Pckg;

public class C14EX02_C�rculo {

    static double raio;
    public static double area() {

        System.out.println("Informe o raio do c�rculo: ");
        raio = C14EX02_Main.teclado.nextDouble();

        return Math.pow(raio,2) * Math.PI;
    }
}
