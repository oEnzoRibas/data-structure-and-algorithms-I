package C14EX01Pckg;

public class C14EX01_CalculaDistancia2Pontos {

    // Calcular distancias entre dois pontos no plano cartesiano
    // Autor: Enzo Rocha Leite Diniz Ribas
    public static void DistXY(int x1, int y1, int x2, int y2) {
        double distancia = (Math.pow((Math.pow((x1 - x2), 2) + (Math.pow((y1 - y2), 2))), 1.0 / 2));
        System.out.printf("x1 = %d\nx2 = %d\ny1 = %d\ny2 = %d\n\nO ponto 1 está a uma distancia de " + distancia + " unidade(s) do ponto 2. ",x1, x2, y1, y2);
    }
}
