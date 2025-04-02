import conjunto.Conjunto;

public class Main {
    public static void main(String[] args) {
        int cardinalidadeA = 0; 
        int cardinalidadeB = 0;
        double[] A = new double[10];
        double[] B = new double[10];

        Conjunto conjunto = new Conjunto();
        
        System.out.println("Leitura dos elementos do conjunto A");
        cardinalidadeA = conjunto.lerElementos(A);
        System.out.println("Leitura dos elementos do conjunto B");
        cardinalidadeB = conjunto.lerElementos(B);

        System.out.println("Elementos do conjunto A:");
        conjunto.imprimirElementos(A, cardinalidadeA);

        System.out.println("Elementos do conjunto B:");
        conjunto.imprimirElementos(B, cardinalidadeB);
        
        System.out.println("União dos elementos do cojunto A e do conjunto B:");
        conjunto.uniao(A, B, cardinalidadeA, cardinalidadeB);

        System.out.println("Interseção dos elementos do conjunto A e do conjunto B:").
        conjunto.intersecao(A, B, cardinalidadeA, cardinalidadeB);

        System.out.println("Difença dos elementos do conjunto A e do conjunto B:");
        conjunto.diferenca(A, B, cardinalidadeA,cardinalidadeB);

        System.out.println("Produto cartesiano do conjunto A e do conjunto B:");
        conjunto.produtoCartesiano(A, B, cardinalidadeA, cardinalidadeB);

        System.out.println("Conjunto das Partes do conjunto A:");
        conjunto.conjuntoDasPartes(A, cardinalidadeA);

        System.out.println("Conjunto das Partes do conjunto B:");
        conjunto.conjuntoDasPartes(B, cardinalidadeB);
    }
}