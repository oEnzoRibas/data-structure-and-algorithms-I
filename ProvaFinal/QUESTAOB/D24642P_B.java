package ProvaFinal.QUESTAOB;


import java.util.Scanner;

public class QUESTION_B {

    /*
    Autor: Enzo Rocha Leite Diniz Ribas
    Matricula ******
    QUESTÃO B CLASSE PRINCIPAL
     */

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        String frase;
        System.out.println("Informe uma frase: ");
        frase = teclado.nextLine();
        System.out.println(D24642S_B.criptografa(frase));

    }
}
